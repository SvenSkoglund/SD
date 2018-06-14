import { element } from 'protractor';
import { DatePipe } from '@angular/common';
import { TodoService } from './../todo.service';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Todo } from '../models/todo';
import { IncompletePipe } from '../incomplete.pipe';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {
  title = 'ngTodo';
  selected = null;
  todo = new Todo();
  editTodo = null;
  todos = [];
  showComplete = false;

  constructor(
    private todoService: TodoService,
    private datePipe: DatePipe,
    private incompletePipe: IncompletePipe,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit() {
    this.reload();
    if (!this.selected && this.route.snapshot.paramMap.get('id')) {
      this.show(this.route.snapshot.paramMap.get('id'));
    }
  }

  show = function(id) {
    let foundTodo = null;

    this.todoService.show(id).subscribe(
      data => {
        foundTodo = data;
        this.displayToDo(foundTodo);
      },
      error => {console.log('Error showing todo');
      this.router.navigateByUrl('notFound');
    }
    );
  };

  toDoCount = function() {
    return this.incompletePipe.transform(this.todos).length;
  };

  displayToDo = function(todo) {
    this.selected = todo;
  };

  displayTable = function() {
    this.reload();
    this.selected = null;
  };
  // in todo-list.component.ts call the todoService.create(todo) method within the addTodo behavior.

  // now you will need to update the local array (todos) by calling your index method again.
  addTodo = function(todo: Todo) {
    this.todoService.create(todo);
    this.todo = new Todo();
    this.reload();
  };
  updateTodo = function(todo) {
    this.todoService.updateTodo(todo).subscribe(
      data => {
        this.todo = new Todo();
        this.editTodo = null;
        this.reload();
      },
      error => console.log('Error deleting todo')
    );
  };
  // In todo-list.component.ts add a deleteTodo(id) behavior that uses the TodoService to remove a todo by the provided id.
  deleteTodo = function(id: number) {
    this.todoService.destroy(id).subscribe(
      data => {
        this.todo = new Todo();
        this.reload();
      },
      error => console.log('Error deleting todo')
    );
  };

  setEditTodo = function(todo: Todo) {
    this.editTodo = todo;
  };
  hideEditView = function() {
    this.editTodo = null;
  };
  onSubmit = function(form: NgForm) {
    this.todo.task = form.value.task;
    this.todoService.create(this.todo).subscribe(
      data => {
        this.todo = new Todo();
        this.reload();
        form.reset();
      },
      error => console.log('Error creating todo')
    );
  };

  reload() {
    return this.todoService
      .index()
      .subscribe(
        data => (this.todos = data),
        err => console.error('Error retreiving data')
      );
  }
  checkColor() {
    if (this.toDoCount() > 10) {
      return 'danger';
    }
    if (this.toDoCount() > 5) {
      return 'warning';
    } else {
      return 'safe';
    }
  }
}
