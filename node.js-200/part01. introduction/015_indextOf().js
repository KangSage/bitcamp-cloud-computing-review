// 015. 해당 문자열 찾기 indexOf()
"use strict";

const string = 'hello';
const string2 = 'helelelelelello';
const string3 = 'The method then selects elements from the start argument.';

// 시작 문자열의 맨 앞글자가 들어가 있는 배열의 번호를 리턴한다.
console.log('hel:', string.indexOf('hel')); // h가 첫번째 배열에 들어가 있으므로 hel: 0
console.log('el:', string.indexOf('el')); // el: 1
console.log('elelelel:', string2.indexOf('el')); // 가장 먼저 등장하는 위치를 알려주므로 elelelel: 1
console.log('method:', string3.indexOf('method')); // method: 4
console.log('bye:', string3.indexOf('bye')); // 없는 문자열을 아규먼트로 넣을 경우 -1을 리턴 bye: -1
