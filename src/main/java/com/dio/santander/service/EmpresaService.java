package com.dio.santander.service;

import com.dio.santander.model.Empresa;
import com.dio.santander.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends CRUDservices<Empresa, EmpresaRepository>{

    @Autowired
    public EmpresaService (EmpresaRepository empresaRepository){
        this.repository = empresaRepository;
    }

}
