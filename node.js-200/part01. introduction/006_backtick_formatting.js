// 006. `${변수}` 백틱을 이용한 포맷팅
"use strict";

const greeting1 = 'hello';
const greeting2 = 'bye';
const name1 = 'sage';
const name2 = 'dahyeon';

const statement = `${greeting1}! my name is ${name2}`;
const statement2 = `${greeting2}! my name is ${name2}`;

console.log(`${greeting1}! my name is ${name1}`);
console.log(`${greeting2}! my name is ${name1}`);
console.log('statement:', statement);
console.log('statement2:', statement2);