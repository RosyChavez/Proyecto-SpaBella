package com.crud.spabella.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spabella.Entity.Servicio;
import com.crud.spabella.Repository.ServicioRepository;

@Service

public class ServicioService {
    
    @Autowired
    ServicioRepository servicioRepository;

    public Servicio save (Servicio servicio){
        return servicioRepository.save(servicio);
    }

    public List<Servicio>  findAll()
    {
        return (List<Servicio>) servicioRepository.findAll();
    }

    public Servicio update (Servicio servicio){
        return servicioRepository.save(servicio);
    }

    public String deleteById (Long id){
        servicioRepository.deleteById(id);
        return "Servicio eliminado";
    }

}
