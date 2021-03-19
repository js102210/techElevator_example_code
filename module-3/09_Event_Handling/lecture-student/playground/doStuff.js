
/*make a listener so when a user clicks push-me
we check the checkbox and enter text*/
//get the button

function demoPreviousElementSibling() {
    const buttonOne= document.getElementById('button-one');
    const prevElementSibling = buttonOne.previousElementSibling;
    prevElementSibling.innerText= 'Previous element sibling to button 1';
    const nextElementSib = buttonOne.nextElementSibling;
    nextElementSib.innerText='Next element sibling to button 1';
}


function checkTheCheckBoxAndEnterText(event){
    const cb = document.querySelector('div input');
    cb.checked=true;
    cb.nextElementSibling.value= event.target.innerText;
}

function makeBackgroundGreen(target){
    target.classList.add('greenBackground');
}

const pushMeButton = document.getElementById('button-one');
pushMeButton.addEventListener('click', checkTheCheckBoxAndEnterText);




const dontPushMe = document.getElementById('button-two');
dontPushMe.addEventListener('click', (event) => event.target.setAttribute('class', 'maketextcolor'));

/* any time anyone clicks in the buttonDiv change the background to green */
const buttonDiv = document.getElementById('buttons');
buttonDiv.addEventListener('click', (event) => makeBackgroundGreen(event.currentTarget));