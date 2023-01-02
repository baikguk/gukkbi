// document.getElementById("start-screen");
const $stratScreen = document.querySelector("#start-screen");
const $gameMenu = document.querySelector("#game-menu");
const $battleMenu = document.querySelector("#battle-menu");
const $heroName = document.querySelector("#hero-name");

$stratScreen.addEventListener('submit', (event) => {
  event.preventDefault();
  let name = event.target['name-input'].value;
  $stratScreen.style.display = 'none';
  $gameMenu.style.display = 'block';
  $heroName.textContent = name;
});