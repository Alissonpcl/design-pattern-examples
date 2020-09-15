package br.com.alissonlima.designpatterns.processos;

import br.com.alissonlima.designpatterns.domain.Conta;
import br.com.alissonlima.designpatterns.notificacoes.EmailNotificacao;
import br.com.alissonlima.designpatterns.operacoes.Operacao;
import br.com.alissonlima.designpatterns.operacoes.OperacaoFactory;
import br.com.alissonlima.designpatterns.operacoes.TipoOperacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//Esta classe é uma demonstração pratica do Pattern Facade.
//Veja o método sacarValor.
public class MovimentacaoFinanceira {
    private final List<MovimentacaoFinanceiraObserver> observers;

    public MovimentacaoFinanceira() {
        observers = new ArrayList<>();
    }

    //Este método consome a lógica de vários métodos de outras classes
    //que possuem responsabilidades bastante especificas.
    //Essa simplificação de consumo de métodos, que faz com que uma regra de
    //negocio complexa possa ser facilmente consumida por outras classes é
    //uma aplicação do Pattern Facade.
    public boolean sacarValor(Conta conta, BigDecimal valor) throws MovimentacaoFinanceiraException{
        if (conta.getSaldo().compareTo(valor) < 0){
            throw new MovimentacaoFinanceiraException("Sem saldo suficiente");
        }

        //Utiliza prática do Pattern Factory
        Operacao operacao = OperacaoFactory.criarOperacao(TipoOperacao.DEBITO);
        operacao.realizarOperacao(conta, valor);

        //Aqui esta a logica que coloca o Pattern Observer em prática.
        //Todos os Observers registrados serao notificados e poderao
        //executar suas ações.
        observers.forEach(movimentacaoFinanceiraObserver ->
                movimentacaoFinanceiraObserver.movimentacaoRealizada(conta, TipoOperacao.DEBITO, valor));

        EmailNotificacao.notificarPorEmail(conta, TipoOperacao.DEBITO, valor);

        return true;
    }

    //Os metodos abaixo demonstram o Pattern Observer em pratica.
    //Com eles e possivel registrar objetos que estarao observando
    //as movimentacoes financeiras realizadas por esta classe para
    //executar uma acao.
    //Veja a classe MovimentacaoLog.
    public void registerObserver(MovimentacaoFinanceiraObserver movimentacaoFinanceiraObserver){
        observers.add(movimentacaoFinanceiraObserver);
    }

    public void removeObserver(MovimentacaoFinanceiraObserver movimentacaoFinanceiraObserver){
        observers.remove(movimentacaoFinanceiraObserver);
    }
}
