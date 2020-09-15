package br.com.alissonlima.designpatterns.notificacoes;

import br.com.alissonlima.designpatterns.config.EmailConfig;
import br.com.alissonlima.designpatterns.domain.Conta;
import br.com.alissonlima.designpatterns.operacoes.TipoOperacao;

import java.math.BigDecimal;

public class EmailNotificacao {

    public static void notificarPorEmail(Conta conta, TipoOperacao tipoOperacao, BigDecimal valor) {
        System.out.printf("Enviando notificacao por email de operacao de %1s, no valor de %f para cliente %1s%n",
                tipoOperacao,
                valor,
                conta.getCliente().getNome());

        System.out.println("Email enviado com os seguintes dados:");
        System.out.printf("Hostname: %1s%n", EmailConfig.getInstance().getHost());
        System.out.printf("Usuario: %1s%n", EmailConfig.getInstance().getUsuario());
        System.out.printf("Senha: %1s%n", EmailConfig.getInstance().getSenha());
    }
}
