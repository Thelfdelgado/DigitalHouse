// Em primeiro lugar, vamos praticar as ações mais comuns e necessárias:

// Acessar elementos específicos de um array.

let listaDesejo = [ "Celular", "Shape", "Pedal" ];
console.log(listaDesejo[1]);

// Modificar cada um dos elementos de um array e imprimi-los no console.

listaDesejo[0] = "Phone";
console.log(listaDesejo);

// Adicionar elementos a um array.

listaDesejo.push("Carro")
listaDesejo.unshift("CPU")
console.log(listaDesejo);

// Extrair elementos de um array.

listaDesejo.pop();
listaDesejo.shift();
console.log(listaDesejo);

// Comparar elementos de um array com os elementos de outro

let wishlist = ["Phone", "Shape", 3].toString;
console.log(listaDesejo===wishlist);

//O que esses códigos retornam?

// 1
let numbers =[22, 33, 54, 66, 72]
console.log(numbers[numbers.length]) // Resposta = 10 / (Console = undefined)

// 2
let grupoDeAmigos = [ ["Harry", "Ron", "Hermione"], ["Spiderman", "Hulk", "Ironman"], ["Penélope Glamour", "Pierre Nodoyuna","Patán"] ]
console.log(grupoDeAmigos[1][0]) // Resposta = Ron, Spiderman / (Console = Spiderman) / Array dentro de array

// 3
let str = "uma string qualquer"
let grupoDeAmigos = [ [45, 89, 0], ["Digital", "House", true], ["string", "123","false", 54, true, str] ]
console.log(grupoDeAmigos[2][grupoDeAmigos[2].length - 1]) // Resposta = 0 (1 - 1) = 0 / (Console = uma string qualquer)

//Array Invertido

//imprimirInverso
var nome = ["maju", "luiz"];

function imprimirInverso() {
    return nome.reverse();
}

console.log(nome.reverse())

// inverter
var chuchu = [0, 1, 2];

function inverter() {
    return chuchu.reverse();
}

console.log(chuchu.reverse())

somarArray()
function somarArray(x){
    let soma = 0;
    soma += x.pop();
    soma += x.pop();
    soma += x.pop();
    soma += x.pop();
    return soma;
}

console.log(somarArray([1, 2, 3, 4]));

arrayJoin()
function join(umArray){
    let concat = '';

    concat += umArray[0];
    concat += umArray[1];
    concat += umArray[2];
    concat += umArray[3];
    concat += umArray[4];

    return concat;
}

console.log(join(['T', 'c', 'h', 'a', 'u']));

//Filmes (1)
const filmes = ["star wars", "matrix", "mr. robot", "o preço do amanhã", "a vida é bela"];
console.log(filmes[0]);

//Filmes (2)
function Maiuscula(arrayModificar){
    const arrayMaiuscula = arrayModificar.map(arrayModificar => arrayModificar.toUpperCase());
    return arrayMaiuscula;
}

console.log(Maiuscula(filmes));

//Filmes (3)
const Animacao = ["Toy Story", "Procurando Nemo", "Kung-fu Panda", "Wally", "Fortnite"]

function juntarArrays(array1, array2){
    const arrayConcat = array1.concat(array2);
    return arrayConcat
}

console.log(juntarArrays(filmes, Animacao));

//Filmes (4)
let x = Animacao.pop();
console.log(Animacao);
console.log(x);

//Filmes (5)
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

console.log(asiaScores.join('|'));
console.log(euroScores.join('|'));

if (asiaScores.join('|') === euroScores.join('|')) {
	console.log('São iguais.');
} else {
	console.log('São diferentes.');
}



console.log(asiaScores.join('|'));
console.log(euroScores.join('|'));

if (asiaScores.join('|') === euroScores.join('|')) {
	console.log('São iguais.');
} else {
	console.log('São diferentes.');
}