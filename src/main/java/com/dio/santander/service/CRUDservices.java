package com.dio.santander.service;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class CRUDservices<O,R extends JpaRepository<O,Long>> {

    R repository;

    public O save(O entity){
        return repository.save(entity);
    };

    public Optional<O> findById(Long id){
        return repository.findById(id);
    }

    public List<O> findAll(){
        return repository.findAll();
    }

    public O update(O entity){
        return repository.save(entity);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
