// 024. 비교 연산자
"use strict";

const a = 5;
const b = 6;

if (a == 5) {
    console.log(a == 5);
    console.log(a == b);
    console.log(a == '5');
}
console.log("--------------");

if (a === 5) {
    console.log(a === 5);
    console.log(a === b);
    console.log(a === '5'); // 값과 타입까지 같은지 비교한다.
}

console.log("--------------");

if (a > b) { // false 이므로 실행되지 않는다.
    console.log(a > b);
}

console.log("--------------");

if (a < b) {
    console.log(a < b);
}

console.log("--------------");

if (a >= 5) {
    console.log(a >= 5);
    console.log(a >= 6);
}

console.log("--------------");

if (a <= 5) {
    console.log(a <= 5);
    console.log(a <= 6);
}