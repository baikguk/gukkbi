const candidate = Array(45).fill().map((v, i) => i + 1);
// console.log(candidate);
//섞여진 숫자 저장
const shuffle = [];
while(candidate.length > 0){
  const random = Math.floor(Math.random()*candidate.length);
  const spliceArray = candidate.splice(random, 1) // 배열에 들어있는 값 꺼내기
  const value = spliceArray[0];
  shuffle.push(value);
}

const winBalls = shuffle.slice(0,6).sort((a,b) => a-b);
const bonus = shuffle[6];
console.log(winBalls,bonus)

const $result = document.querySelector("#result");
const $bonus = document.querySelector('#bonus')

const showBall = (number, $target)=>{
  setTimeout(()=>{
    const $ball = document.createElement('div');
    $ball.className = 'ball';
    $ball.textContent =number
    $target.appendChild($ball);
  },1000);

}
i=0;
for( count of winBalls){
  i+=1000;
setTimeout(()=>{
  showBall(count,$result)
},i)
}

// for(count of winBalls){
// setTimeout(()=>{
//   const $ball = document.createElement('div');
//   $ball.className = 'ball';
//   $ball.textContent = winBalls[0];
//   $result.appendChild($ball);
// },1000);
// }