"use strict";

printHelloEs5();
// printHelloEs6(); 익명 함수는 r-value이므로 호이스팅 불가
// 호이스팅은 l-value만 가능.

// es5 스타일
function printHelloEs5() {
    console.log('Hello! es5');
}

// es6 스타일
const printHelloEs6 = () => {
    console.log('Hello! es6');
}

printHelloEs6();