package br.com.senai.ManagedBean;

import br.com.senai.Aluno;
import br.com.senai.dao.AlunoDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "alunoBean")
@SessionScoped
public class AlunoBean implements Serializable{
    private Aluno aluno = new Aluno();
    private AlunoDao alunoDao = new AlunoDao();
    private List<Aluno> alunos = alunoDao.getAll();
    
    public String adicionarAluno(){
        alunoDao.salvar(aluno);
        aluno = new Aluno();
        alunos = alunoDao.getAll();
        return "gerenciar-alunos.xhtml";
    }
    public String cancelarAluno(){
        aluno = new Aluno();
        return "gerenciar-alunos.xhtml";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public String editAluno(){
        return "editar-alunos.xhtml";
    }
    public String excluirAluno(){
        alunoDao.excluir(aluno);
        alunos = alunoDao.getAll();
        aluno = new Aluno();
        return "gerenciar-alunos.xhtml";
    }
    
}
