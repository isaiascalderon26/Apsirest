package com.usuario.apirest.models.dao;

import com.usuario.apirest.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
