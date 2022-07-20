// kelvin value is always going to be constant so const variable is used.
const kelvin = 293;

/* the difference between kelvin and celsius is always going to be kelvin - 273 and is not going to change so const variable is used. */
const celsius = kelvin - 273;

/* let allows the variable value to be reassigned. The result of celsius * (9/5) + 32 is stored in the fahrenheit variable. */
let fahrenheit = celsius * (9/5) + 32;

/* fahrenheit is rounded down to a full number by Math.floor and this value is reassigned into the fahrenheit variable. */
fahrenheit = Math.floor(fahrenheit);

// logs to console what the temperature is in fahrenheit.
console.log(`The temperature is ${fahrenheit} degrees in fahrenheit`);


// 0 kelvin in fahrenheit 

/* const kelvin = 0;
const celsius = kelvin - 273;
let fahrenheit = celsius * (9 / 5) + 32;
fahrenheit = Math.floor(fahrenheit);
console.log(`The temperature is ${fahrenheit} degrees in fahrenheit`); */

// The temperature is -460 degrees in fahrenheit

