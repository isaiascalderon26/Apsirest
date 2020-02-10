package com.usuario.apirest.models.services;

import com.usuario.apirest.models.Usuario;

import java.util.List;

public interface IUsuarioService  {

    public List<Usuario> findAll();

    public Usuario findById(Long id);

    public Usuario save(Usuario usuario);

    public void delete (Long id);

}
