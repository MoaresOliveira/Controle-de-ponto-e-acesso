package com.dio.santander.service;

import com.dio.santander.model.CategoriaUsuario;
import com.dio.santander.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository){
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario saveCategoria(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario updateCategoria(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public void deleteCategoria(Long idCategoria){
        categoriaUsuarioRepository.deleteById(idCategoria);
    }

    public List<CategoriaUsuario> getAll(){
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getByID(Long idCategoria){
        return categoriaUsuarioRepository.findById(idCategoria);
    }
}
