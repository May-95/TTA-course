// Task 4: Calculator

// user is prompted to enter a number and is stored in firstValue.
let firstValue = prompt('Input a number.');

// while loop runs while firstValue is not a number, user is alerted that what they have entered is not a number and are prompted to enter a number again. Loop runs until the user enters a number.
while (isNaN(firstValue)) {
    alert(`${firstValue} is not a number. Try again!`);
    firstValue = prompt('Input your first number again.');
}

// user enters second number and is stored in secondValue variable.
let secondValue = prompt('Input a second number.');

// while loop checking value is a number.
while (isNaN(secondValue)) {
    alert(`${secondValue} is not a number. Try again!`);
    secondValue = prompt('Input your second number again.');
}
// user asked to enter one of the 5 operators. While loop checks if they have entered one of the 5. If not, user is prompted to enter one again.
let operation = prompt('Enter one of these 5 operators: - + / * ^');
while (operation !== "-" && operation !== "+" && operation !== "/" && operation !== "*" && operation !== "^") {
    alert(`${operation} is not an operator. Try again!`);
    operation = prompt('Enter one of these 5 operators: - + / * ^');
};

// firstValue and secondValue values converted into number just to be sure.
firstValue = Number(firstValue);
secondValue = Number(secondValue);

// answer variable will store the answer later on.
let answer;

// function will take in firstValue and secondValue as parameters. 
function calculate(x, y) {
    // function for each mathematical operation. Each one takes in firstValue and secondValue and return the results of the operation.
    const addition = (x, y) => { return x + y; }
    const subtraction = (x, y) => { return x - y; }
    const division = (x, y) => { return x / y; }
    const multiplication = (x, y) => { return x * y; }
    const powerOf = (x, y) => { return x ** y; }

    // case-switch compares the operation user has entered and uses the correct function to calculate the answer and the answer is stored in the 'answer' variable. Default case handles errors if the case-switch does not recognise the operator. 
    switch (operation) {
        case "+":
            answer = addition(x, y);
            break;
        case "-":
            answer = subtraction(x, y);
            break;
        case "/":
            answer = division(x, y);
            break;
        case "*":
            answer = multiplication(x, y);
            break;
        case "^":
            answer = powerOf(x, y);
            break;
        default:
            alert('Wrong operator entered! Please start again!');
            break;
    }

    // if statement that checks the answer is a number. If it is, it prints to the console operation performed and the answer. If the answer is not a number, an alert pops up that something has gone wrong and that user should start again. 
    if (!isNaN(answer)) {
        console.log(`${firstValue} ${operation} ${secondValue} = ${answer}`);
    } else {
        alert('Something has gone wrong. Start again.');
    }
}
// runs function with the variable firstValue and secondValue as arguments.
calculate(firstValue, secondValue);


// Stretch Challenge #1: 

// question variable will store user's answer when asked if they 'would like to do another calculation'.
let question;

// do-while loop used because it always executes at least once and will continue while the condition is true. 
do {
    let firstValue = prompt('Input a number.');
    while (isNaN(firstValue)) {
        alert(`${firstValue} is not a number. Try again!`);
        firstValue = prompt('Input your first number again.');
    }

    let secondValue = prompt('Input a second number.');
    while (isNaN(secondValue)) {
        alert(`${secondValue} is not a number. Try again!`);
        secondValue = prompt('Input your second number again.');
    }
    let operation = prompt('Enter one of these 5 operators: - + / * ^');
    while (operation !== "-" && operation !== "+" && operation !== "/" && operation !== "*" && operation !== "^") {
        alert(`${operation} is not an operator. Try again!`);
        operation = prompt('Enter one of these 5 operators: - + / * ^');
    };

    firstValue = Number(firstValue);
    secondValue = Number(secondValue);

    let answer;

    function calculate(x, y) {
        const addition = (x, y) => { return x + y; }
        const subtraction = (x, y) => { return x - y; }
        const division = (x, y) => { return x / y; }
        const multiplication = (x, y) => { return x * y; }
        const powerOf = (x, y) => { return x ** y; }

        switch (operation) {
            case "+":
                answer = addition(x, y);
                break;
            case "-":
                answer = subtraction(x, y);
                break;
            case "/":
                answer = division(x, y);
                break;
            case "*":
                answer = multiplication(x, y);
                break;
            case "^":
                answer = powerOf(x, y);
                break;
            default:
                alert('Wrong operator entered! Please start again!');
                break;
        }

        if (!isNaN(answer)) {
            console.log(`${firstValue} ${operation} ${secondValue} = ${answer}`);
        } else {
            alert('Something has gone wrong. Start again.');
        }
    }
    calculate(firstValue, secondValue);

    // user asked if they want to do another calculation. User's answer assigned to question variable. toLowerCase method used on question so we can compare in the while condition.
    question = prompt('Would you like to do another calculation? yes or no?').toLowerCase();

    // loop will run until the user's answer is 'no'
} while (question != 'no');

