package com.rcelestinoadvocacia.dao;

import com.rcelestinoadvocacia.model.Processo;
import com.rcelestinoadvocacia.util.GenericDAO;


public class ProcessoDAO extends GenericDAO<Processo> {

    @Override
    public Class<Processo> getClassType() {
        return Processo.class;
    }
    
}
