const user = {
  _name: "김철수",
  _age: 25,
  _a: 10,
  _b: 20,

  get name() {
    console.log("name get 메서드 호출!!!");
    return this._name;
  },

  // Setter
  set name(value) {
    console.log("name setter 호출");
    if (value.length < 2) {
      console.log("이름은 2글자 이상이어야 합니다.");
      return;
    }
    this._name = value;
  },

  get sum() {
    return this._a + this._b;
  },
};

console.log(user._name);
user.name = "carami";

console.log(user._name);

console.log(user.name);

let newName = (user.name = "c");
console.log(newName);

console.log(user.sum);
