//Task 1: Kelvin Working Conditions

// using let because it allows variables to be declared without a value.
let temperature;
let condition;
let goToWork;

// temperature variable will store the value the user inputs into the browser when asked 'what is the temperature?' 
temperature = prompt('What is the temperature?');

// condition variable will store the user's answer to the prompt of 'what is the weather condition like?'. Including the anticipated values to help the user. Using toLowerCase method to make sure we can directly compare later on in the case-switch.
condition = prompt('What is the weather condition? sunny, cloudy, raining, snowing, or thunder?').toLowerCase();

// converting the temperature value into a number just to be sure.
temperature = Number(temperature);

// case-switch checking the temperature and condition. If the case is true, a value is assigned to goToWork variable. If temperature and condition match nothing, alerts user it is 'unable to decide'. 
switch (true) {
    case (temperature < 10):
    case (temperature > 30):
        goToWork = false;
        break;
    case (temperature > 20 && condition == 'sunny'):
    case (temperature > 20 && condition == 'cloudy'):
    case (temperature > 20 && condition == 'raining'):
        goToWork = true;
        break;
    case (temperature > 20 && condition == 'snowing'):
    case (temperature > 20 && condition == 'thunder'):
        goToWork = false;
        break;
    case (temperature >= 10 && condition == 'sunny'):
    case (temperature >= 10 && condition == 'cloudy'):
        goToWork = true;
        break;
    case (temperature >= 10 && condition == 'raining'):
    case (temperature >= 10 && condition == 'snowing'):
    case (temperature >= 10 && condition == 'thunder'):
        goToWork = false;
        break;
    default:
        alert("Unable to decide if weather is fit for purpose!");
}

// variable will store our message to the user.
let message = "";

// if goToWork variable is true, message has the 'continue working' message stored in it and the 'message' is alerted onto the user's screen. If goToWork is false, message has 'stop working' stored in it and message is alerted to the user's screen. If goToWork has nothing stored in it, message says 'unable to decide'.
if (goToWork) {
    message = "Weather is fit for purpose. Continue working on new lab.";
    alert(message)
} else if (goToWork == false) {
    message = "Weather is not fit for purpose. Stop working on new lab.";
    alert(message)
} else {
    alert("Unable to decide if weather is fit for purpose!");
}


// stretch challenge: 

// question variable will be storing user's answer to the question - if they want to check the weather conditions again?
let question;

do {
    let temperature;
    let condition;
    let goToWork;
    let message = "";
    
    temperature = prompt('What is the temperature?');
    condition = prompt('What is the weather condition? sunny, cloudy, raining, snowing, or thunder?').toLowerCase();
    temperature = Number(temperature);

    // function checks temperature and condition. Depending on the answer, variable 'goToWork' is assigned false or true. Default case for errors which console logs to the user that we are 'unable to decide'. 
    function checkWeather() {
        switch (true) {
            case (temperature < 10):
            case (temperature > 30):
                goToWork = false;
                break;
            case (temperature > 20 && condition == 'sunny'):
            case (temperature > 20 && condition == 'cloudy'):
            case (temperature > 20 && condition == 'raining'):
                goToWork = true;
                break;
            case (temperature > 20 && condition == 'snowing'):
            case (temperature > 20 && condition == 'thunder'):
                goToWork = false;
                break;
            case (temperature >= 10 && condition == 'sunny'):
            case (temperature >= 10 && condition == 'cloudy'):
                goToWork = true;
                break;
            case (temperature >= 10 && condition == 'raining'):
            case (temperature >= 10 && condition == 'snowing'):
            case (temperature >= 10 && condition == 'thunder'):
                goToWork = false;
                break;
            default:
                alert("Unable to decide if weather is fit for purpose!");
        }
    }
    
    // calling checkWeather function to run which evaluates the weather conditions.  
    checkWeather();

    // evaluates the results of the weather conditions evaluation and displays the correct message to the user. 
    if (goToWork) {
        message = "Weather is fit for purpose. Continue working on new lab.";
        alert(message)
    } else if (goToWork == false) {
        message = "Weather is not fit for purpose. Stop working on new lab.";
        alert(message)
    } else {
        alert("Unable to decide if weather is fit for purpose!");
    }

    // user asked if they want to check weather conditions again. Answer stored in 'question'. The toLowerCase method is used on 'question' to make comparisons easier.
    question = prompt('Do you want to check the weather conditions again?').toLowerCase();

    // the loop will run as long as the user keeps answering 'yes' to whether they want to check the weather conditions again. 
} while (question == 'yes')
