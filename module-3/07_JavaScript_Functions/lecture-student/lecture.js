/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
 function multiplyTogether (num1, num2){
   return num1*num2;
 }
/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
function multiplyNoUndefined(num1 = 0, num2 = 0){
  return num1*num2;
}

 
/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}
/**
 * takes some details about a person and prints a describing sentence
 * @param {string} name the name of the person we are describing
 * @param {number} age the age of the person 
 * @param {string[]} listOfQuirks list of the person's quirks 
 * @param {string} separator string to separate the quirks by (, is default) 
 * @returns {string} funny sentence about the person
 */

function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}

/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  return numbersToSum.reduce((acc, current) => acc + current, /* initial value for accumulator (optional)*/ 0);
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
  return numbersToFilter.filter((num) => num % 3 == 0 );
}

//if more than one line in filter logic
function allDivisibleByThree(numbersToFilter) {
  return numbersToFilter.filter((num) => { 
    if(num % 3 == 0){
      console.log(num)}
    return num % 3 == 0} );
}

function allDivisibleByThreeUsingNonAnon(numbersToFilter){
  return numbersToFilter.filter(isDivisibleByThree);
}

function isDivisibleByThree(num){
  return num%3 === 0;
}

/**
 * for each element in the array, print it on a new line with index
 * @param {[]} arr array
 */

function demoForEach(arr){
  arr.forEach((item, index) => {
    console.log('Item at index ' + index+ ' is ' + item);
  });
}


/**
 * Return a new array with all values doubled
 * @param {number[]} nums 
 * @returns{number[] a new array with all elements from nums doubled} 
 */
function doubleAllArrayVals(nums){
  return nums.map((num) => num * 2);
}

/**
 * Return a new array with all values at even indices doubled
 * @param {number[]} nums 
 * @returns{number[] a new array with all elements at even indices from nums  doubled} 
 */
 function doubleAllArrayValsAtEvenIndices(nums){
  return nums.map((num, index) => {
    if (index % 2 == 0){
     return num * 2}
     return num;
    });
}

/**
 * 
 * @param {string[]} students
 * @returns {string} find student named dan and return it with its index 
 */

//not working?
function findDan(students){
  return students.find((student, index) => {
    if (student == 'Dan'){
     console.log( student + ' found at index ' + index)
      return (student, index);
    }
  })
}

/**
 * 
 * @param {*} numbersToSum 
 */

function sumAllWithAnon (numbersToSum){
  return numbersToSum.reduce(addNums, i);
}

function addNums (sum, number, index){
  console.log('adding ' + sum + ' num')
  return sum + num;
}