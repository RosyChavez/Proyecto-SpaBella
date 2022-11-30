package com.crud.spabella.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spabella.Entity.Servicio;
import com.crud.spabella.Service.ServicioService;


@RestController
@RequestMapping("/api/v1/servicio")
public class ServicioController {
        
    @Autowired
    ServicioService servicioService;

    @PostMapping("/create")
    public Servicio save (@RequestBody Servicio servicio){
        return servicioService.save(servicio);
    }

    @GetMapping("list")
    public List<Servicio> findAll(){
        return servicioService.findAll();
    }

    @PutMapping("/update")
    public Servicio update (@RequestBody Servicio servicio){
        return servicioService.update(servicio);
    }

    @DeleteMapping ("/delete/(id)")
    public String deleteById (@PathVariable Long Id){
        return servicioService.deleteById(Id);
    }
}
