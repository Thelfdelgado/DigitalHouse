// Mesa de Trabalho

console.log( !true ); //false

console.log( !false ); //true

console.log( !!false ); //false

console.log( !1 ); //false

console.log( !!1 ); //true

console.log( !0 ); //true

console.log( !!0 ); //false

console.log( !!"" ); //false

let x = 5;
let y = 9;
console.log( x < 10 && x !== 5 ); //false
console.log( x > 9 || x === 5 ); //true
console.log( !( x === y ) ); //true

let x = 10;
let y = "a";
console.log( y === "b" || x >= 10 ); //true

let x = 3;
let y = 8;
console.log( !( x == "3" || x === y ) && !( y !== 8 && x <= y) ); //false

let str = "";
let msg = "haha!";
let eBonito = "false"
console.log( !( ( str || msg ) && eBonito) ); //false