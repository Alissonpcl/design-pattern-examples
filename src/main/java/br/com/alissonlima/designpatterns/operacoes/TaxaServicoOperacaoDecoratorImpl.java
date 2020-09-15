package br.com.alissonlima.designpatterns.operacoes;

import br.com.alissonlima.designpatterns.domain.Conta;

import java.math.BigDecimal;

public class TaxaServicoOperacaoDecoratorImpl extends OperacaoDecorator {
    public TaxaServicoOperacaoDecoratorImpl(Operacao operacaoEncapsulada) {
        super(operacaoEncapsulada);
    }

    //Neste metodo vemos a utilizacao do Pattern Decorator na pratica.
    //Veja que conseguimos adicionar um comportamente, que neste caso
    //é a subtração da taxa de servico antes de executar a proxima operacao.
    @Override
    public void realizarOperacao(Conta conta, BigDecimal valor) {
        BigDecimal valorMenosTaxaServico = valor.subtract(new BigDecimal(5));
        operacaoEncapsulada.realizarOperacao(conta, valorMenosTaxaServico);
    }
}
