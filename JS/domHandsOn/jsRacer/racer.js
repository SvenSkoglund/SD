document.addEventListener('keydown', function(e){
  var blue = document.getElementById('blueCar');
  var red = document.getElementById('redCar');

  if(e.key === 'q'){
    moveCar(red);
    console.log(e.key);
  }
  if(e.key === 'p'){
    moveCar(blue);
    console.log(e.key);
  }
});

function moveCar(car){
  if(!car.style.marginLeft){
    car.style.marginLeft = '0px';
  }
  var current = parseInt(car.style.marginLeft.substring(0,car.style.marginLeft.length-2));
  car.style.marginLeft = (current + 5) + 'px';
  console.log(car);
  // console.log(car.style.marginLeft);
  if((current + 155) > window.innerWidth && car.id === "redCar"){
    alert('Steve is the winner!');
  }
  if((current + 155) > window.innerWidth && car.id === "blueCar"){
    alert('Rob is the winner!');
  }
}
