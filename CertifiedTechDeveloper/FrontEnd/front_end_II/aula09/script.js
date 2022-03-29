let nomeUsuario = "luiz";

// funcao declarada
function exibeNomeUsuario(nome, idade, cidade) {
    return console.log(nome);
}
// Invocando a funcao
exibeNomeUsuario("luiz", 24, "VR");

// callback
function executaCalculo (callback) {
    
    let valor1 = 4;
    let valor2 = 5;

    let soma = valor1+valor2;

    callback(soma);

}

function exibeResultadoSoma(resultado) {
    console.log(`O resultado foi ${resultado}`);
}

executaCalculo(exibeResultadoSoma);

// arrowFunctions
let soma = function(valorA, valorB) {
    return valorA + valorB
}
soma(4,6)

let somaArrow = (valor1, valor2) => {
    return valor1 + valor2;
}
somaArrow(6,4)

let somaArrow2 = (valor1, valor2) => valor1 + valor2;
somaArrow2(4,5)