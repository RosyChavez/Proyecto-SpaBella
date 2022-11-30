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

import com.crud.spabella.Entity.Usuario;
import com.crud.spabella.Service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioServicio;

    @PostMapping("/create")
    public Usuario save (@RequestBody Usuario usuario){
        return usuarioServicio.save(usuario);
    }

    @GetMapping("list")
    public List<Usuario> findAll(){
        return usuarioServicio.findAll();
    }

    @PutMapping("/update")
    public Usuario update (@RequestBody Usuario usuario){
        return usuarioServicio.update(usuario);
    }

    @DeleteMapping ("/delete/(id)")
    public String deleteById (@PathVariable Long Id){
        return usuarioServicio.deleteById(Id);
    }
    }
