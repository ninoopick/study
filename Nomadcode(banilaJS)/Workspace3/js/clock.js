const clock = document.querySelector("h2#clock");

// 매 2초마다 업데이트 하는 것!! setInterval()
function getClock(){
    const date = new Date();    //  그 시점 초,분,시간 다가져옴
    
    // "1".padStart(2,"0") // 2글자가 아니면 앞쪽에 0을 추가해줘라라는 것! 대신 String 이여야한다.
    const hours = String(date.getHours()).padStart(2,"0");
    const minutes = String(date.getMinutes()).padStart(2,"0");
    const secounds = String(date.getSeconds()).padStart(2,"0");
    // console.log(`${date.getHours()} : ${date.getMinutes()} : ${date.getSeconds()}`) //콘솔로그에 띄우는것
    // clock.innerText = `${date.getHours()} : ${date.getMinutes()} : ${date.getSeconds()}`;
    clock.innerText = `${hours} : ${minutes} : ${secounds}`;
}

// setInterval(sayHello,5000)// 5초마다 업데이트 하는 문구!!
// setTimeout(sayHello,5000); // 5초뒤에 나타나는 것 ms단위!!

getClock(); // 밑에것은 웹을 바로 불러오고 1초있다 불러오기 때문에 일부러 한번 더 적어서 바로 불러온다.
setInterval(getClock,1000); // 





