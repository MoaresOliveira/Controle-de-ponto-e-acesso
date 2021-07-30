package com.dio.santander.service;

import com.dio.santander.model.Ocorrencia;
import com.dio.santander.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcorrenciaService extends CRUDservices<Ocorrencia, OcorrenciaRepository> {

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository){
        this.repository = ocorrenciaRepository;
    }
}
