package br.com.senai.ManagedBean;

import br.com.senai.GradeHorario;
import br.com.senai.dao.GradeHorarioDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="gradeHorarioBean")
@SessionScoped
public class GradeHorarioBean implements Serializable{
    private GradeHorario gradeHorario = new GradeHorario();
    private GradeHorarioDao gradeHorarioDao = new GradeHorarioDao();
    private List<GradeHorario> horarios = gradeHorarioDao.getAll();

    public GradeHorarioDao getGradeHorarioDao() {
        return gradeHorarioDao;
    }

    public void setGradeHorarioDao(GradeHorarioDao gradeHorarioDao) {
        this.gradeHorarioDao = gradeHorarioDao;
    }
        
    public String adicionarHorario(){
        gradeHorarioDao.salvar(gradeHorario);
        gradeHorario = new GradeHorario();
        horarios = gradeHorarioDao.getAll();
        return "gerenciar-horarios.xhtml";
    }
    
    public String cancelarHorario(){
        gradeHorario = new GradeHorario();
        return "gerenciar-horarios.xhtml";
    }

    public GradeHorario getGradeHorario() {
        return gradeHorario;
    }
    public void setGradeHorario(GradeHorario gradeHorario) {
        this.gradeHorario = gradeHorario;
    }

    public List<GradeHorario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<GradeHorario> horarios) {
        this.horarios = horarios;
    }
    
    public String editGradeHorario(){
        return "editar-horarios.xhtml";
    }
    
    public String excluirHorario(){
        gradeHorarioDao.excluir(gradeHorario);
        horarios = gradeHorarioDao.getAll();
        gradeHorario = new GradeHorario();
        return "gerenciar-horarios.xhtml";
    }
}
