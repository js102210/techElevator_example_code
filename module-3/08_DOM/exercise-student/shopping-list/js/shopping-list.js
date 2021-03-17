// add pageTitle
const pageTitle = 'My Shopping List';
const groceries = ['item1','item2','item3','item4','item5','item6','item7',
'item8','item9','item10'];

// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const groceryList = document.getElementById('groceries');
  i = 0;
  groceries.forEach((item) => {
    const listItem = document.createElement('li');
    listItem.innerText = groceries[i];
    groceryList.appendChild(listItem);
    i++;
  }
  );

}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  groceryList = document.getElementById('groceries');
  groceryListItems = groceryList.getElementsByTagName('li');
  
  for (let i = 0; i < groceryListItems.length; i++){
    item = groceryListItems[i];
    item.classList.add('completed');
  }
   
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
