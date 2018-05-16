// Create an array of numbers named nums that stores the values 1-10.

var nums = [1,2,3,4,5,6,7,8,9,10];

// Use forEach to print out the current index, followed by the number stored there.

nums.forEach(function(value,index){
  console.log(index + " : " + value);
})

// Use filter() to return only the numbers from your nums array that are even.

var numsFiltered = nums.filter(function(value){
  return value % 2 === 0;
})

console.log(numsFiltered);

// Use reduce() to sum all of the numbers in your nums array.

var numsReduced = nums.reduce(function(a,b){
  return a+b;
});

console.log(numsReduced);

// Use map to add a ! to the end of each of the numbers in the nums array.

var numsMapped = nums.map(function(value){
  return value + "!";
})

console.log(numsMapped);
