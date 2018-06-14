var list = document.getElementById('list');
var editBtns = document.getElementsByClassName('edit');
var clearBtns = document.getElementsByClassName('clear');

var editCallback = function(e) {
  e.target.previousElementSibling.textContent = prompt("Enter the new text");
}

var clearCallback = function(e) {
  if (e.target.previousElementSibling.previousElementSibling.textContent) {
    if (confirm("Are you sure?")){
      e.target.previousElementSibling.previousElementSibling.textContent = "";

    }
  }
}

for (var i = 0; i < editBtns.length; i++) {
  editBtns[i].addEventListener('click', editCallback);
}

for (var i = 0; i < clearBtns.length; i++) {
  clearBtns[i].addEventListener('click', clearCallback);
}
