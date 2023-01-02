const $computer = document.querySelector('#computer');
const $score =document.querySelector('#score')
const $scissors =document.querySelector('#scissors')
const $rock =document.querySelector('#rock')
const $paper =document.querySelector('#paper')
const rsp_img = 'rsp.png';


const rspX ={
  scissors:'0',
  rock: '-220px',
  paper: '-440px',
}

let comChoise ='scissors';

const changeCom=()=>{

  if(comChoise === 'scissors'){ //가위인 경우
    comChoise = 'rock';
    
  }else if(comChoise === 'rock'){ //가위인 경우
    comChoise = 'paper';
  
  }else if(comChoise === 'paper'){ //가위인 경우
    comChoise = 'scissors'
  }
  $computer.style.background=`url(${rsp_img}) ${rspX[comChoise]} 0`
  $computer.style.backgroundSize = 'auto 200px';
}

let intervalId=setInterval(changeCom,50);

const scoreTable = {
  rock:0,
  scissors:1,
  paper: -1,
}
let clickable=true;
let message;
const clickButton = (event)=>{
  clearInterval(intervalId);
  clickable = false;
  //점수 계산 화면에 표시하기
  const myChoice = event.target.id == '바위' ? 'rock' : event.target.id =='가위'?
  'scissors': 'paper';
  const myscore = scoreTable[myChoice]
  const comscore = scoreTable[comChoise];
  const diff = myscore-comscore;
 
  if(diff ===2 ||diff===-1){
    message ='이김';
    score +=1
  }else if(diff=== -2 || diff ===1){
    message = '찜'
    score +=-1
    
  }else{
    message = '비김'
    score +=0
  }

  $score.textContent = `${message} 총 : ${score}점`

  setTimeout(()=>{
    // 연속 클릭시 setinterval이 계속 생성되어 버그가 일어날 수도 있다
    // 따라서 settimeout안에 이전의 인터버를 지워줘야함
    clearInterval(intervalId);
    intervalId = setInterval(changeCom,50);
  },1000)
};

$scissors.addEventListener('click',clickButton)
$rock.addEventListener('click',clickButton)
$paper.addEventListener('click',clickButton)

let score = 0;
/*
let coord ='0';
setInterval(()=>{
  if(coord === rspX.scissors){ //가위인 경우
    coord = rspX.rock;
    $computer.style.background=`url(${rsp_img}) ${rspX.scissors} 0`
    $computer.style.backgroundSize = 'auto 200px';
  }else if(coord === rspX.rock){ //가위인 경우
    coord = rspX.paper;
    $computer.style.background=`url(${rsp_img}) ${rspX.rock} 0`
    $computer.style.backgroundSize = 'auto 200px';
  }else if(coord === rspX.paper){ //가위인 경우
    coord = rspX.scissors;
    $computer.style.background=`url(${rsp_img}) ${rspX.paper} 0`
    $computer.style.backgroundSize = 'auto 200px';
  }
},50);
*/

const person1 ={
  name: '이순신',

}
const person2 ={
  name: '유관순',
  
}
