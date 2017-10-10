package com.rcelestinoadvocacia.model;

import java.io.Serializable;

public class Login implements Serializable {
    
    private final String usuario;
    private final String senha;
    
    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}