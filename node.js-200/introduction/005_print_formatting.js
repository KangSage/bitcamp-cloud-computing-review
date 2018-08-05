// 005. 포맷팅(Formatting)해서 출력하기
"use strict";

console.log('name:%s', 'sage'); // 템플릿 형식으로 출력하기
console.log('age:%d', 31); // 숫자는 %d
console.log('pi:%d', 3.14); // 숫자는 %d
console.log('math:%d science:d', 92, 84); // 2가지 같이 쓰기
console.log('name:%s age:%d', 'sage', 31); // 여러가지 같이 쓰기
console.log('name:%s math:%d science:%d', 'sage', 92, 84); // 3가지 같이 쓰기
console.log('name:%s math:%s science:%s', 'sage', 92, 84); // %s로 다 쓰기