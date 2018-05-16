var log = [];

var day1 = {
  date : "May 16 2017",
  didWorkout : true,
  foodConsumed : ["Eggs", "Spinach", "Protein Shake", "Green Chille"]
}
var day2 = {
  date : "May 15 2017",
  didWorkout : false,
  foodConsumed : ["Eggs", "Spinach", "Protein Shake", "Green Chille","Mexican Food"]
}
var day3 = {
  date : "May 14 2017",
  didWorkout : true,
  foodConsumed : ["Eggs", "Spinach", "Protein Shake", "Green Chille", "Broccoli Bacon"]
}

log.push(day1);
log.push(day2);
log.push(day3);

log.forEach(function(obj){
  for (var variable in obj) {
    if (obj.hasOwnProperty(variable)) {
      console.log(variable + " : " + obj[variable]);
    }
  }
})
