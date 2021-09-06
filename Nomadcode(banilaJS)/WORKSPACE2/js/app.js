/* function sayHello(nameOfPerson,age){
    console.log("Hello my name is " + nameOfPerson + "and I'm " + age);
}

sayHello("Minwoo",23);
sayHello("dal",21);
sayHello("lynn",21); */

/* function plus(firstNumber,secondNumber){
    console.log(firstNumber,secondNumber);
}

function divide(a,b){
    console.log(a/b);
}

plus(8,60);
divide(98,20); */

/* const player = {
    name:"nico",
    sayHello : function(otherPersonsName){
        console.log("hello" + otherPersonsName + "nice to meey you");
    },
};

console.log(player.name);
player.sayHello("lynn");

function plus(a,b ){
    console.log(a+b);
}
plus(5,5); */

//////////////////////////////////////////////////////
/* 
const toBuy = ["potato","tomato","pizza"];

console.log(toBuy);
toBuy[2] = "water";
console.log(toBuy);
toBuy.push("meat");
console.log(toBuy);

const player = {
    name : "Nico",
    age:98,
};
console.log(player);
player.name = "nicolas";
console.log(player);
player.sexy = "soon";
console.log(player,console); */

/* function plus(a,b){
    console.log(a + b);
}


plus(5, 10);
plus(5, 9);
plus(1.3333, 9898); */

//////////////////////////////////
/* const calcultor = {
    plus:function(a,b){
        alert(a+b);
    },
    minus:function(a,b){
        alert(a-b);
    },
    divide:function(a,b){
        alert(a/b);
    },
    powerOf:function(a,b){
        alert(a**b);
    }
};

console.log(calcultor.plus(2,3))
calcultor.plus(3,5);
calcultor.minus(5,1);
calcultor.divide(12,4);
calcultor.powerOf(2,4); */
////////////////////////////////////

/* const age = 96;
function calculateKrAge(ageOfForeigner){
    return ageOfForeigner + 2;
};

const KrAge = calculateKrAge(age);

console.log(KrAge);
 */

//////////////////////////////////////

/* const calcultor = {
    plus:function(a,b){
        console.log("hello");
        return a+b;
        console.log("bye bye"); // return 하면 끝나서 이줄은 없는거랑 똑같음
    },
    minus:function(a,b){
        return a-b;
    },
    times:function(a,b){
        return a* b;
    },
    divide:function(a,b){
        return a/b;
    },
    power:function(a,b){
        return a**b;
    }
};

const plusResult = calcultor.plus(2,3); */

/////////////////////////////////////////////

/* const age = parseInt( prompt("How old are you?") );

// console.log(age, parseInt(age));   // 취소를 누르면 null 확인을 누르면 아무것도 안뜬다.

// console.log(isNaN(age));  // false 가 나오면 숫자 true 가나오면 숫자이외

if(isNaN(age)){
    console.log("Please write a number");

} else {
    console.log("Thank you for writing your age.")
} */

///////////////////////////////////////////////


/* const age = parseInt( prompt("How old are you?") );




if(isNaN(age) || age <0){
    console.log("Please write a real positive number");
} else if(age < 18) {
    console.log("You are too young.");
} else if(age >= 18 && age <=50){
    console.log("You can drink");
} else if(age>50 && age <=80){
    console.log("You should exercise");
} else if( age === 100){
    console.log("wow you are wise");
} else if(age > 80){
    console.log("You can do whatever you want.");
}  */

//////////////////////////////////////////////////////

/* const title = document.querySelector(".hello h1");      // .을 먼저찍고 사용해야한다.
// h1이 hello안에h1이 많더라 하더라도 처음것만 가져온다.3개를 다 가져오고싶으면 querySelectorAll을 해야한다.
// querySelector 은 cssselector 을 사용
const title = document.getElementById("Hello");  // 위와 같다. 

// 하위의 무언가를 가져오려면 querySelector을 사용하고 그 아이디 안에 모든것을 가져오려면 getElementById를 사용

 
console.log(title); */

///////////////////////////////////////////////

// const h1 = document.querySelector("div.hello:first-child h1");

//console.log(title);
//console.dir(title); // dir은 상세내용 표시


// title.style.color = "blue";
/* function handlerMouseEnter(){
    console.log("mouse is here!!");
} */

/* function handleTitleClick(){
    h1.style.color="blue";
}

function handleMouseEnter(){
    h1.innerText = "Mouse is here!";
}

function handleMouseLeave(){
    h1.innerText = "Mouse is gone!";
}

function handleWindowResize(){
    document.body.style.backgroundColor = "tomato";
}

function handleWindowCopy(){
    alert("copier!");
}

function handleWindowOffline(){
    alert("SOS no WIFI");
}

function handleWindowOnfline(){
    alert("ALL GOOD");
}

h1.onclick = handleTitleClick;
// title.addEventListener("mouseenter",handlerMouseEnter);
h1.onmouseenter = handleMouseEnter;            //이거랑 밑에거랑 동일
h1.addEventListener("mouseleave",handleMouseLeave);

h1.innerText = "Hello";

window.addEventListener("resize",handleWindowResize);   // 윈도우창 관련된거하면 변함
window.addEventListener("copy",handleWindowCopy);       // ctrl+c (복사) 하면 발생하는 이벤트
window.addEventListener("offline",handleWindowOffline);
window.addEventListener("online",handleWindowOnfline); */


//////////////////////////////////////////////////////////////

/* const h1 = document.querySelector("div.hello:first-child h1");

function handleTitleClick(){
    const currentColor = h1.style.color;
    let newColor;
    if(currentColor === "blue"){
        newColor ="tomato";
    }else{
        newColor ="blue";
    }
    h1.style.color = newColor;
}

h1.addEventListener("click", handleTitleClick); */

///////////////////////////////////////////////////////////////

/* const h1 = document.querySelector("div.hello:first-child h1");

function handleTitleClick(){
    const clickedClass = "clicked";

    if(h1.classList.contains(clickedClass)){
        h1.classList.remove(clickedClass);
    }else{
        h1.classList.add(clickedClass);
    }
   
}
h1.addEventListener("click", handleTitleClick); */

///////////////////////////////////////////////////////////////

/* const h1 = document.querySelector("div.hello:first-child h1");

function handleTitleClick(){
    h1.classList.toggle("clicked");
    // toggle은 classList 에 clicked class 가 이미 있는지 확인해서
    // 만약 잇다면, toggle 이 clicked를 제거하고
    // h1의 classList에 clicked 가 존재하지 않으면 , clicked를 추가해준다.
   
}
h1.addEventListener("click", handleTitleClick); */

/* function handleInnerWidth(){
    if(innerWidth>1500){
        document.body.style.background = "yellow";
    }else if(innerWidth<=1500 && innerWidth>1000){
        document.body.style.background = "white";
    }else{
        document.body.style.background = "blue";
    }
}

window.addEventListener("resize", handleInnerWidth); */

//////////////////////////////////////////////////////////////////

// const loginInput = document.querySelector("#login-form input");
// const loginButton = document.querySelector("#login-form button");
// 밑에거랑 같다 

/* const loginForm = document.getElementById("login-form");
const loginInput = loginForm.querySelector("input");
const loginButton = loginForm.querySelector("button");

function onLoginBtnClick(){
    const username= loginInput.value;
    if(username === ""){
        alert("Please write your name");
    } else if(username.length > 15){
        alert("your name is too long.")
    }

    console.log("hello", loginInput.value);
}

loginButton.addEventListener("click",onLoginBtnClick); */

/////////////////////////////////////////////////////////////////////

/* const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form input");
const greeting = document.querySelector("#greetind");

const HIDDEN_CLASSNAME = "hidden";  //  관습 : string 만 포함된 변수는 대문자 , loginForm,loginInup 과 같이 중요한게 아니라서 대문자로 작성

const link = document.querySelector("a");
function onLoginSubmit(event){
    event.preventDefault();// 이걸 호출하면 브라우저의 기본 동작을 막아줄거야
    loginForm.classList.add(HIDDEN_CLASSNAME);
    const username = loginInput.value;
    localStorage.setItem("username",username)   // localStorage는 저장하는 기능
    greeting.innerText = "hello " + username;
    // greeting.innerText = `Hello ${username}`;   // 위와 같이 뜬다. 
    greeting.classList.remove(HIDDEN_CLASSNAME);
}

// () 들을 더하면 브러우저가 보자마자 자동으로 이 function 을 실행시켜버린다.
loginForm.addEventListener("submit", onLoginSubmit);  */

////////////////////////////////////////////////////////////


const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("#login-form input");
const greeting = document.querySelector("#greetind");

const HIDDEN_CLASSNAME = "hidden";  //  관습 : string 만 포함된 변수는 대문자 , loginForm,loginInup 과 같이 중요한게 아니라서 대문자로 작성
const USERNAME_KEY = "username";

const link = document.querySelector("a");

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


///////////////////////////////////////////////////////////////////


