import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'incomplete'
})
export class IncompletePipe implements PipeTransform {

  transform(value: any, args?: any): any {
    return null;
  }

}
