package com.dio.santander.service;

import com.dio.santander.model.JornadaTrabalho;
import com.dio.santander.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaService extends CRUDservices<JornadaTrabalho,JornadaRepository>{

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.repository = jornadaRepository;
    }

}
