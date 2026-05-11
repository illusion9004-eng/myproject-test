let arr = [];

console.log(typeof arr);
// 배열 생성
const fruits = ["사과", "바나나", "오렌지"];
const numbers = [1, 2, 3, 4, 5];
const mixed = [1, "hello", true, null];

// 요소 접근
console.log(fruits[0]); // 사과
console.log(fruits[2]); // 오렌지

// 요소 수정
fruits[1] = "포도";

console.log(fruits);

// 길이 확인
console.log(fruits.length); // 3

const arr2 = new Array(10); //값이 하나만 들어가면 그 값 크기의 배열을 생성해요.
console.log(arr2);

const arr3 = new Array(10, 2); //값이 하나 이상 들어오면 그 값들로 배열을 생성해요.

console.log(arr3);

function add(a, b) {
  console.log(arguments.length);
}

add();
add(10);
add(10, 20, 30);

arr2[0] = 10;
arr2[1] = { name: "kang" };

console.log(arr2);

const arr5 = [1, 2, 3];

const arr5_1 = arr5[0];
const arr5_2 = arr5[1];
const arr5_3 = arr5[2];

// 배열 구조분해할당

const [a, b, c] = arr5;

console.log(a);
console.log(b);
console.log(c);

arr5.push(100);
console.log(arr5);

// 스프레드 연산자 (...)
const arr6 = [1, 2, 3];
const arr7 = [4, 5, 6];
const combined = [...arr6, ...arr7];

console.log(combined);

// 배열 복사
const original = [1, 2, 3];
const copy = [...original]; // 새로운 배열 생성

console.log(copy);

// 값 교환
let x = 10,
  y = 20;
[x, y] = [y, x];
console.log(x, y); // 20, 10
