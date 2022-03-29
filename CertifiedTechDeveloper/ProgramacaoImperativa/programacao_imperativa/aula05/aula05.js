// function somar(a, b){
//     console.log("dentro da function");
//     return (a+b);
// }

// console.log(somar(10, 5));

// function nomePessoa(nome, idade){
//     return nome+" tem a idade de "+idade;
// }
// console.log(nomePessoa("Luiz", 23));
// console.log(nomePessoa("Maju", 19));

// let sub = function(x, y){
//     return x - y;
// }

// console.log(sub(10, 5));

// console.log(Math.random());

// Mesa de Trabalho
// Micro desafio

function teste1(x, y){
    return y-x
}

teste1(10, 40);
console.log(teste1(10, 40));

function teste2(x, y) {
    return x*2
    console.log(x)
    return x/2
}

teste2(10);
console.log(teste2(10));

function polcm(x ,y){
    return x*2,54;
}

polcm(10);
console.log(polcm(10));

function converter(string){
    return `http://www.${string}.com.br`;
}

console.log(converter("funcaojs"));

function retorna(string){
    return `!${string}`;
}

console.log(retorna("teste"));

function dogao(age){
    return age * 7;
}

console.log(dogao(2));

function payday(work){
    return work / 160;
}

console.log(payday(1000));

function IMC(altura, peso){
    return (peso / altura ** 2).toFixed(2);
}

console.log(IMC(1.8, 75));
console.log(IMC(1.62, 62));

function minuscula(string){
    return string.toUpperCase();
}

console.log(minuscula("maiuscula"));

function parametro(type){
    return typeof type;
}

console.log(parametro("1"));

function raio(circulo){
    return 2 * Math.PI * circulo;
}

console.log(raio(21));