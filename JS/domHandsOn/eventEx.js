window.addEventListener('load', function(e) {
  console.log("Document Loaded");
});

var button = document.getElementById("btn1");
button.addEventListener('click', function(e) {
  var target = document.getElementById("target");
  target.textContent = "Clicked";
});

var button2 = document.getElementById("btn2");

var counter = 0;

var onOff = document.getElementById("btn3");
onOff.addEventListener('click',function(e){
  if(e.target.textContent ==='Off'){
    e.target.textContent = 'On';
  }else{
    e.target.textContent = 'Off';
  }
});


var clickCount = function(){
  counter++;
var x = prompt(counter);
console.log(x);
  console.log(counter);
  var target = document.getElementById("target");
  target.textContent = counter;
  if(counter >= 5){
    button2.removeEventListener("click", clickCount);
    var target = document.getElementById("target");
    target.textContent = "Maximum Clicks Acheived";
  }
};
button2.addEventListener('click', clickCount);
