package br.com.senai;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GradeHorario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private Date hr_inicio;
    private Date hr_fim;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHr_inicio() {
        return hr_inicio;
    }

    public void setHr_inicio(Date hr_inicio) {
        this.hr_inicio = hr_inicio;
    }

    public Date getHr_fim() {
        return hr_fim;
    }

    public void setHr_fim(Date hr_fim) {
        this.hr_fim = hr_fim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
