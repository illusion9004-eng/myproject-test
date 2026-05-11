const person = {
  name: "kang",
  age: 25,
  city: "서울",
  isStudent: true,
};

console.log(typeof person);

console.log(person.name);
console.log(person["age"]);

person.name = "carami";

console.log(person.name);

person.email = "carami@gmail.com";

console.log(person.email);

const dog = {
  name: "멍멍이",
  age: 3,
  sound: "멍멍",

  say: function () {
    console.log("====function=====");
    console.log(this);
    console.log(this.sound);
    console.log("=========");
  },

  say2: () => {
    console.log("=====>=====");
    console.log(this);
    console.log(this.sound);
    console.log("=========");
  },
};

dog.say();

console.log(dog);
console.log(dog.name);
console.log(dog.age);

dog.say2();

const winTest = () => {
  console.log("객체밖 :: " + this);
};

winTest();

const calculator = {
  // 메서드
  add: function (a, b) {
    return a + b;
  },

  // 축약 문법
  subtract(a, b) {
    return a - b;
  },

  // 화살표 함수 (this 주의)
  multiply: (a, b) => a * b,
};

console.log(calculator.add(10, 5)); // 15
console.log(calculator.subtract(10, 5)); // 5
console.log(calculator.multiply(3, 5));
