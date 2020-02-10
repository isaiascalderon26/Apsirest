package com.usuario.apirest.models.services;


import com.usuario.apirest.models.Usuario;
import com.usuario.apirest.models.dao.IUsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioDao usuarioDao;


    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findById(Long id) {
        return IUsuarioDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario save(Usuario usuario) {
        return IUsuarioDao.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Long id) {
        usuarioDao.deleteById(id);
    }
}
