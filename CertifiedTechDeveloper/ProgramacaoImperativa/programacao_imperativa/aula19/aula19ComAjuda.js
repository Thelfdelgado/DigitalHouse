function Dados(sexo, nome, altura) {
    this.sexo = sexo;
    this.nome = nome;
    this.altura = altura;
};

let dados1 = new Dados("F", "Abigael Natte", "1.61");
let dados2 = new Dados("M", "Ramon Connell", "1.75");
let dados3 = new Dados("M", "Jarret Lafuente", "1.55");
let dados4 = new Dados("F", "Ansel Ardley", "1.67");
let dados5 = new Dados("F", "Jacki Shurmer", "1.75");
let dados6 = new Dados("M", "Jobi Mawtus", "1.88");
let dados7 = new Dados("M", "Thomasin Latour", "1.67");
let dados8 = new Dados("F", "Lonnie Verheijden", "1.63");
let dados9 = new Dados("M", "Alonso Wannan", "1.92");
let dados10 = new Dados("F", "Bendite Huggett", "1.80");

let Pessoas = [dados1, dados2, dados3, dados4, dados5, dados6, dados7, dados8, dados9, dados10];

let maiorAltura = (Pessoas) => {
    let maior = 0;
    for (let i = 0; i <10; i++) { //a contagem começa depois de já ter lido um vez a condição//
        if (Pessoas[i].altura > maior) {
            maior = Pessoas[i].altura;
        }
    }
    return maior;
}

let menorAltura = (Pessoas) => {
    let menor = 100;
    for (let i = 0; i <10; i++) {
        if (Pessoas[i].altura < menor) {
            menor = Pessoas[i].altura;

        }
    }
    return menor;
}

function mediaMulher(Pessoas){
    let mulheres =Pessoas.filter(function(x){
        return x.sexo == "F";
    });

    let soma=0;
    let media=0;

    mulheres.forEach(x => {
        soma= soma + parseFloat(x.altura);
        media++;
    })

    return soma/media;

}

let totalHomens = (Pessoas) =>{
    let count=0;
    for (let i=0;i<10;i++){
        if(Pessoas[i].sexo=="M"){
            count++;
        }
    }
    return count;
}


console.log(maiorAltura(Pessoas));
console.log(menorAltura(Pessoas));
console.log(mediaMulher(Pessoas));
console.log(totalHomens(Pessoas));