package com.rcelestinoadvocacia.model;

import java.util.Objects;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class Login {
    @OneToMany
    private Usuario usuario;
    private String senha;

    public Login() {
    }

    public Login(Usuario usuario) {
        this.usuario = usuario;
    }

    public Login(Usuario usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Login other = (Login) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Login{" + "usuario=" + usuario + ", senha=" + senha + '}';
    }
    
}
