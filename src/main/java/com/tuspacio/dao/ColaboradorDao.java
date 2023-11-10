package com.tuspacio.dao;

import com.tuspacio.models.Colaborador;

import java.util.List;

public interface ColaboradorDao {

     List<Colaborador> getColaborador ();
     void registrarColaborador (Colaborador colaborador);
}
