// 011. 숫자인지 판단하기 .isNaN()
"use strict";

const isNaN123 = isNaN(123);
const isNaNMinus123 = isNaN(-123);
const isNaN234 = isNaN("234");
const isNaNHello = isNaN('hello');

console.log('isNaN123:', isNaN123);
console.log('isNaNMinus123:', isNaNMinus123);
console.log('isNaN234:', isNaN234); // 책의 설명과는 달리 false가 나옴. 확인 필요.
console.log('isNaNHello:', isNaNHello);