const user = {
  username: "john",
  email: "john@email.com",
  age: 30,
};

const name = user.username;
console.log(name);

const { email, aa } = user;

console.log(email);
console.log(aa);

// 객체 구조분해 할당에서는 실제 객체의 필드명이 일치되어야함!!!

const { username, age } = user;

console.log(username);

console.log(age);

function printUser(aa) {
  console.log(`${aa.username}님은 ${aa.age}살입니다.`);
}

printUser(user);

function printUser({ username, age }) {
  console.log(`${username}님은 ${age}살입니다.`);
}
