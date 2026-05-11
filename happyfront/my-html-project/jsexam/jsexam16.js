try {
  const result = someFunction();
  console.log(result);
} catch (error) {
  console.error("에러 발생:", error.message);
} finally {
  console.error("항상실행");
}
console.log("end job");

function divide(a, b) {
  if (b === 0) {
    // try{}
    throw new Error("0으로 나눌 수 없습니다!");
  }
  return a / b;
}

try {
  const result = divide(10, 0);
} catch (error) {
  console.error(error.message);
}
