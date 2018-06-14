import { PokemonService } from './../pokemon.service';
import { Component, OnInit } from '@angular/core';
import { Form, NgForm } from '@angular/forms';

@Component({
  selector: 'app-poke-list',
  templateUrl: './poke-list.component.html',
  styleUrls: ['./poke-list.component.css']
})
export class PokeListComponent implements OnInit {

  selectedType = 'all';
  pokemons = [];
  selected = null;
  types = [
    'all',
    'normal',
    'poison',
    'water',
    'fighting',
    'fire',
    'bug',
    'flying',
    'electric',
    'ground',
    'rock',
    'psychic',
    'ghost',
    'dragon'
  ];
  constructor(private pokeService: PokemonService) { }

  ngOnInit() {
    this.loadPokeman();
  }

  create = function (form: NgForm) {
    this.pokeService.create(form.value).subscribe(
    data => this.loadPokeman(),
    error => console.log(error));
  };
  loadPokeman = function() {
    this.pokeService.index().subscribe(
      data => this.pokemons = data,
      err => console.error('Error retreiving pokeman')
    );
  };

  selectPoke = function(poke) {
    this.selected = poke;
  };
  deselectPoke = function() {
    this.selected = null;
  };
}
