package com.rcelestinoadvocacia.dao;

import com.rcelestinoadvocacia.model.Cadastro;
import com.rcelestinoadvocacia.util.GenericDAO;


public class CadastroDAO extends GenericDAO<Cadastro> {
    @Override
    public Class<Cadastro> getClassType(){
        return Cadastro.class;
    }
}
