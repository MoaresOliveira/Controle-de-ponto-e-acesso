package com.dio.santander.controller;

import com.dio.santander.model.CategoriaUsuario;
import com.dio.santander.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoria(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getAll(){
        return categoriaUsuarioService.getAll();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getById(@PathVariable("idCategoria")Long idCategoria) throws NoSuchElementException {
        return ResponseEntity.ok(categoriaUsuarioService.getByID(idCategoria).orElseThrow(()-> {
            throw new NoSuchElementException("Categoria não encontrada");
        } ));
    }

    @PutMapping
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoria(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    public void deleteCategoria(@PathVariable("idCategoria")Long idCategoria){
        categoriaUsuarioService.deleteCategoria(idCategoria);
    }
}
