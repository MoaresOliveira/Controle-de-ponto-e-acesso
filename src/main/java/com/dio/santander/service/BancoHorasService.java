package com.dio.santander.service;

import com.dio.santander.model.BancoHoras;
import com.dio.santander.repository.BancoHorasRepository;
import org.springframework.stereotype.Service;

@Service
public class BancoHorasService extends CRUDservices<BancoHoras, BancoHorasRepository>{

    public BancoHorasService (BancoHorasRepository bancoHorasRepository){
        this.repository = bancoHorasRepository;
    }

}
