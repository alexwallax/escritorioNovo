package com.rcelestinoadvocacia.dao;

import com.rcelestinoadvocacia.model.Usuario;
import com.rcelestinoadvocacia.util.GenericDAO;

public class UsuarioDAO extends GenericDAO<Usuario> {

    @Override
    public Class<Usuario> getClassType() {
        return Usuario.class;
    }
    
    
    
}
