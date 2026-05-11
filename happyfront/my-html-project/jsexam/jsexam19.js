function work(callback) {
  console.log("work start!!");
  setTimeout(() => {
    console.log("work 해야할일 하기!!!");

    const start = Date.now();
    for (let i = 0; i < 1000000; i++) {}

    const end = Date.now();

    console.log(end - start + "ms");
    console.log("work end!!");
    //work()가 실행된 후 해야할 일!!!

    callback();
  }, 0);
}

console.log("start!!");
work(() => {
  console.log("work()가 끝나면 해야할일!!!");
});

console.log("end!!");
