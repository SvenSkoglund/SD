import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ProductService } from './product.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { ProductListComponent } from './product-list/product-list.component';
import {FormsModule } from '@angular/forms';
import { PokemonComponent } from './pokemon/pokemon.component';
import { PokeListComponent } from './poke-list/poke-list.component';
import { PokeTypePipe } from './poke-type.pipe';
import { IncompletePipe } from './incomplete.pipe';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    ProductListComponent,
    PokemonComponent,
    PokeListComponent,
    PokeTypePipe,
    IncompletePipe,
    HomeComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
