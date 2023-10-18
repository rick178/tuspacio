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
}
