/*
0 : 'startingArray' ...
*/

var startingArray = [
  1,2,3,4,NaN,6,7,8,9,NaN,NaN,12,13,14
];

/*
1 : Modify `ex1` ...

Use `splice` and `forEach` to remove all occurrences of `NaN` from the `startingArray`,
and replace each with the next number in the sequence (e.g: `[4,NaN]` would become
`[4,5]`).

Ensure that you do not modify the actual values of `startingArray`, but instead return
a new array. (***HINT:*** You will need to create a new array with the values of the
one provided as an argument).

*/

var ex1 = function(arr) {
/******************* Your Solution *******************/
var newArray = [];
arr.forEach(function(value){
  if(isNaN(value)){
    newArray.push(newArray[newArray.length - 1] +1);
  }else{
    newArray.push(value);
  }

})
console.log(newArray);
return newArray;
/*****************************************************/
};

// console.log(ex1([77,NaN,79, 80]));

/*
2 : Modify `ex2` ...

Use `map`, return a new array, convert all of the `NaN` values to `0`.

*/

var ex2 = function(arr) {
/******************* Your Solution *******************/
var newArray = arr.map(function(value){
  if (isNaN(value)) return 0;
  else return value;
})
return newArray;
/*****************************************************/
};
// var test = [1,NaN,NaN,NaN,NaN,9,8,10];
// console.log(ex2(test));

/*
3 : Modify `ex3` ...

Use `filter`, return a new array which is a subset of the `startingArray` and
does not contain any NaN values.
*/

var ex3 = function(arr) {
/******************* Your Solution *******************/
var newArray = arr.filter(function(value){
  if (isNaN(value)) return false;
  else return true;
})
return newArray;
/*****************************************************/
};

// var test = [1,NaN,NaN,NaN,NaN,9,8,10];
// console.log(ex3(test));

/*
4 : Modify `ex4` ...

Use your solution to `ex3` to return a filtered array without NaN, then `reverse` the order of the array, then use the `reduce` function to subtract all of the values.
*/

var ex4 = function(arr) {
/******************* Your Solution *******************/
var newArray = arr.filter(function(value){
  if (isNaN(value)) return false;
  else return true;
})
newArray = newArray.reverse();
newArray = newArray.reduce(function(value1, value2){
  return value1-value2;
})
return newArray;
/*****************************************************/
};
// var test = [1,NaN,NaN,NaN,NaN,9,8,10];
// console.log(ex4(test));

/*
5 : Modify `ex5` ...

Use `sort` to order the `startingArray` such that the numbers are in ascending
order, and the NaN values are the last three elements of the array. (***HINT:***
 Use an 'or' operator). Be sure not to modify the original array.
*/
var ex5 = function(arr) {
/******************* Your Solution *******************/
var newArray = arr.sort(function(a,b){
  if(isNaN(a)) return 1;
  if(isNaN(b)) return -1;
  else return a - b;
})
return newArray;
/*****************************************************/
};
// var test = [1,NaN,NaN,NaN,NaN,9,8,10];
// console.log(ex5(test));

/*
6 : Modify `ex6` ...

Use array methods to rotate the values of the array input. For example, if the
`spaces` parameter were 5, the array would be rotated 5 spaces:

```js
var a = [1,2,3,4,NaN,6,7,8,9,NaN,NaN,12,13,14];

ex6(a,5); // => [6,7,8,9,NaN,NaN,12,13,14,1,2,3,4,NaN];
```
*/

var ex6 = function(arr, spaces) {
console.log(spaces);
  console.log(arr);
/******************* Your Solution *******************/
for (var i = 0 ; i < spaces ; i++){
  arr.push(arr[0]);
  arr.splice(0,1);
}
console.log(arr);
return arr;
/*****************************************************/
};

var test = [1,2,3,4,5,6,7,8,9,10];
console.log(ex6(test,3,"xerplex"));
