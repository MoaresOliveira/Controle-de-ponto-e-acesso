package com.dio.santander.service;

import com.dio.santander.model.Usuario;
import com.dio.santander.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends CRUDservices<Usuario, UsuarioRepository> {

    @Autowired
    public UsuarioService (UsuarioRepository usuarioRepository){
        this.repository = usuarioRepository;
    }

}
