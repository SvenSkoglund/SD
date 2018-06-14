import { Pipe, PipeTransform } from '@angular/core';
import { Todo } from './models/todo';

@Pipe({
  name: 'incomplete'
})
export class IncompletePipe implements PipeTransform {
  transform(todos: Todo[], showCompleted: boolean): any {
    if (showCompleted) {
      return todos;
    }
    const returnList = new Array<Todo>();
    todos.forEach(element => {
      if (element.completed === false) {
        returnList.push(element);
      }
    });
    return returnList;
  }
}
