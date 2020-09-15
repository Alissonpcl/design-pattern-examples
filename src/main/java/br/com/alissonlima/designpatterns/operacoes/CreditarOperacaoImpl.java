package br.com.alissonlima.designpatterns.operacoes;

import br.com.alissonlima.designpatterns.domain.Conta;

import java.math.BigDecimal;

public class CreditarOperacaoImpl implements Operacao {
    @Override
    public void realizarOperacao(Conta conta, BigDecimal valor) {
        conta.setSaldo(conta.getSaldo().add(valor));
    }
}
