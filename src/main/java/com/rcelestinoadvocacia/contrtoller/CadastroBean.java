package com.rcelestinoadvocacia.contrtoller;

import com.rcelestinoadvocacia.dao.CadastroDAO;
import com.rcelestinoadvocacia.model.Cadastro;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "cadastroBean")
public class CadastroBean {
    
    private Cadastro cadastro = new Cadastro();
    
    public void salvar() {
        CadastroDAO dao = new CadastroDAO();
        if (this.cadastro.getId() == 0) {
            dao.insert(cadastro);
        } else {
            dao.update(cadastro);
        }
        this.cadastro = new Cadastro();
    }

    public void editar(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    
    public void remover(Cadastro cadastro) {
        CadastroDAO dao = new CadastroDAO();
        dao.delete(cadastro);
    }
    
    public List<Cadastro> getCadastros() {
        CadastroDAO dao = new CadastroDAO();
        return dao.selectAll();
    }
    
    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
   
    
    
    
}
