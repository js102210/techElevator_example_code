let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

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
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

function markItemComplete(event) {
  icon = event.target.querySelector('i');
  if (!event.target.classList.contains('completed')){
    event.target.classList.add('completed');
    icon.classList.add('completed');
  }
}

function markItemIncomplete(event){
  icon = event.target.querySelector('i');
  if (event.target.classList.contains('completed')){
    event.target.classList.remove('completed');
    icon.classList.remove('completed');
  }
}

function markAllItemsComplete(){
  const groceryList = document.querySelectorAll('li');
  groceryList.forEach((element) => {
    icon = element.querySelector('i');
    if (!element.classList.contains('completed'))
    element.classList.add('completed');
    icon.classList.add('completed');
  })
}

function markAllItemsIncomplete(){
  const groceryList = document.querySelectorAll('li');
  groceryList.forEach((element) => {
    icon = element.querySelector('i');
    if (element.classList.contains('completed'))
    element.classList.remove('completed');
    icon.classList.remove('completed');
  })
}


function toggleAllItems(event){
 if (allItemsIncomplete){
   markAllItemsComplete();
   allItemsIncomplete = false;
   event.target.innerText = 'Mark All Incomplete'
 } else {
   markAllItemsIncomplete();
   allItemsIncomplete = true;
   event.target.innerText = 'Mark All Complete'
 }
 
  
}

document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();

  const groceryList = document.querySelectorAll('li');
  groceryList.forEach((element) => {
    element.addEventListener('click', markItemComplete);
    element.addEventListener('dblclick', markItemIncomplete);
  })

  const toggleAllBtn = document.getElementById('toggleAll');
  toggleAllBtn.addEventListener('click', toggleAllItems);
  




});

