package com.rcelestinoadvocacia.contrtoller;

import com.rcelestinoadvocacia.dao.LoginDAO;
import com.rcelestinoadvocacia.model.Login;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "LoginBean")// informa para o JSF é um gerenciador de telas
public class LoginBean {
    
    private Login login = new Login(); 
        
        public void salvar(){
            LoginDAO dao = new LoginDAO();
            dao.insert(this.login);
            this.login = new Login();
        }
   
    
    public List<Login> getLogins(){
       LoginDAO dao = new LoginDAO();
       return dao.selectAll();
    }   
    
      
    
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    
 
    
}
