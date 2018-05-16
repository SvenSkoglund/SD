//
// Create files named lab2.js and lab2.html.
//
// Assess the equality of the following using the equality operator. Try to think what the result will be before printing the result with console.log():
//
// undefined,null
console.log(undefined == null); // TRUE
// NaN, NaN
console.log(NaN == NaN); //FALSE
// new String('foo'), 'foo'
console.log(new String('foo') == 'foo'); //TRUE
// '', false
console.log('' == false); // TRUE
// [1,2], '1,2'
console.log([1,2] == '1,2'); //TRUE
// '1', true
console.log('1' == true); //TRUE
// NaN, false
console.log(NaN == false); //FALSE
// 0, ''
console.log(0 == ''); //TRUE





console.log('-------------------------------------------');
//----------------------------------------------------
// Assess the strict equality of the same pairs from #1.
console.log(undefined === null); // FALSE
// NaN, NaN
console.log(NaN === NaN); //FALSE
// new String('foo'), 'foo'
console.log(new String('foo') === 'foo'); //FALSE
// '', false
console.log('' === false); // FALSE
// [1,2], '1,2'
console.log([1,2] === '1,2'); //FALSE
// '1', true
console.log('1' === true); //FALSE
// NaN, false
console.log(NaN === false); //FALSE
// 0, ''
console.log(0 === ''); //FALSE





console.log('-------------------------------------------');
//----------------------------------------------------
// Use isNaN() to evaluate the JavaScript falsy values. What can and cannot be coerced into a number?
//
// undefined
console.log(isNaN(undefined)); //TRUE
// NaN
console.log(isNaN(NaN)); // TRUE
// null
console.log(isNaN(null)); //FALSE
// ''
console.log(isNaN('')); //FALSE
// false
console.log(isNaN(false)); //FALSE
// 0
console.log(isNaN(0)); // FALSE
