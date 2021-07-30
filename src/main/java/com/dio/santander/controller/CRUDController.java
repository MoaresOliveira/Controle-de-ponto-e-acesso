package com.dio.santander.controller;


import com.dio.santander.service.CRUDservices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CRUDController<Object,Service extends CRUDservices<Object,?>> {

    @Autowired
    Service service;

    @PostMapping
    @Operation(summary = "Adiciona um novo Objeto (ID Not Required)")
    public Object create(@RequestBody Object entity){
        return service.save(entity);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Retorna um Objeto especifico pelo ID")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
        return ResponseEntity.of(service.findById(id));
    }

    @GetMapping
    @Operation(summary = "Retorna uma lista com todos Objetos")
    public List<Object> getAll(){
        return service.findAll();
    }

    @PutMapping
    @Operation(summary = "Atualiza um Objeto (ID Not Required)")
    public Object update(@RequestBody Object entity){
        return service.save(entity);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Apaga um Objeto especifico pelo ID")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

}
