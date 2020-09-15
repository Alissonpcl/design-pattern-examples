package br.com.alissonlima.designpatterns.operacoes;

import br.com.alissonlima.designpatterns.domain.Conta;

import java.math.BigDecimal;

public class CreditarIOFOperacaoImpl implements Operacao {
    @Override
    public void realizarOperacao(Conta conta, BigDecimal valor) {
        BigDecimal valorMenosIOF = valor.subtract(new BigDecimal(1));
        conta.setSaldo(conta.getSaldo().add(valorMenosIOF));
    }
}
