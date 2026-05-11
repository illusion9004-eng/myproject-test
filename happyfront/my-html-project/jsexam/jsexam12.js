const numbers = [1, 2, 3, 4, 5];

const newNumbers = [];

for (let i = 0; i < numbers.length; i++) {
  //   console.log(numbers[i] * 2);
  newNumbers[i] = numbers[i] * 2;
}

numbers.forEach((num) => console.log(num * 2));

console.log(numbers);

console.log("=================map=============");
const doubled = numbers.map((n) => n * 2);
console.log(numbers);
console.log(doubled);

function test(n) {
  return n * 2;
}

const doubled2 = numbers.map(test);
const doubled3 = numbers.map(function (n) {
  return n * 2;
});

console.log("=================filter=============");
const newEvens = [];
let index = 0;
for (let i = 0; i < numbers.length; i++) {
  if (numbers[i] % 2 === 0) {
    newEvens[index++] = numbers[i];
  }
}
const evens = numbers.filter((num) => num % 2 === 0);
console.log(evens); // [2, 4]

const sum = numbers.reduce((acc, cur) => acc + cur, 0);
console.log(sum);
