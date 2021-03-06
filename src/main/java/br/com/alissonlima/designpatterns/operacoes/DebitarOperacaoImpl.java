package br.com.alissonlima.designpatterns.operacoes;

import br.com.alissonlima.designpatterns.domain.Conta;

import java.math.BigDecimal;

public class DebitarOperacaoImpl implements Operacao {
    @Override
    public void realizarOperacao(Conta conta, BigDecimal valor) {
        conta.setSaldo(conta.getSaldo().subtract(valor));
    }
}
