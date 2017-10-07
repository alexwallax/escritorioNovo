package com.rcelestinoadvocacia.model;


public class Processo {
    private int id;
    private String nome;
    private String detalheProcesso;
    private Cadastro cadastro;

    public Processo() {
    }

    public Processo(String nome, String detalheProcesso, Cadastro cadastro) {
        this.nome = nome;
        this.detalheProcesso = detalheProcesso;
        this.cadastro = cadastro;
    }

    public Processo(int id) {
        this.id = id;
    }

    public Processo(int id, String nome, String detalheProcesso, Cadastro cadastro) {
        this.id = id;
        this.nome = nome;
        this.detalheProcesso = detalheProcesso;
        this.cadastro = cadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalheProcesso() {
        return detalheProcesso;
    }

    public void setDetalheProcesso(String detalheProcesso) {
        this.detalheProcesso = detalheProcesso;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final Processo other = (Processo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Processo{" + "id=" + id + ", nome=" + nome + ", detalheProcesso=" + detalheProcesso + ", cadastro=" + cadastro + '}';
    }

    
}