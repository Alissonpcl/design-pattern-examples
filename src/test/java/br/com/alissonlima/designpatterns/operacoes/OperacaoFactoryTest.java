package br.com.alissonlima.designpatterns.operacoes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoFactoryTest {

    @Test
    void criarOperacao() {
        Operacao operacao = OperacaoFactory.criarOperacao(TipoOperacao.DEBITO);
        assertNotNull(operacao);
        assertTrue(operacao instanceof DebitarOperacaoImpl);
    }
}
