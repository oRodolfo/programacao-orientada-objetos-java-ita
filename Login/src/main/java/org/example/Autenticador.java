package org.example;

public class Autenticador {

    public Usuario logar(String login, String senha) throws LoginException{
        if(login.equals("rodolfo") && senha.equals("senha123")){
            return new Usuario(login);
        }else {
            throw new LoginException("O usuario e a senha não batem", login);
        }
    }
}
