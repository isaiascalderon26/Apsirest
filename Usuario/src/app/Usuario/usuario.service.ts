  import { Injectable } from '@angular/core';
import { UsuarioS } from './Usuarios.json';
import { Usuario } from './Usuario';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';


@Injectable()
export class UsuarioService {
  private urlEndPoint: string = 'http://localhost:8080/api/Usuarios';
  constructor(private http: HttpClient) { }

  getUsuarios(): Observable<Usuario[]> {
    //return of(UsuarioS);
    return this.http.get(this.urlEndPoint).pipe(
      map(response => response as Usuario[])
    );
  }

}
