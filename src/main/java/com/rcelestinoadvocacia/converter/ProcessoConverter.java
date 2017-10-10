package com.rcelestinoadvocacia.converter;

import com.rcelestinoadvocacia.dao.ProcessoDAO;
import com.rcelestinoadvocacia.model.Processo;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "processoConverter", forClass = Processo.class)
public class ProcessoConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringProcesso) {
        if (stringProcesso != null) {
            int id = Integer.parseInt(stringProcesso);
            ProcessoDAO dao = new ProcessoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectProcesso) {
        if (objectProcesso != null) {
            Processo processo = (Processo) objectProcesso;
            return String.valueOf(processo.getId());
        }
        return null;
    }  
}
