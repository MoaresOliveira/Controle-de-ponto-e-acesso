package com.dio.santander.controller;

import com.dio.santander.model.CategoriaUsuario;
import com.dio.santander.service.CategoriaUsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria")
@Tag(name = "Categoria de Usuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    @Operation(summary = "Adiciona uma Categoria de Usuario (ID not required)")
    public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @GetMapping
    @Operation(summary = "Retorna uma lista com todas Categorias de Usuario (ID not required)")
    public List<CategoriaUsuario> getAll(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoria}")
    @Operation(summary = "Retorna uma Categoria de Usuario especificada pelo ID")
    public ResponseEntity<CategoriaUsuario> getById(@PathVariable("idCategoria")Long idCategoria) throws NoSuchElementException {
        return ResponseEntity.ok(categoriaUsuarioService.findById(idCategoria).orElseThrow(()-> {
            throw new NoSuchElementException("Categoria não encontrada");
        } ));
    }

    @PutMapping
    @Operation(summary = "Atualiza uma Categoria de Usuario")
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.update(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    @Operation(summary = "Apaga uma Categoria de Usuario especificada pelo ID")
    public void deleteCategoria(@PathVariable("idCategoria")Long idCategoria){
        categoriaUsuarioService.delete(idCategoria);
    }
}
