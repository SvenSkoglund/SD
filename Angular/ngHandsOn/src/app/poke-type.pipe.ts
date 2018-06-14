import { Pipe, PipeTransform } from '@angular/core';
import { Pokemon } from './pokemon';

@Pipe({
  name: 'pokeType'
})
export class PokeTypePipe implements PipeTransform {

  transform(pokeList: Pokemon[], typeString: String): any {
    if (typeString === 'all') {
      return pokeList;
    }
    const filteredList = new Array<Pokemon>();
    pokeList.forEach(pokeElement => {
      pokeElement.types.forEach(typeElement => {
        if (typeElement.name === typeString) {
          filteredList.push(pokeElement);
        }
      });
    });
    return filteredList;
  }

}
