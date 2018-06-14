export class Product {

  // {
//   name : 'Oh, The Places You\'ll Go!',
//   price : 11.39,
//   imgUrl : 'https://images-na.ssl-images-amazon.com/images/I/518eq5NjZkL._SY160_.jpg',
//   rating : 5
// }
  name: string;
  price: number;
  imgUrl: string;
  rating: number;

  constructor(name: string, price: number, imgUrl: string, rating: number ) {
    this.name = name;
    this.price = price;
    this.imgUrl = imgUrl;
    this.rating = rating;
  }
}
