// 주제: 모듈을 정의하고 사용하기
//

// => exports에 저장된 함수 받기
let fn = require('./ex06_m');

let obj = fn();

console.log(obj.plus(10, 20));
console.log(obj.minus(10, 20));


