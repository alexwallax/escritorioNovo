package com.rcelestinoadvocacia.contrtoller;

import com.rcelestinoadvocacia.dao.LoginDAO;
import com.rcelestinoadvocacia.model.Cadastro;
import com.rcelestinoadvocacia.model.Login;
import com.rcelestinoadvocacia.model.Processos;
import com.rcelestinoadvocacia.model.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "LoginBean")// informa para o JSF é um gerenciador de telas
public class LoginBean {
    
    private Login login = new Login(); 
    private Usuario usuario = new Usuario();
    private Cadastro cadastro = new Cadastro();
    private Processos processos = new Processos();

    
    public void salvar(){
    LoginDAO dao = new LoginDAO();
    dao.insert(this.login);
    this.login = new Login();
    }
    
    public void editar(Login login){
    LoginDAO dao = new LoginDAO();
    dao.update(login);
    }

    public void remover(Login login){
    LoginDAO dao = new LoginDAO();
    dao.delete(login); 
    }
    
    public List<Login> getLogins(){
    LoginDAO dao = new LoginDAO();
    return dao.selectAll();
    }   
    
    
    public Processos getProcessos() {
        return processos;
    }

    public void setProcessos(Processos processos) {
        this.processos = processos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public LoginBean() {
    }
          
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    
}
