package br.com.alissonlima.designpatterns.processos;

import br.com.alissonlima.designpatterns.App;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MovimentacaoFinanceiraTest {

    @Test
    void sacarValor() {
        MovimentacaoFinanceira movimentacaoFinanceira = new MovimentacaoFinanceira();
        assertThrows(MovimentacaoFinanceiraException.class, () -> {
            movimentacaoFinanceira.sacarValor(App.criarContaFake(), new BigDecimal(1000L));
        });
    }

}
