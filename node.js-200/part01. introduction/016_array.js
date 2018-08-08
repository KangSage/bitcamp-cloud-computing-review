// 016. 배열(array) 선언하기
"use strict";

const numbers = [1, 2, 3];
const strings = ['hello', 'bye', 'welcome'];

// new Array()를 이용하는 방법은 []을 이용하는 방법과
// 동일하므로 간결한 []를 이용하는게 좋다.
const numbers2 = new Array(1, 2, 3);
const strings2 = new Array('hello', 'bye', 'welcome');

console.log('numbers : ', numbers);
console.log('numbers2 : ', numbers2);
console.log('string : ', strings);
console.log('string2 : ', strings2);