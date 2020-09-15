package br.com.alissonlima.designpatterns.processos;

import br.com.alissonlima.designpatterns.domain.Conta;
import br.com.alissonlima.designpatterns.operacoes.TipoOperacao;

import java.math.BigDecimal;

//Classe que utiliza o Pattern Observer para ouvir quando
//movimentacoes financeiras serao realizadas e logar a operacao.
public class MovimentacaoLogObserver implements MovimentacaoFinanceiraObserver {
    @Override
    public void movimentacaoRealizada(Conta conta, TipoOperacao tipoOperacao, BigDecimal valor) {
        System.out.printf("Realizado movimentacao %1s na conta do cliente %1s no valor de %1s %n",
                tipoOperacao,
                conta.getCliente().getNome(),
                valor);
    }
}
