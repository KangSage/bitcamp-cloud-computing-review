// 021. typeof로 변수의 타입(형) 알아보기
"use strict";

const pi = 3.14;
const name = 'sage';
console.log('hello : %s', typeof 'hello');
console.log('hello : %s', typeof hello); // 따옴표를 넣지 않으면 비어있는 변수로 인식하여 undefined
console.log('"20" : %s', typeof '20');
console.log('pi : %s', typeof pi);
console.log('name : %s', typeof name);
console.log('30 : %s', typeof 30);
console.log('[] : %s', typeof []); // 배열은 오브젝트 타입이다.
console.log('{} : %s', typeof {});