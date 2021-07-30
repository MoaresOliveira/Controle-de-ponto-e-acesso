package com.dio.santander.service;

import com.dio.santander.model.Localidade;
import com.dio.santander.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadeService extends CRUDservices<Localidade, LocalidadeRepository>{

    @Autowired
    public LocalidadeService (LocalidadeRepository localidadeRepository){
        this.repository = localidadeRepository;
    }

}
