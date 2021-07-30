package com.dio.santander.service;

import com.dio.santander.model.TipoData;
import com.dio.santander.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDataService extends CRUDservices<TipoData, TipoDataRepository>{

    @Autowired
    public TipoDataService (TipoDataRepository tipoDataRepository){
        this.repository = tipoDataRepository;
    }

}
