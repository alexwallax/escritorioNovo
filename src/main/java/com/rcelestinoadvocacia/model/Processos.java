package com.rcelestinoadvocacia.model;

import java.util.Objects;
import javax.persistence.Id;


public class Processos {
    
    private Id id;
    private String nome;
    private Cadastro cadastro;
    private String andamento;
    private String detalheProcesso;

    public Processos() {
    }

    public Processos(String nome, Cadastro cadastro, String andamento, String detalheProcesso) {
        this.nome = nome;
        this.cadastro = cadastro;
        this.andamento = andamento;
        this.detalheProcesso = detalheProcesso;
    }

    public String getDetalheProcesso() {
        return detalheProcesso;
    }

    public void setDetalheProcesso(String detalheProcesso) {
        this.detalheProcesso = detalheProcesso;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public String getAndamento() {
        return andamento;
    }

    public void setAndamento(String andamento) {
        this.andamento = andamento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Processos other = (Processos) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Processos{" + "id=" + id + ", nome=" + nome + ", cadastro=" + cadastro + ", andamento=" + andamento + ", detalheProcesso=" + detalheProcesso + '}';
    }
    
    
    
}

