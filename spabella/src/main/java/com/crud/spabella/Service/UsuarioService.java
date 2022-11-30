package com.crud.spabella.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spabella.Entity.Usuario;
import com.crud.spabella.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    // crean los metodos q va a consumir el servidor
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario save (Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario>  findAll()
    {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario update (Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public String deleteById (Long id){
        usuarioRepository.deleteById(id);
        return "Usuario eliminado";
    }
}
