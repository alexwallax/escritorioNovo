package com.rcelestinoadvocacia.dao;

import com.rcelestinoadvocacia.model.Processos;
import com.rcelestinoadvocacia.util.GenericDAO;


public class ProcessosDAO extends GenericDAO<Processos> {
    
    @Override
    public Class<Processos> getClassType(){
        return Processos.class;
    }
    
}
