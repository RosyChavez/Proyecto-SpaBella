package com.crud.spabella.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.spabella.Entity.Esteticista;

@Repository
public interface EstetisistaRepository extends CrudRepository <Esteticista, Long> {
    
}
