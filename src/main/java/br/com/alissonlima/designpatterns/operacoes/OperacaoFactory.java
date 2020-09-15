package br.com.alissonlima.designpatterns.operacoes;

//Esta classe implementa o Pattern Factory.
//Ela possui a responsabilidade de fabricar objetos do tipo Operacao.
//Essa centralizacao de responsabilidade facilita a manutenção de codigo
//pois caso seja necessario alterar algumas das implementacoes será necessario
//apenas alterar a logica ou implementacao nesta classe.
public class OperacaoFactory {

    public static Operacao criarOperacao(TipoOperacao tipoOperacao) {
        switch (tipoOperacao) {
            case DEBITO:
                return new DebitarOperacaoImpl();

            case CREDITO:
                //return new CreditarIOFOperacaoImpl();
                //O return comentado acima foi adicionado para fins didaticos
                //demonstrando como uma possivel alteracao de implementacao e
                //regra de negocio poderia ser realizada alterarando apenas
                //uma linha de codigo.
                return new CreditarOperacaoImpl();

            case RENDIMENTO:
                return new TaxaServicoOperacaoDecoratorImpl(new CreditarOperacaoImpl());

            default:
                throw new RuntimeException("Tipo de operacao nao encontrada");
        }
    }
}
