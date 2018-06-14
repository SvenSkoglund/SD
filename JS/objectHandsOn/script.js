var tree = {};
tree.age = 1;
tree.ageOneYear = function(){
  this.age = this.age + 1;
  tree.isDead();
  console.log(tree.age);
}
tree.isDead = function (){
  if(this.age > 100){
    this.age = NaN;
  }
}


while(tree.age){
  tree.ageOneYear();
}
