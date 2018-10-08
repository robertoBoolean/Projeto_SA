package br.com.senai.ManagedBean;

import br.com.senai.Aluno;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "alunoBean")
@SessionScoped
public class AlunoBean implements Serializable{
    private Aluno aluno = new Aluno();
    private List<Aluno> alunos = new ArrayList<>();
    
    public String adicionarAluno(){
        alunos.add(aluno);
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
}
