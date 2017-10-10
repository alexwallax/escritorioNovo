package com.rcelestinoadvocacia.converter;

import com.rcelestinoadvocacia.dao.UsuarioDAO;
import com.rcelestinoadvocacia.model.Usuario;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;


@FacesConverter(value = "UsuarioConverter", forClass = Usuario.class)
public class UsuarioConverter implements Converter {
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringUsuario) {
        if (stringUsuario != null) {
        int id = Integer.parseInt(stringUsuario);
        UsuarioDAO dao = new UsuarioDAO();
        return (Object) dao.selectById(id);
        }
    return null;
    }
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectUsuario) {
        if (objectUsuario != null) {
            Usuario usuario = (Usuario) objectUsuario;
            return String.valueOf(usuario.getId());
        }
        return null;
    }

}


