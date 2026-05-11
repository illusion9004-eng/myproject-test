function add(a, b) {
  console.log("a+b");
  return a + b;
}

function add(a) {
  console.log("a+a");
  return a + a;
}

//자바스크립트의 함수는 오버로딩 안된다!!!
// add(a), add(a,b)  구분 안된다.
add(10);
add(10, 20);
add(10, 20, 30, 40);
add(10, 20, 30, 40, 50, 60);

function add(a, b, c) {
  console.log(arguments.length);
  console.log("6번째 값:::: " + arguments[5]);
  return a + b + c;
}

function test(func) {
  let result = func(10, 20, 30);
  console.log(result);
  return function () {
    console.log("hahah");
  };
}

let resultFunc = test(add);
console.log(typeof resultFunc);
resultFunc();

console.log("===============");

test(add)();
