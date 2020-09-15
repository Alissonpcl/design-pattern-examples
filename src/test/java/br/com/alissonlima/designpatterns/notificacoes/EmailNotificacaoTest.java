package br.com.alissonlima.designpatterns.notificacoes;

import br.com.alissonlima.designpatterns.App;
import br.com.alissonlima.designpatterns.domain.Conta;
import br.com.alissonlima.designpatterns.operacoes.TipoOperacao;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class EmailNotificacaoTest {

    @Test
    void notificarPorEmail() {
        assertDoesNotThrow(() -> {
            Conta conta = App.criarContaFake();
            EmailNotificacao.notificarPorEmail(conta, TipoOperacao.DEBITO, new BigDecimal(10L));
        });
    }
}
