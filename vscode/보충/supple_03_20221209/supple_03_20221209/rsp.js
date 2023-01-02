const $computer = document.querySelector('#computer');
const $score = document.querySelector('#score');
const $rock = document.querySelector('#rock');
const $scissors = document.querySelector('#scissors');
const $paper = document.querySelector('#paper');
const rsp_img = 'rsp.png';

const rspX = {
  scissors: '0',
  rock: '-220px',
  paper: '-440px',
}
let comChoice = 'scissors';

const changeCom = () => {
  if (comChoice === 'scissors') { // 가위인 경우
    comChoice = 'rock';    
  } else if (comChoice === 'rock'){ // 바위인 경우
    comChoice = 'paper';
  } else { // 보인 경우
    comChoice = 'scissors';   
  }
  // rspX.comChoice (X)
  $computer.style.background = `url(${rsp_img}) ${rspX[comChoice]} 0`;
  $computer.style.backgroundSize = 'auto 200px';
};

let intervalId = setInterval(changeCom, 50);

const scoreTable = {
  rock: 0,
  scissors: 1,
  paper: -1,
};

// 버튼을 누를 때마다 setInterval 이 다시 실행됨
// 5 누르면 5 번 실행됨. 때문에, 37행에서는
// 마지막 실행된 (5 번째)setInterval 만 clear 하게 됨
// 5 번째 이전의 setInterval 을 clear 하려면 43행에서 해 주어야 함
let clickable = true;
let score = 0;
const clickButton = (event) => {
  if (clickable) {
    clearInterval(intervalId);
    clickable = false;
    // 점수 계산해서 화면에 표시하기
    const myChoice = event.target.id == '바위' ? 'rock' : event.target.id == '가위' ? 'scissors' : 'paper';
    const myScore = scoreTable[myChoice];
    const comScore = scoreTable[comChoice];
    const diff = myScore - comScore;

    // 어떤 것을 냈는지 console 창에서 확인하기
    console.log(`컴 : ${comChoice}, 나 : ${myChoice}, 컴점수 : ${comScore}, 내점수 : ${myScore},  diff : ${diff}`);

    let message;
    if (diff === 2 || diff === -1) {
      score += 1
      message = '이김';
    } else if (diff === -2 || diff === 1) {
      score -= 1;
      message = '짐';
    } else {
      message = '비김';
    }
    $score.textContent = `${message} 총 : ${score}점`;

    setTimeout(() => {
      // 현재 발생하는 intervalId 직전에 다른
      // setInterval(intervalId) 이 있는 경우
      // 이것을 다시 한 번 clear 해 줌
      // clearInterval(intervalId);
      clickable = true;
      intervalId = setInterval(changeCom, 50);
    }, 1000);
  }
};

$rock.addEventListener('click', clickButton);
$scissors.addEventListener('click', clickButton);
$paper.addEventListener('click', clickButton);

/*
let comChoice = 'scissors';
setInterval(() => {
  if (comChoice === 'scissors') { // 가위인 경우
    comChoice = 'rock';
    $computer.style.background = `url(${rsp_img}) ${rspX.rock} 0`;
    $computer.style.backgroundSize = 'auto 200px';
  } else if (comChoice === 'rock'){ // 바위인 경우
    comChoice = 'paper';
    $computer.style.background = `url(${rsp_img}) ${rspX.paper} 0`;
    $computer.style.backgroundSize = 'auto 200px';
  } else { // 보인 경우
    comChoice = 'scissors';
    $computer.style.background = `url(${rsp_img}) ${rspX.rock} 0`;
    $computer.style.backgroundSize = 'auto 200px';
  }
}, 50);
*/
/*
let coord = '0';
setInterval(() => {
  if (coord === rspX.scissors) { // 가위인 경우
    coord = rspX.rock;
    $computer.style.background = `url(${rsp_img}) ${rspX.rock} 0`;
    $computer.style.backgroundSize = 'auto 200px';
  } else if (coord === rspX.rock){ // 바위인 경우
    coord = rspX.paper;
    $computer.style.background = `url(${rsp_img}) ${rspX.paper} 0`;
    $computer.style.backgroundSize = 'auto 200px';
  } else { // 보인 경우
    coord = rspX.scissors;
    $computer.style.background = `url(${rsp_img}) ${rspX.rock} 0`;
    $computer.style.backgroundSize = 'auto 200px';
  }
}, 50);
*/


/*
const person1 = {
  name : '이순신',
};
const person2 = {
  name : '유관순',
};
*/