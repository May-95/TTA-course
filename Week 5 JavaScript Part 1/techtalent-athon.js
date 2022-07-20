// assigns random number between 0-999 into raceNumber variable.
let raceNumber = Math.floor(Math.random() * 1000);

// variable shows whether the runner has registered early. Variable is const because value is not going to change.
const earlyRegistration = true;

// variable stores runner's age. Age is not going to change, so variable is const.
const age = 20;

// if statement checking if a runner is over 18 and if they registered early. Early adult runners have 1000 added to their race number.  
if (earlyRegistration && age > 18) {
    raceNumber += 1000;
}

// if statement checking runner's age and if they registered early. Logs to the console runner's race time and their race number. 
if (age > 18 && earlyRegistration) {
    console.log(`You will race at 9.30 am and your race number is ${raceNumber}.`)
} else if (age > 18 && !earlyRegistration) {
    console.log(`You will race at 11.00 am and your race number is ${raceNumber}.`)
} else if (age < 18) {
    console.log(`You will race at 12.30 pm and your race number is ${raceNumber}.`)
} else {
    console.log('Please see the registration desk.')
}
