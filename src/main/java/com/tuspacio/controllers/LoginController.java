package com.tuspacio.controllers;

import com.tuspacio.dao.ColaboradorDao;
import com.tuspacio.models.Colaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    ColaboradorDao colaboradorDao;
    @RequestMapping(value = "api/login")
    public String login (@RequestBody Colaborador colaborador){
        if (colaboradorDao.verificarCredenciales(colaborador)){
            return "OK";
        }else {
            return "FAIL";
        }
    }
}
