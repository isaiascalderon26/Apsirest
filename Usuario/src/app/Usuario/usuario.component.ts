import { Component, OnInit } from '@angular/core';
import { Usuario } from './Usuario';
import { UsuarioService } from './Usuario.service';

@Component({
  selector: 'app-Usuarios',
  templateUrl: './Usuarios.component.html'
})
export class UsuariosComponent implements OnInit {

  Usuarios: Usuario[];

  constructor(private UsuarioService: UsuarioService) { }

  ngOnInit() {
    this.UsuarioService.getUsuarios().subscribe(
       Usuarios => this.Usuarios = Usuarios
    );
  }

}
