package br.com.alissonlima.designpatterns.domain;

import java.time.LocalDate;

//Esta classe utilizar o Pattern Builder para criacao de novas instancias
public class Cliente {
    private String nome;
    private String sobrenome;
    private String logradouro;
    private String cidade;
    private String uf;
    private String telefone;
    private String email;

    //O construtor private impede que o desenvolvedor crie uma
    //nova instancia direta dessa classe com "new Cliente()".
    private Cliente(){}

    //A classe interna Builder deve ser utilizada para criar de
    //uma nova instancia do tipo Cliente.
    public static class Builder {
        private String nome;
        private String sobrenome;
        private String logradouro;
        private String cidade;
        private String uf;
        private String telefone;
        private String email;

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public Builder withLogradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public Builder withCidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Builder withUf(String uf) {
            this.uf = uf;
            return this;
        }

        public Builder withTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Cliente build() {
            Cliente c = new Cliente();
            c.nome = this.nome;
            c.sobrenome = this.sobrenome;
            c.logradouro = this.logradouro;
            c.cidade = this.cidade;
            c.uf= this.uf;
            c.telefone = this.telefone;
            c.email = this.email;
            return c;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
