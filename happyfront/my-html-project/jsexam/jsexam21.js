const myPromise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve(1);

    reject(new Error());
  }, 1000);
});

myPromise
  .then((n) => {
    console.log(n);
  })
  .catch((error) => {
    console.log("reject 실행!!");
  });
