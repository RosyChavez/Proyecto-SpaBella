package com.crud.spabella.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spabella.Entity.Esteticista;
import com.crud.spabella.Repository.EstetisistaRepository;


@Service
public class EsteticistaService {
    @Autowired
    EstetisistaRepository esteticistaRepository;

    public Esteticista save (Esteticista esteticista){
        return esteticistaRepository.save(esteticista);
    }

    public List<Esteticista>  findAll()
    {
        return (List<Esteticista>) esteticistaRepository.findAll();
    }

    public Esteticista update (Esteticista esteticista){
        return esteticistaRepository.save(esteticista);
    }

    public String deleteById (Long id){
        esteticistaRepository.deleteById(id);
        return "Esteticista eliminado";
    }
}
