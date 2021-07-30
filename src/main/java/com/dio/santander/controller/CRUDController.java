package com.dio.santander.controller;


import com.dio.santander.service.CRUDservices;
import org.springframework.http.ResponseEntity;

import java.util.List;

public abstract class CRUDController<O,S extends CRUDservices<O,?>> {

    S service;

    public O create(O entity){
        return service.save(entity);
    }

    public ResponseEntity<O> getById(Long id){
        return ResponseEntity.of(service.findById(id));
    }

    public List<O> getAll(){
        return service.findAll();
    }

    public O update(O entity){
        return service.save(entity);
    }

    public void delete(Long id){
        service.delete(id);
    }

}
