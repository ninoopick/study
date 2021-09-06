const toDoForm = document.getElementById("todo-form");
const toDoInput = document.querySelector("#todo-form input");
const toDoList = document.getElementById("todo-list");

const TODOS_KEYS= "todos"

let toDos = [];

function saveToDos(){
    localStorage.setItem(TODOS_KEYS, JSON.stringify(toDos));
    // JSON.stringify = string값으로 저장하고 싶을때
}


function deleteToDo(event){         // 지우기
    const potato = event.target.parentElement;
    potato.remove();
    toDos = toDos.filter((toDo) => toDo.id !== parseInt(potato.id));
    saveToDos();
}

function paintToDo(newTodo){
    const potato = document.createElement("li");
    potato.id = newTodo.id;
    // console.log("i will paint", newTodo);
    const span = document.createElement("span");
    span.innerText = newTodo.text;
    const button = document.createElement("button");
    button.innerText = "X";
    button.addEventListener("click", deleteToDo);
    potato.appendChild(span);
    potato.appendChild(button);
    toDoList.appendChild(potato);
}


function handleToDoSubmit(event) {
    event.preventDefault();
    const newTodo = toDoInput.value;
    toDoInput.value = "";
    const newTodoObj = {
        text : newTodo,
        id : Date.now(),
    };
    toDos.push(newTodoObj);
    paintToDo(newTodoObj);
    saveToDos();
}

toDoForm.addEventListener("submit", handleToDoSubmit);

const savedToDos = localStorage.getItem(TODOS_KEYS);

if(savedToDos !== null){
    const parsedToDos = JSON.parse(savedToDos);
    toDos = parsedToDos;
    parsedToDos.forEach(paintToDo);
}

/* function sayHello(item){
    console.log("this is the turn of",item);
}
parsedToDos.forEach((item) => console.log("this is the turn of",item)); 
위에3줄과 밑에 한줄이 같은 의미 한줄로 요약 가능 대신 => 사용*/


