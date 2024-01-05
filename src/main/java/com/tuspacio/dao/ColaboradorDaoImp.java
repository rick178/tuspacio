package com.tuspacio.dao;

import com.tuspacio.models.Colaborador;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional

public class ColaboradorDaoImp implements ColaboradorDao{

    public List<Colaborador> getColaborador() {
        return null;

    }
    @Override
<<<<<<< HEAD
    public void registrarColaborador(Colaborador colaborador) {

=======
    public void registrarColaborador (Colaborador colaborador){
        entityManager.merge(colaborador);
>>>>>>> 6497cf592f7e3c50d0a4eb38e9d8b3f0764dc4d8
    }
}
