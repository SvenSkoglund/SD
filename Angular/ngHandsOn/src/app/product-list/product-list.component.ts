import { FormsModule, NgForm } from '@angular/forms';
import { Product } from './../models/product';
import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  title = '';
  display = true;
  products = [];

  constructor(private productService: ProductService) { }

  getNumberOfProducts = function() {
    return this.products.length;
  };
  ngOnInit() {
    this.products = this.productService.index();
  }

  log = function(str) {
    console.log(str);
  };

  addProduct = function(product: Product) {
    this.productService.create(product);
    this.products = this.productService.index();
  };

  goToWiki = function(product) {
    return product.wikiUrl;
  };

  onSubmit = function(form: NgForm) {
    this.productService.create(form.value);
    this.productService.index();
    form.reset();
  };
}
