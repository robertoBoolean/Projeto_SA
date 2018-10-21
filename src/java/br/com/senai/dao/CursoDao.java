package br.com.senai.dao;

import br.com.senai.Curso;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class CursoDao {
    
    public Curso salvar (Curso curso){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(curso);
        session.getTransaction().commit();
        return curso;
    }
    
    public List<Curso> getAll(){
        List<Curso> lista = new ArrayList();
        lista = HibernateUtil.getSessionFactory().openSession().createQuery("from Curso").list();
        return lista;
    }
        public Curso getById(Integer id) {
            Curso curso = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        curso = (Curso) session.get(Curso.class, id);
        session.getTransaction().commit();
        return curso;
    }

    public void excluir(Curso curso) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(curso);
        session.getTransaction().commit();
    }
}
