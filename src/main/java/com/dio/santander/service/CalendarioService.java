package com.dio.santander.service;

import com.dio.santander.model.Calendario;
import com.dio.santander.repository.BancoHorasRepository;
import com.dio.santander.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarioService extends CRUDservices<Calendario, CalendarioRepository>{

    @Autowired
    public CalendarioService (CalendarioRepository calendarioRepository){
        this.repository = calendarioRepository;
    }

}
