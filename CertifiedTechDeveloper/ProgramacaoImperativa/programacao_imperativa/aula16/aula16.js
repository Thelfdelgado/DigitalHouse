// MICRO DESAFIO

function acaoCarro(callback) {
    return callback();
}

function andar() {
    console.log('carro andando');
}

function parar() {
    console.log('carro parou');
}

acaoCarro(andar)

// MESA

function multiploN1(){
    return 'Multiplo do primeiro número';
}

function multiploN2(){
    return 'Multiplo do segundo número'
}

let FizzBuzz = (n1, n2) => {
    for (let i = 1; i <= 100; i++) {
        if (i % n1 == 0 && i % n2 == 0) {
            console.log(multiploN1() + ' ' + multiploN2());
        } else if (i % n1 == 0) {
            console.log(multiploN1());
        } else if (i % n2 == 0) {
            console.log(multiploN2());
        } else {
            console.log(i)
        }
    }
}

console.log(FizzBuzz(5, 7))