package br.com.alissonlima.designpatterns.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void clienteBuilderTest(){
        Cliente cliente = new Cliente.Builder()
                .withNome("Alisson")
                .withSobrenome("Lima")
                .withCidade("Camaqua")
                .withUf("RS")
                .withEmail("usuario@gmail.com")
                .withLogradouro("Rua Numero 1")
                .withTelefone("51 12345678")
                .build();

        assertEquals("Alisson", cliente.getNome());
        assertEquals("Lima", cliente.getSobrenome());
        assertEquals("Camaqua", cliente.getCidade());
        assertEquals("RS", cliente.getUf());
        assertEquals("usuario@gmail.com", cliente.getEmail());
        assertEquals("Rua Numero 1", cliente.getLogradouro());
        assertEquals("51 12345678", cliente.getTelefone());
    }

}
