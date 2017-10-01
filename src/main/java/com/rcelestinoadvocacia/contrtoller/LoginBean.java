package com.rcelestinoadvocacia.contrtoller;

import com.rcelestinoadvocacia.dao.LoginDAO;
import com.rcelestinoadvocacia.model.Login;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "LoginBean")// informa para o JSF é um gerenciador de telas
public class LoginBean {
    
    private Login login = new Login(); 
        
        public void salvar(){
            LoginDAO dao = new LoginDAO();
            dao.insert(login);
        }
   
    
    
    
      
    
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    
 
    
}
