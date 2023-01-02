document.getElementById("start-screen");
const $startScreen = document.querySelector("#start-screen")/*id,tag,class다 가져올수있음*/
const $gameMenu = document.querySelector("#game-menu")
const $battleMenu = document.querySelector("#battle-menu")
const $heroName = document.querySelector("#hero-name")
/*변수에 $붙이기*/

$startScreen.addEventListener('sumbit',(event)=>{
  event.preventDefault(); //브라우저의 기본동작을 제한시킴
  let name =event.target['name-input'].value; //target의 위치의 value값을 바환함
  //      ㄴ 이벤트가 발생한 객체(버튼,문자 등등)
  $startScreen.style.display = 'none';
  $gameMenu.style.display = 'block';
  $heroName.textContent = name;
});
