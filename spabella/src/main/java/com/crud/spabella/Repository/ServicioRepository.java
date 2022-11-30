package com.crud.spabella.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.spabella.Entity.Servicio;

@Repository
public interface ServicioRepository extends CrudRepository <Servicio, Long>{
    
}
