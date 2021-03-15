/*
1. **iqTest** Bob is preparing to pass an IQ test. The most frequent task in this test 
    is to find out which one of the given numbers differs from the others. Bob observed
    that one number usually differs from the others in evenness. Help Bob — to check his 
    answers, he needs a program that among the given numbers finds one that is different in 
    evenness, and return the position of this number. _Keep in mind that your task is to help 
    Bob solve a real IQ test, which means indexes of the elements start from 1 (not 0)_

		iqTest("2 4 7 8 10") → 3 //third number is odd, while the rest are even
		iqTest("1 2 1 1") → 2 // second number is even, while the rest are odd
		iqTest("") → 0 // there are no numbers in the given set
        iqTest("2 2 4 6") → 0 // all numbers are even, therefore there is no position of an odd number
*/
function iqTest(str){
    result = 0;
    iqArr = str.split(' ');
    if (iqArr.length > 1){
        numOdd = 0;
        numEven = 0;
        for (int of iqArr){
            if (int % 2 == 0){
                numEven++;
                posEven = iqArr.indexOf(int);
            } else {
                numOdd++;
                posOdd = iqArr.indexOf(int);
            }
        }
        if (numOdd == 1){
            result = posOdd + 1;
        }
        if (numEven == 1){
            result = posEven + 1;
        }

    }
    return result;
}

/*
2. **titleCase** Write a function that will convert a string into title case, given an optional 
    list of exceptions (minor words). The list of minor words will be given as a string with each 
    word separated by a space. Your function should ignore the case of the minor words string -- 
    it should behave in the same way even if the case of the minor word string is changed.


* First argument (required): the original string to be converted.
* Second argument (optional): space-delimited list of minor words that must always be lowercase
except for the first word in the string. The JavaScript tests will pass undefined when this 
argument is unused.

		titleCase('a clash of KINGS', 'a an the of') // should return: 'A Clash of Kings'
		titleCase('THE WIND IN THE WILLOWS', 'The In') // should return: 'The Wind in the Willows'
        titleCase('the quick brown fox') // should return: 'The Quick Brown Fox'
*/

/*
function titleCase(str, list){
    resultString = str.split(' ');
    realResultString = "";
    exceptions = [];
    
    if (list != undefined){
        list = list.toLowerCase();
        exceptions = list.split(' ');
    }

    for (word of resultString){
        firstChar = word.substring(0,1);
        firstChar = firstChar.toUpperCase();
        word = firstChar + word.substring(1).toLowerCase();
        realResultString += word + " ";
    
    }
    i = 0;
    realResultString = realResultString.split(' ');
    for (word of realResultString){
        if (exceptions.includes(word)){
            word = word.toLowerCase();
        }
        i++;
    }


realRealResultString = "";
i = 0;
for (word of realResultString){
    if (!exceptions.includes(word.toLowerCase()) || i==0 && !exceptions.includes(word)){
        realRealResultString += word;
    } else {
        realRealResultString += word.toLowerCase();
    }
   
    if (i != realResultString.length){
        realRealResultString += " ";
    }
    i++;
}

realRealResultString = realRealResultString.trim();
return realRealResultString;
} */

function titleCase (str, list){
    str = str.toLowerCase();
    resultArr = str.split(' ');
    if (list != undefined){
        list = list.toLowerCase();
        exceptions = list.split(' ');
    }
    resultArr[0] = casing(resultArr[0]);
    for (let i = 1; i < resultArr.length; i++){
        if (!exceptions.includes(resultArr[i])){
            resultArr[i] = casing(resultArr[i]);
        } else {
            resultArr[i] = resultArr[i].toLowerCase();
        }
    }
  return resultArr.join(' ');
}
function casing (str){
    str = str.charAt(0).toUpperCase() + str.substring(1).toLowerCase();
    return str;
}




/*
//the better way that I didn't actually come up with
function titleCase(str, exceptions) {
    let titleWords = str.split( ' ' );
    titleWords[0] = titleWords[0].charAt(0).toUpperCase() + titleWords[0].substr(1).toLowerCase();
    for(i = 1; i < titleWords.length; i++) {
        if(typeof exceptions !== 'undefined' && wordIsArticle(titleWords[i], exceptions.split(' '))) {
            titleWords[i] = titleWords[i].toLowerCase();
        }
        else {
            titleWords[i] = titleWords[i].charAt(0).toUpperCase() + titleWords[i].substr(1).toLowerCase();
        }
    }
    return titleWords.join(' ');
}
function wordIsArticle(w, a) {
    for(x = 0; x < a.length; x ++ ) {
        if(w.toLowerCase() === a[x].toLowerCase()) {
            return true;
        }
    }
    return false;
} */