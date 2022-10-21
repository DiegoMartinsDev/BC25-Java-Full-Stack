import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProdutoComponent } from './produto/produto.component';
import { NavbarComponent } from './navbar/navbar.component';

@NgModule({  //declarations registra componentes,pipes diretivas e estruturas*/


  declarations: [
    AppComponent,
    ProdutoComponent,
    NavbarComponent
  ],
  imports: [    //serve para registrar outros módulos dentro de outro módulo/


    BrowserModule
  ],
  providers: [],      //serve para registrar serviços e interceptadores http//


  bootstrap: [AppComponent]
})
export class AppModule { }
