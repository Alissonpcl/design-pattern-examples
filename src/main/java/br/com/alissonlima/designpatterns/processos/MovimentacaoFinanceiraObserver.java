package br.com.alissonlima.designpatterns.processos;

import br.com.alissonlima.designpatterns.domain.Conta;
import br.com.alissonlima.designpatterns.operacoes.Operacao;
import br.com.alissonlima.designpatterns.operacoes.TipoOperacao;

import java.math.BigDecimal;

public interface MovimentacaoFinanceiraObserver {
    void movimentacaoRealizada(Conta conta, TipoOperacao tipoOperacao, BigDecimal valor);
}
