// I

function adicionar (x, y){
    return x + y;
}

function subtracao (x, y){
    return x - y;
}

function multiplicacao (x, y){
    return x * y;
}

function divisao (x, y){
    return x / y;
}

// II

function quadradoDoNumero (x){
    return Math.pow(x)
}

// III

function mediaDeTresNumeros (x ,y, z){
    return (adicionar(x, y)+z)/3
}

function calcularPorcentagem (x, y){
    return multiplicacao(divisao(y, 100), x)
}

function geradorDePorcentagem (x, y){
    return divisao(x, y)
}

// Resultados

console.log('------Teste de Operacoes/Calculadora------');
console.log(10 + 5);
console.log(10 - 5);
console.log(10 * 5);
console.log(10 / 5);
console.log(10 / 0);
console.log(Math.pow(4, 2));
console.log(mediaDeTresNumeros(2,2,2));
console.log(calcularPorcentagem(50, 10));
console.log(geradorDePorcentagem(100, 200));