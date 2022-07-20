// user's name is not going to change so variable is set to const.
const userName = "John";

/* ternary expression checks if user has entered a name. If user has entered a name, it will log to the console 'Hello' + user's name. If they have not entered a name, it just logs to the console 'Hello!' */
userName ? console.log(`Hello, ${userName}!`) : console.log('Hello!');

/* user's question is stored in userQuestion variable. Question asked by user is logged to the console. Template literals used to make it more readable. */
let userQuestion = 'Will I pass my exams?';
console.log(`${userName} has asked: ${userQuestion}`);

/* Math.random generates a random number between 0 and 7. Math.floor rounds the number to a whole number. This number is then stored in the randomNumber variable. */
const randomNumber = Math.floor(Math.random() * 8);

/* let variable used because the value is going to be changed later in the code. */
let eightBall = "";

/* if statement checks if randomNumber is a specific number. Each number has a specific message it will store in the eightBall variable. An else statment is added to see if there are any errors. */
if (randomNumber === 0) {
    eightBall = 'It is certain.';
} else if (randomNumber === 1) {
    eightBall = 'It is decidedly so.';
} else if (randomNumber === 2) {
    eightBall = 'Reply hazy try again.';
} else if (randomNumber === 3) {
    eightBall = 'Cannot predict now.';
} else if (randomNumber === 4) {
    eightBall = 'Do not count on it.';
} else if (randomNumber === 5) {
    eightBall = 'My sources say no.';
} else if (randomNumber === 6) {
    eightBall = 'Outlook not so good.';
} else if (randomNumber === 7) {
    eightBall = 'Signs point to yes.';
} else {
    eightBall = 'Error!';
}

// logs to console the answer stored in the eightBall variable.  
console.log(eightBall);