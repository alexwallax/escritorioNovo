package com.rcelestinoadvocacia.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Cadastro implements Serializable{
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numeroProcesso;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String endereco;
    private String email;
    private String nomeMae;

    public Cadastro() {
    }

    public Cadastro(int id) {
        this.id = id;
    }

    public Cadastro(int numeroProcesso, String nome, String cpf, String rg, String telefone, String endereco, String email, String nomeMae) {
        this.numeroProcesso = numeroProcesso;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.nomeMae = nomeMae;
    }

    public Cadastro(int id, int numeroProcesso, String nome, String cpf, String rg, String telefone, String endereco, String email, String nomeMae) {
        this.id = id;
        this.numeroProcesso = numeroProcesso;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.nomeMae = nomeMae;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(int numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Cadastro other = (Cadastro) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "id=" + id + ", numeroProcesso=" + numeroProcesso + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + ", endereco=" + endereco + ", email=" + email + ", nomeMae=" + nomeMae + '}';
    }
    
    
    
}
