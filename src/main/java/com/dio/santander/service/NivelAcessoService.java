package com.dio.santander.service;

import com.dio.santander.model.NivelAcesso;
import com.dio.santander.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NivelAcessoService extends CRUDservices<NivelAcesso,NivelAcessoRepository> {

    @Autowired
    public NivelAcessoService (NivelAcessoRepository nivelAcessoRepository){
        this.repository = nivelAcessoRepository;
    }

}
