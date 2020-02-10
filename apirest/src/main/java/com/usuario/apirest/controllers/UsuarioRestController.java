
package com.usuario.apirest.controllers;

import com.usuario.apirest.models.Usuario;
import com.usuario.apirest.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/usuarios")
    public List<Usuario> index(){
    return usuarioService.findAll();

}
    @GetMapping("/usuarios/{id}")

    public Usuario show(@PathVariable Long id){
        return  usuarioService.findById(id);
    }

    @PostMapping("/usuarios")
    @ResponseStatus(HttpStatus.ACCEPTED.CREATED)
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping("/usuarios/{id}")
    public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id){
        Usuario usuarioActual = usuarioService.findById(id);

        usuarioActual.setNombre(usuario.getNombre());
        usuarioActual.setPassword(usuario.getPassword());
        usuarioActual.setEmail(usuario.getEmail());
        usuarioActual.setTelefono(usuario.getTelefono());

        return usuarioService.save(usuarioActual);
    }


}
