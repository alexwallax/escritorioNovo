package com.rcelestinoadvocacia.contrtoller;

import com.rcelestinoadvocacia.dao.UsuarioDAO;
import com.rcelestinoadvocacia.model.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "usuarioBean")
public class UsuarioBean {
    
    private Usuario usuario = new Usuario();
    
    public void salvar(){
        UsuarioDAO dao = new UsuarioDAO();
        if (this.usuario.getId() == 0) {
            dao.insert(usuario);
        } else {
            dao.update(usuario);
        }
        this.usuario = new Usuario();
    }
    public void editar(Usuario usuario) {
        this.usuario = usuario;
    }
    public void remover(Usuario usuario) {
        UsuarioDAO  dao = new UsuarioDAO();
        dao.delete(usuario);
    }
    public List<Usuario> getUsuarios(){
    UsuarioDAO dao = new UsuarioDAO();
    return dao.selectAll();
    }

    public Usuario getUsuario() {
        return usuario; 
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
