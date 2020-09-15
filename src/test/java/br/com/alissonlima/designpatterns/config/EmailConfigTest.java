package br.com.alissonlima.designpatterns.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailConfigTest {

    @Test
    void getInstance() {
        EmailConfig emailConfig = EmailConfig.getInstance();
        EmailConfig emailConfig2 = EmailConfig.getInstance();

        assertEquals(emailConfig, emailConfig2, "A instancia deve ser a mesma");
    }
}
