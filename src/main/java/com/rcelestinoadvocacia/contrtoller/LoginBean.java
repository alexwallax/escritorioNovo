package com.rcelestinoadvocacia.contrtoller;

import com.rcelestinoadvocacia.model.Login;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@RequestScoped
@ManagedBean(name = "loginBean")
public class LoginBean {
    
    private Login login;
    private String usuario;
    private String senha;

    public String entrar(){
        FacesContext context = FacesContext.getCurrentInstance();
        if (usuario.equals("rosiane") && senha.equals("123456")) {
            login = new Login(usuario, senha);
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            session.setAttribute("login", login);
//          session.setAttribute("usuarioLogado", true); esse subistitui a linha acima
        return "restrito/cadastro?faces-redirect=true";
    } else if (usuario.equals("alex") && senha.equals("123456")) {
            login = new Login(usuario, senha);
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            session.setAttribute("login", login);
//          session.setAttribute("usuarioLogado", true); esse subistitui a linha acima
        return "restrito/usuario?faces-redirect=true";
    }
        else {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Info", "Login ou Senha Incorreto!!!");
            context.addMessage(null, message);
        }
    return null;        
    }
    
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
