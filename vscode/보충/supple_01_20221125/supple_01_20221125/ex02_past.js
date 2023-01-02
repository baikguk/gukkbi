
const candidate = Array(45).fill().map((v, i) => i + 1);
// console.log(candidate);

// 섞여진 숫자가 저장되는 배열
const shuffle = [];
while (candidate.length > 0) {
  // random 하게 index 추출하기
  const random = Math.floor(Math.random() * candidate.length);
  // 추출한 값을 배열에 들어있음
  const spliceArray = candidate.splice(random, 1);
  // 배열에 들어있는 값 꺼내기
  const value = spliceArray[0];
  shuffle.push(value);
}
console.log(shuffle);

const winBalls = shuffle.slice(0, 6).sort((a, b) => a - b);
const bonus = shuffle[6];
console.log(winBalls, bonus);

const $result = document.querySelector('#result');
const $bonus = document.querySelector("#bonus");

function colorize(number, $tag){
  if(number<10){
    $tag.style.backgroundColor = 'red';
    $tag.style.color = 'white';
  }else if(number<20){
    $tag.style.backgroundColor = 'orange';
  }else if(number<30){
    $tag.style.backgroundColor = 'yellow';
  }else if(number<40){
    $tag.style.backgroundColor = 'blue';
    $tag.style.color = 'white';
  }else{
    $tag.style.backgroundColor = 'green';
    $tag.style.color = 'white';
  }
}

const showBall = (number, $target) => {
  const $ball = document.createElement('div');
  $ball.className = 'ball';
  colorize(number,$ball);
  $ball.textContent = number;
  $target.appendChild($ball);
  
};


// [0, 1, 2, 3, 4, 5] -> [1000, 2000, 3000, 4000, 5000, 6000]

for (let i = 0; i < 6; i++){
  setTimeout(() => {  
    showBall(winBalls[i], $result);
  }, (i + 1) * 1000);
}
setTimeout(() => {  
  showBall(bonus, $bonus);
}, 7000);

/*
setTimeout(() => {  
  showBall(winBalls[0], $result);
}, 1000);
setTimeout(() => {  
  showBall(winBalls[1], $result);
}, 2000);
setTimeout(() => {  
  showBall(winBalls[2], $result);
}, 3000);
setTimeout(() => {  
  showBall(winBalls[3], $result);
}, 4000);
setTimeout(() => {  
  showBall(winBalls[4], $result);
}, 5000);
setTimeout(() => {  
  showBall(winBalls[5], $result);
}, 6000);

setTimeout(() => {  
  showBall(bonus, $bonus);
}, 7000);
*/
