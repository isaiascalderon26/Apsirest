import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent} from './footer/footer.component';
import { DirectivaComponent } from './directiva/directiva.component';
import { UsuariosComponent } from './Usuarios/Usuarios.component';
import { UsuarioService } from './Usuarios/Usuario.service';
import { RouterModule, Routes} from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

const routes: Routes = [
  {path: '', redirectTo: '/Usuarios', pathMatch: 'full'},
  {path: 'directivas', component: DirectivaComponent},
  {path: 'Usuarios', component: UsuariosComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    DirectivaComponent,
    UsuariosComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [UsuarioService],
  bootstrap: [AppComponent]
})
export class AppModule { }
