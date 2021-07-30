package com.dio.santander.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class CRUDservices<Object,Repository extends JpaRepository<Object,Long>> {

    Repository repository;

    public Object save(Object entity){
        return repository.save(entity);
    };

    public Optional<Object> findById(Long id){
        return repository.findById(id);
    }

    public List<Object> findAll(){
        return repository.findAll();
    }

    public Object update(Object entity){
        return repository.save(entity);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
