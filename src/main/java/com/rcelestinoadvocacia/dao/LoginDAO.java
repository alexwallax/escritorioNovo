package com.rcelestinoadvocacia.dao;

import com.rcelestinoadvocacia.model.Login;
import com.rcelestinoadvocacia.util.GenericDAO;


public class LoginDAO extends GenericDAO<Login> {
    
    @Override
    public Class<Login> getClassType(){
        return Login.class;
    }
    
}
