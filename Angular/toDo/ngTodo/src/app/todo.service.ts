import { AuthService } from './auth.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Todo } from './models/todo';
import { Observable, throwError } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { DatePipe } from '@angular/common';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  // create todos property and assign it the array from todo-list.component.ts.

  // re-assign the todos property in the todo-list.component.ts class an empty array.

  // create a public index() method in 'todoService' which returns the array of todos.

  // in todo-list.component.ts call the todoService.index()
  // method in the ngOnInit function to assign the todos from our service to the component's todos field.
  constructor(
    private http: HttpClient,
    private datePipe: DatePipe,
    private auth: AuthService
  ) {}

  private url = 'http://localhost:8080/api/todos';
  private todos = [];

  index() {
    const token = this.auth.getToken();
    const headers = new HttpHeaders().set(
      'Authorization', 'Basic ${token}'
    );
    // http://localhost:8080/api/users/1/todos
    return this.http.get<Todo[]>(this.url, {headers}).pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('KABOOM');
      })
    );
  }

  //   make a public create(todo) method.

  // move all of the logic of pushing the todo into the array into the service class.

  // don't forget to move the generateId method from the TodoListComponent over to the service as well.
  create(todo: Todo) {
    todo.completed = false;
    return this.http.post<Todo[]>(this.url, todo)
    .pipe(
      catchError((err: any) => {
       console.log(err);
       return throwError('KABOOM');
     })
 );
  }
  updateTodo(todo) {
    if (todo.completed) {
      todo.completeDate = this.datePipe.transform(Date.now(), 'shortDate');
    } else {
      todo.completeDate = '';
    }
    return this.http.put<Todo[]>(this.url + '/' + todo.id, todo)
    .pipe(
      catchError((err: any) => {
       console.log(err);
       return throwError('KABOOM');
     })
 );
  }

  show(id: number) {
        return this.http.get<Todo>(this.url + '/' + id).pipe(
          catchError((err: any) => {
            console.log(err);
            return throwError('KABOOM');
          })
        );
  }
  // make a public destroy(id) method. The method will iterate over the todos array
  // looking for a todo with the provided id. If the id is found, use splice to
  // remove the todo at that index.

  destroy(id: number) {
    return this.http.delete<Todo[]>(this.url + '/' + id)
    .pipe(
      catchError((err: any) => {
       console.log(err);
       return throwError('KABOOM');
     })
 );
  }
}
