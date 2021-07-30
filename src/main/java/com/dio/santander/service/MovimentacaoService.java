package com.dio.santander.service;

import com.dio.santander.model.Movimentacao;
import com.dio.santander.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService extends CRUDservices<Movimentacao, MovimentacaoRepository>{

    @Autowired
    public MovimentacaoService (MovimentacaoRepository movimentacaoRepository){
        this.repository = movimentacaoRepository;
    }

}
