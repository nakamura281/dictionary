
const upButton = document.getElementById("cntUp");
const downButton = document.getElementById("cntDown");
const resetButton = document.getElementById("reset");
const currentCnt = document.getElementById("currentCnt");

let currentNum = 0;

upButton.addEventListener("click", () => {
  currentNum++;
  currentCnt.innerHTML = currentNum;
});

downButton.addEventListener("click", () => {
  currentNum--;
  currentCnt.innerHTML = currentNum;
});

resetButton.addEventListener("click", () => {
  currentNum = 0;
  currentCnt.innerHTML = currentNum;
});