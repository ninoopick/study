const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form input");
const greeting = document.querySelector("#greetind");

const HIDDEN_CLASSNAME = "hidden";  //  관습 : string 만 포함된 변수는 대문자 , loginForm,loginInup 과 같이 중요한게 아니라서 대문자로 작성
const USERNAME_KEY = "username";


function onLoginSubmit(event){
    event.preventDefault();// 이걸 호출하면 브라우저의 기본 동작을 막아줄거야
    loginForm.classList.add(HIDDEN_CLASSNAME);
    const username = loginInput.value;
    localStorage.setItem("USERNAME_KEY",username)   // localStorage는 저장하는 기능
    paintGreetings(username);
}

// () 들을 더하면 브러우저가 보자마자 자동으로 이 function 을 실행시켜버린다.

function paintGreetings(username){
    greeting.innerText = `Hello ${username}`;
    greeting.classList.remove(HIDDEN_CLASSNAME);
}

const savedUsername = localStorage.getItem("USERNAME_KEY");

if(savedUsername === null){
    // show the form
    loginForm.classList.remove(HIDDEN_CLASSNAME);
    loginForm.addEventListener("submit", onLoginSubmit);
}else{
    // show the greetings
   paintGreetings(savedUsername);
}