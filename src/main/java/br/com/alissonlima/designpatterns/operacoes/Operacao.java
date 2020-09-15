package br.com.alissonlima.designpatterns.operacoes;

import br.com.alissonlima.designpatterns.domain.Conta;

import java.math.BigDecimal;

public interface Operacao {
    void realizarOperacao(Conta conta, BigDecimal valor);
}
