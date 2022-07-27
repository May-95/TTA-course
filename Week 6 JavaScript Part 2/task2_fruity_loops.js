// Task 3: Fruity Loops

// fruits variable is holding a list of fruit words. Variable is a const because we are not changing that variable. 
const fruits = ['Apple', 'Orange', 'Banana', 'Pear', 'Peach', 'Strawberry', 'Cherry', 'Acai'];

// for in loop iterates through each element of the array
for (let fruit in fruits) {

  // using let variable for vowels and consonants because we will be adding to it later on. 
  let vowels = 0;
  let consonants = 0;

  // looping through each fruit word and checking each letter to count how many vowels and consonants each word has. 
  for (let i = 0; i < fruits[fruit].length; i++) {
    // used case-switch to compare the letters because it is cleaner than a nested-if statements. toLowerCase method used on each letter to make it easier to compare. If the letter matches a vowel, 1 is added to the vowels variable. If not, 1 is added to the consonants variable.
    switch (fruits[fruit][i].toLowerCase()) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        vowels++;
        break;
      default:
        consonants++;
    }
  }

  // printing to the console, how many vowels and consonants each word has. Used template literals because of readability. 
  console.log(`${fruits[fruit]} has ${vowels} vowels and ${consonants} consonants.`)
}


// Stretch Challenge #1:

const fruits = ['Apple', 'Orange', 'Banana', 'Pear', 'Peach', 'Strawberry', 'Cherry', 'Acai'];

for (const fruit in fruits) {
  let vowels = 0;
  let consonants = 0;

  // let variable used because it will later be reassigned. It will hold either 'An' or 'A' depending on whether fruit name starts with a vowel or a consonant. 
  let start = "";

  for (let i = 0; i < fruits[fruit].length; i++) {
    switch (fruits[fruit][i].toLowerCase()) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        vowels++;
        break;
      default:
        consonants++;
    }

    // case-switch checks the first character of each word and compares it to the cases. If the first letter is a vowel, the variable 'start' is assigned 'An' and if it is anything else, 'A' is assigned to the 'start' variable. 
    switch (fruits[fruit][0]) {
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        start = 'An';
        break;
      default:
        start = 'A';
    }
  }

  // pluralV variable will hold an 's' when there is more than one vowel in a word. Same thing for pluralC when there is more than one constonant in a word.  
  let pluralV = '';
  let pluralC = '';

  // if vowels is more than 1, pluralV will have 's' stored in it. If not, it will be an empty string. Same thing for pluralC. 
  vowels > 1 ? pluralV = 's' : pluralV = '';
  consonants > 1 ? pluralC = 's' : pluralC = '';

  // display message has been amended to start with the correct word depending on whether the first character of the fruit word was a vowel or a consonant. pluralV/pluralC hold an 's' or nothing depending on if vowel/consonant is singular or plural. 
  console.log(`${start} ${fruits[fruit]} has ${vowels} vowel${pluralV} and ${consonants} consonant${pluralC}.`)
}



