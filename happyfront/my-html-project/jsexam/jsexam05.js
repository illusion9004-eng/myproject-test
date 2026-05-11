function add(a, b) {
  return a + b;
}

let result = add(3, 4);
console.log(result);

function add(a, b) {
  return a + b + 100;
}

function add(a, b) {
  return "hahahaha";
}

let plus = function (a, b) {
  return a + b;
};

plus(1, 2);

plus = function (a, b) {
  return "hoho";
};

let test = plus;

console.log(typeof test);

// () 가 있어야 함수가 실행되요!!!

function ppp(abc) {
  return abc;
}

// 매개변수로 함수가 전달됨.  리턴값으로 함수가 전달 될 수 있음.
let func = ppp(plus);

func();

ppp(plus)();

// 화살표함수!!

function add(a, b) {
  return a + b;
}

const add2 = (a, b) => a + b;
