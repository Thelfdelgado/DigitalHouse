let somar = (a, b) => a + b;
somar(2,4);

let multiplicar = (a, b) => a * b;
multiplicar(2,4);

let subtrair = (a, b) => a - b;
subtrair(2,4);

let dividir = (a, b) => a / b;
subtrair(2,4);

// Calculadora Mesa
function insert(num){
    let numero = document.getElementById('resultado').innerHTML;
    document.getElementById('resultado').innerHTML = numero +num;
}
function clean(){
    document.getElementById("resultado").innerHTML="";
}
function back(){
    let resultado = document.getElementById("resultado").innerHTML;
    document.getElementById('resultado').innerHTML = resultado.substring(0, resultado.length -1);
}
function calcular(){

    let resultado = document.getElementById("resultado").innerHTML;
    if (resultado){
        document.getElementById("resultado").innerHTML = eval(resultado)
    }
}