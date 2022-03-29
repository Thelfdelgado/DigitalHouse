let pares = [2,4,6,8]
let impar = pares.map(function(item){
    return item -1
});

console.log(impar);

let nomes = ['Maria 1', 'Maria 2', 'Luiz 2', 'Luiz 2']
let marias = nomes.filter(function(item){
    return item = 'Maria'
});

console.log(marias);

let num = [1,2,3,4,5,6];
let string = num.reduce(function(acumulador, item){
    return acumulador+' - '+item
});

console.log(string);

let animais = ['cachorro','gato','peixe','lagarto']
animais.forEach(function(item){
    console.log("O animal é "+item);
});

// MESA

// 1

let arrayComposto = [32,23,3,533,4]
let divisao = arrayComposto.map(function(item){
    let soma = arrayComposto.reduce(function(acumulador, item){
        return acumulador+item
    });
    return soma /item
})

console.log(divisao);

// 2

let arrayPalavras = ['carro', 'roberto', 'ovo', 'cachorro', 5]
let palavras = arrayPalavras.filter(function(item){
    return item.length >5
}); 
console.log(palavras);

// 3

