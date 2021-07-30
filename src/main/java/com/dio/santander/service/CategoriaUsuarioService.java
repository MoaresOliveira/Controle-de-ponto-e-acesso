package com.dio.santander.service;

import com.dio.santander.model.CategoriaUsuario;
import com.dio.santander.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaUsuarioService extends CRUDservices<CategoriaUsuario,CategoriaUsuarioRepository> {

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository){
        this.repository = categoriaUsuarioRepository;
    }

}
