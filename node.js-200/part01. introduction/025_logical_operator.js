// 025. 논리연산자
"use strict";

const value30 = 30;
const value50 = 50;

const andTrueTrue = value30 >= 30 && value50 >= 30;
const andTrueFalse = value30 >= 30 && value50 >= 100;
const andFalseFalse = value30 >= 40 && value50 >= 100;

const orTrueTrue = value30 >= 30 || value50 >= 30;
const orTrueFalse = value30 >= 30 || value50 >= 100;
const orFalseFalse = value30 >= 40 || value50 >= 100;

// &&는 둘 다 true여야 true
console.log('andTrueTrue:', andTrueTrue);
console.log('andTrueFalse:', andTrueFalse);
console.log('andFalseFalse:', andFalseFalse);
console.log('↑&& ----------------------------- ||↓');
// ||는 둘 중 하나만 true라면 true
console.log('orTrueTrue:', orTrueTrue);
console.log('orTrueFalse:', orTrueFalse);
console.log('orFalseFalse:', orFalseFalse);
