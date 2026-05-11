// 객체 생성자 함수
function Animal(type, name, sound) {
  this.type = type;
  this.name = name;
  this.sound = sound;
  this.say = function () {
    console.log(this.sound);
  };
}

// 인스턴스 생성
const dog = new Animal("개", "멍멍이", "멍멍");
const cat = new Animal("고양이", "야옹이", "야옹");

dog.say(); // 멍멍
cat.say(); // 야옹

// const dog2 = new Animal('')

dog.say = function () {
  console.log("개는 " + this.sound + "입니다.");
};

dog.say();
cat.say();
