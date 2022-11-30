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

import com.crud.spabella.Entity.Esteticista;
import com.crud.spabella.Service.EsteticistaService;

@RestController
@RequestMapping("/api/v1/esteticista")
public class EstetisistaController {
    @Autowired
    EsteticistaService esteticistaService;

    @PostMapping("/create")
    public Esteticista save (@RequestBody Esteticista esteticista){
        return esteticistaService.save(esteticista);
    }

    @GetMapping("list")
    public List<Esteticista> findAll(){
        return esteticistaService.findAll();
    }

    @PutMapping("/update")
    public Esteticista update (@RequestBody Esteticista esteticista){
        return esteticistaService.update(esteticista);
    }

    @DeleteMapping ("/delete/(id)")
    public String deleteById (@PathVariable Long Id){
        return esteticistaService.deleteById(Id);
    }
}
