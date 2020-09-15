package br.com.alissonlima.designpatterns.operacoes;

public abstract class OperacaoDecorator implements Operacao {
    Operacao operacaoEncapsulada;

    public OperacaoDecorator(Operacao operacaoEncapsulada) {
        this.operacaoEncapsulada = operacaoEncapsulada;
    }
}
