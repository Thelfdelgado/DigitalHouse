const alice = [23, 82, 46];
const bob = [45, 8, 32];

function encontrarGanhador(a, b) {

    let pontosPrimeiroParticipante = 0;
    let pontosSegundoParticipante = 0;

    for (let i = 0; i < a.length; i++) {
        if (a[i] > b[i]) { pontosPrimeiroParticipante++ }
        if (b[i] > a[i]) { pontosSegundoParticipante++ }
    }

    if (pontosPrimeiroParticipante > pontosSegundoParticipante) {
        return "O participante 1 ganhou!"
    }
    if (pontosPrimeiroParticipante < pontosSegundoParticipante) {
        return "O participante 2 ganhou!"
    }
    if (pontosPrimeiroParticipante == pontosSegundoParticipante) {
        return "Empate!"
    }

}

console.log(encontrarGanhador(alice, bob))
console.log(encontrarGanhador(bob, alice))
console.log(encontrarGanhador(alice, alice))

//bônus

function digitalHouse(u, d) {
    for (let i = 1; i <= 100; i++) {
        console.log(i)
        if (i%u == 0 && i%d == 0) console.log("Digital House")
        else {
            if (i%u == 0) console.log("Digital");
            if (i%d == 0) console.log("House");
        }
    }
}

digitalHouse(2, 5);

function sumArray(umArray) {

    let sum = 0;

    for (let i = 0; i < umArray.length; i++) {
        sum += umArray[1]
    };

    return sum;

}

console.log(sumArray([1, 5, 20]))