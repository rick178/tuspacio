package com.tuspacio.controllers;

import com.tuspacio.dao.ColaboradorDao;
import com.tuspacio.models.Colaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColaboradorController {
    @Autowired
    ColaboradorDao colaboradorDao;

    @RequestMapping(value = "api/Colaborador", method = RequestMethod.GET)
    public List<Colaborador> getColaborador (){
        return colaboradorDao.getColaborador();
    }

    @RequestMapping(value = "api/Colaborador", method = RequestMethod.POST)
    public void registrarUsuario (@RequestBody Colaborador colaborador){
        colaboradorDao.registrarColaborador(colaborador);
    }
}
