function displayData(data) {
  var list = document.createElement('ul');
  for (var i = 0; i < data.length; i++) {
    var item = document.createElement('li');
    item.textContent = "First Name: " + data[i].fname + " Last Name: " + data[i].lname + " Age: " + data[i].age;
    list.appendChild(item);
  }
  document.body.appendChild(list);

}

window.addEventListener('load', function(e) {
  var xhr = new XMLHttpRequest();
  console.log(xhr.readyState);

  xhr.open('GET', 'https://andrewconlin.github.io/data.jsonasdf', true);

  xhr.onreadystatechange = function() {
    console.log(xhr.readyState);

    if (xhr.readyState === 4) {
      if (xhr.status === 200) {
        var data = JSON.parse(xhr.responseText);
        console.log(data);
        displayData(data);
      }else{
        alert("Error: " + xhr.status + " " + xhr.statusText);
      }

    }
  };

  xhr.send(null);
})
