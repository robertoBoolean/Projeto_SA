package br.com.senai.ManagedBean;

import br.com.senai.Curso;
import br.com.senai.dao.CursoDao;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cursoBean")
@SessionScoped
public class CursoBean implements Serializable{
    private Curso curso = new Curso();
    private CursoDao cursoDao = new CursoDao();
    private List<Curso> cursos = cursoDao.getAll();
    
    public String adicionarCurso(){
        cursoDao.salvar(curso);
        curso = new Curso();
        cursos = cursoDao.getAll();
        return "gerenciar-cursos.xhtml";
    }
    public String cancelarCurso(){
        curso = new Curso();
        return "gerenciar-cursos.xhtml";
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    public String editCurso(){
        return "editar-cursos.xhtml";
    }
    public String excluirCurso(){
        cursoDao.excluir(curso);
        cursos = cursoDao.getAll();
        curso = new Curso();
        return "gerenciar-cursos.xhtml";
    }
    
}
