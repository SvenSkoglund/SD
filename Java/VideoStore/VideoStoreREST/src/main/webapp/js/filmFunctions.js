window.addEventListener('load', function(e) {
	console.log('document loaded');
	init();
});

function init() {
	document.filmForm.lookup.addEventListener('click', function(event) {
		event.preventDefault();
		var filmId = document.filmForm.filmId.value;
		if (!isNaN(filmId) && filmId > 0) {
			getFilm(filmId);
		}
	})
	document.createFilmForm.filmButton.addEventListener('click', function(event) {
		event.preventDefault();
		createFilm();
	})
}

function getFilm(filmId) {
	// TODO:
	// * Use XMLHttpRequest to perform a GET request to "api/films/"
	// with the filmId appended.
	// * On success, if a response was received parse the film data
	// and pass the film object to displayFilm().
	// * On failure, or if no response text was received, put "Film not found"
	// in the filmData div.
	var xhr = new XMLHttpRequest();
	xhr.open("GET", "api/films/" + filmId, true);
	xhr.onreadystatechange = function() {
		if (xhr.readyState === 4) {
			if (xhr.status === 200 || xhr.status === 201) {
				var filmData = xhr.responseText;
				var filmObject = JSON.parse(filmData);
				displayFilm(filmObject);
				displayActors(filmObject.id);
			} else {
				displayError();
			}
		}

	}

	xhr.send(null);
}

function createFilm(){
	var film = document.createFilmForm;
	var filmObject = {title: film.title.value, description: film.title.value, releaseYear: film.releaseYear.value, length: film.length.value, rating: film.rating.value};

	var filmJson =JSON.stringify(filmObject);
	console.log(filmJson);
	var xhr = new XMLHttpRequest();
	xhr.open("POST", "api/films", true);
	xhr.setRequestHeader("Content-type","application/json");
	xhr.onreadystatechange = function() {
		if (xhr.status === 200 || xhr.status === 201) {
			var filmObject = JSON.parse(filmJson);
			displayFilm(filmObject);
		} else {
			displayError();
		}
	}
	
	xhr.send(filmJson);
}
function displayActors(id) {
	var actorDiv = document.getElementById('actorData');
	console.log("api/films/" + id + "/actors");
	actorDiv.textContent = '';
	var xhr = new XMLHttpRequest();
	xhr.open("GET", ("api/films/" + id + "/actors"), true);
	xhr.onreadystatechange = function() {
		if (xhr.readyState === 4) {
			console.log("in readystate")
			if (xhr.status === 200 || xhr.status === 201) {
				var actorData = xhr.responseText;
				var actorsObject = JSON.parse(actorData);
				var list = document.createElement("ul");
				list.textContent = "Actors";

				// // * Rating, release year, and length as an unordered list.
				for (var i = 0; i < actorsObject.length; i++) {
					var item = document.createElement("li");
					item.textContent = actorsObject[i].firstName + " " + actorsObject[i].lastName;
					list.appendChild(item);
				}
				actorDiv.appendChild(list);
				
			}
		}
	}

	xhr.send(null);


	
}

function displayFilm(film) {
	var dataDiv = document.getElementById('filmData');
	dataDiv.textContent = '';
	// TODO:
	// * Create and append elements to the data div to display:
	// * Film title (h1) and description (blockquote).
	var title = document.createElement("h1");
	title.textContent = film.title;
	dataDiv.appendChild(title);

	var description = document.createElement("blockquote");
	description.textContent = film.description;
	dataDiv.appendChild(description);

	var list = document.createElement("ul");
	dataDiv.appendChild(list);

	// * Rating, release year, and length as an unordered list.
	var rating = document.createElement("li");
	rating.textContent = film.rating;
	list.appendChild(rating);

	var releaseYear = document.createElement("li");
	releaseYear.textContent = film.releaseYear;
	list.appendChild(releaseYear);

	var length = document.createElement("li");
	length.textContent = film.length;
	list.appendChild(length);

}

function displayError() {
	var dataDiv = document.getElementById('filmData');
	dataDiv.textContent = '';
	var error = document.createElement("h1");
	error.textContent = "Film not found!";
	dataDiv.appendChild(error);
}