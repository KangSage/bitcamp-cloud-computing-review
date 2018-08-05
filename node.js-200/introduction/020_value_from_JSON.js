// 020. JSON에서 값 뽑기, 필드 추가하기
"use strict";

const user = { name: 'sage', age: 31 };
console.log('user:', user);
// .연산자를 통해서 값을 꺼내고 넣을 수 있다.
console.log('user.name:', user.name);
console.log('user.age:', user.age);

user.job = 'developer';
user.nation = 'korea';
console.log(user);

const memberName = 'age';
// .연산자를 사용하기 힘들 경우 []를 사용할 수도 있다.
console.log(user[memberName]);

// []로 넣고 .으로 꺼내기
user['address'] = '서울특별시';
console.log(user.address);
