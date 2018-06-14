var greeting = document.getElementById("hello");
greeting.textContent = "Hello Sven";

var list = ["one","two","three","four","five"];

var myList = document.getElementsByTagName("li");
console.log(myList);

for (var i = 0; i < myList.length; i++) {
  myList[i].textContent = list[i];
}
