const a = 10;
const b = 2;
let myName = "minwoo";
let veryLongVariableName = 0;

console.log(a+b);
console.log(a*b);
console.log(a/b);
console.log("hello " + myName);

myName = "Minwoos";

console.log("your new name is " + myName);

// 일반적으로 const  변하는 값을 쓸때는 let

    const amIFat = null;
    let something;
    console.log(something,amIFat);

// null 은 아예 없는것 true, false 는 값이 있는것
// undifined,true,flase는 타입이다.
// undifined 는 컴퓨터가 variabale에 대해 인지하지만 값이 없는것


const daysOfWeek = ["mon" , "tue" , "wed" , "thu" , "fri" , "sat" ];
// array가 된다.
// 대괄호로 묶고, 가운데는 ,를 넣어준다.

// GET Item from Array
console.log(daysOfWeek[5]);
console.log(daysOfWeek);
// 0부터 숫자를 세니까 n-1해줘야한다.
// 하나를 찾아오는방법

// Add one more day to the array
daysOfWeek.push("sum");
console.log(daysOfWeek);


const toBuy = ["potato","tomato","pizza"];
toBuy.push("kimbab");
console.log(toBuy);

const player = {
    name:"minwoo",
    points : 10,
    fat:true,

};
console.log(player);
console.log(player.name);
console.log(player["name"]);    // 위와 동일
player.name
// object 안에서는 = 를 쓰지 않는다. 
// array랑 다른점은 대괄호 중괄호 이고 안에 내용을 적을 수 있다는 것

console.log(player);
player.fat = false;
console.log(player);
// object안에 있는 무언가를 바꿀때는 밖이 const라도 상관이 없다. 

console.log(player);
player.lastName = "potato";
player.points = player.points + 15; // 추가도 할 수 있음
console.log(player);
// object에 새로 생성도 됨 (추가), 수정도 가능함

