package br.com.alissonlima.designpatterns.config;

//Exemplo de Singleton. Apenas uma instância (objeto) desta classe
//existirá em toda a aplicação durante a execução.
public class EmailConfig {

    private final String host;
    private final String usuario;
    private final String senha;

    //Esta propriedade guardara a única instância da aplicação
    private static EmailConfig instance;

    //O construtor é privado para garantir que o dev
    //não possa dar new e criar uma nova instância
    private EmailConfig(){
        this.host = "mail.smtp.com";
        this.usuario = "mailUser";
        this.senha = "mailPass";
    }

    //Esse é o método que devera ser utilizado para obter a instância
    //dessa classe. É aqui que está a lógica por trás do Pattern Singleton.
    //Se uma instância ainda nao foi criada ela sera e retornada.
    //Se ja existir, ela será apenas retornada.
    public static EmailConfig getInstance() {
        if (instance == null){
            instance = new EmailConfig();
        }
        return instance;
    }

    public String getHost() {
        return host;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}
