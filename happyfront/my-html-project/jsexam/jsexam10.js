function add(a, b) {
  return a + b;
}

function test(func) {
  //   func();
}

test(add);

test(add());

let strValue = "a+b=" + add(1, 3);

// ES6
let str = `a+b=${add(1, 3)}`;

const person = {
  name: "kang",
  age: 11,
  address: "서울시 강남구",
};

let pseronName = person.name;

let { address, name, age } = person;

// 호이스팅가능
function print({ name, age }) {
  console.log(name);
  console.log(age);
}

print(person);

//중복정의 가능
function print(aa) {
  console.log(aa.name);
  console.log(aa.age);
}

personPrint(person);

const personPrint = function ({ name }) {
  console.log(name);
};

personPrint(person);

// const personPrint = function ({ name,age }) {
//   console.log(name);
// };
// new 이렇게 사용할 수 있어요.   new String()   new Array()   [], "str"
new Array(10);
new Array(10, 2);
