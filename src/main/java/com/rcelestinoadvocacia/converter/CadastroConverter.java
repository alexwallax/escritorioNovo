//package com.rcelestinoadvocacia.converter;
//
//import com.rcelestinoadvocacia.dao.CadastroDAO;
//import com.rcelestinoadvocacia.model.Cadastro;
//import java.lang.annotation.Annotation;
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.FacesConverter;
//import javax.persistence.Converter;
//
//@FacesConverter(value = "cadastroConverter", forClass = Cadastro.class)
//public class CadastroConverter implements Converter {
//   
//    @Override
//    public Object getAsObject(FacesContext context, UIComponent component, String stringCadastro) {
//        if (stringCadastro != null) {
//            int id = Integer.parseInt(stringCadastro);
//            CadastroDAO dao = new CadastroDAO();
//            return (Object) dao.selectById(id);
//        }
//        return null;
//    }
//    @Override
//    public String getAsString(FacesContext context, UIComponent component, Object objectCadastro) {
//        if (objectCadastro != null) {
//            Cadastro cliente = (Cadastro) objectCadastro;
//            return String.valueOf(cliente.getId());
//        }
//        return null;
//    }
//
//    
//}
