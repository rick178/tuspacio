package com.tuspacio.dao;

import com.tuspacio.models.Colaborador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ColaboradorDaoImp implements ColaboradorDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Colaborador> getColaborador() {
        String query = "FROM Colaborador";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void registrarColaborador (Colaborador colaborador){
        System.out.println("Entrando a ColaboradorDao");
        try {
            entityManager.merge(colaborador);
            System.out.println("Se inserto el colaborador correctamente");
        }catch(Error error){
            System.out.println("ColaboradorDaoImp Error: " + error);
        }
    }
}
