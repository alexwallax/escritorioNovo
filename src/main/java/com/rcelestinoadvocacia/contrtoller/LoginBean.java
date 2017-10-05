package com.rcelestinoadvocacia.contrtoller;

import com.rcelestinoadvocacia.dao.LoginDAO;
import com.rcelestinoadvocacia.model.Login;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "loginBean")
public class LoginBean {
    
    private Login login = new Login();
    
    public void salvar() {
        LoginDAO dao = new LoginDAO();
        if (this.login.getId() == 0) {
            dao.update(this.login);
        }else {
            dao.update(this.login);
        }
        this.login = new Login(); // para limpar a tela
    }
    
    
    
    
    
    
    
    
   

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
}
