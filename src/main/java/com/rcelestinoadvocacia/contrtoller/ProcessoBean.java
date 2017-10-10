package com.rcelestinoadvocacia.contrtoller;

import com.rcelestinoadvocacia.dao.ProcessoDAO;
import com.rcelestinoadvocacia.model.Processo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "processoBean")
public class ProcessoBean {
    
    private Processo processo = new Processo();
    
    public void salvar(){
        ProcessoDAO dao = new ProcessoDAO();
        if (this.processo.getId() == 0) {
            dao.insert(processo);
        } else {
            dao.update(processo);
        }
        this.processo = new Processo();
    }
    public void editar(Processo processo) {
        this.processo = processo;
    }
    public void remover(Processo processo) {
        ProcessoDAO dao = new ProcessoDAO();
        dao.delete(processo);
    }
    public List<Processo> getProcessos() {
        ProcessoDAO dao = new ProcessoDAO();
        return dao.selectAll();
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }    
}
