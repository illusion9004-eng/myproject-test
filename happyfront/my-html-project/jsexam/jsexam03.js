console.log("hello js");

//변수 선언!!!
let value = 10;
console.log(value);
value = "hell0";
console.log(value);
value = function () {
  console.log("hello");
};
console.log(value);

value();

//상수
const a = 10;

// a = 20;   상수는 값을 바꿀 수 없다.

// var   -  오랜시간동안 자바스크립트에서 변수를 선언하느 예약어 였다.

//중복정의 가능!!!

var varValue = 10;

//중복으로 선언해도 에러가 나지 않았을 때 문제가 무엇일까요???

var varValue = 20;

console.log(varValue);

// let value = 30;  let은 중복정의 안된다.

//var 는 호이스팅 된다.
console.log(b);

var b = 20;

console.log(b);

// console.log(letb);  let은 호이스팅되지 않는다.

let letb = 10;

//var scope가 함수 단위이다.
function varScopeTest() {
  if (true) {
    var varScope = 20;
  }
  console.log(varScope);
}

varScopeTest();

function letScopeTest() {
  if (true) {
    let letScope = 20;
  }
  //   console.log(letScope);   let의 스코프는 블럭단위!!!
}

letScopeTest();

let str = "abc";
console.log(typeof str);
str = 10;
console.log(typeof str);
