function Dados(nome, opniao, idade) {
    this.nome = nome;
    this.opniao = opniao;
    this.idade = idade;
};

let dados1 = new Dados("Abigael Natte", "1", "29");
let dados2 = new Dados("Ramon Connell", "2", "45");
let dados3 = new Dados("Jarret Lafuente", "3", "21");
let dados4 = new Dados("Ansel Ardley", "3", "15");
let dados5 = new Dados("Jacki Shurmer", "1", "24");
let dados6 = new Dados("Jobi Mawtus", "1", "48");
let dados7 = new Dados("Thomasin Latour", "2", "18");
let dados8 = new Dados("Lonnie Verheijden", "3", "37");
let dados9 = new Dados("Alonso Wannan", "2", "22");
let dados10 = new Dados("Bendite Huggett", "1", "44");

let Pessoas = [dados1, dados2, dados3, dados4, dados5, dados6, dados7, dados8, dados9, dados10];

function mediaOtimo(Pessoas){
    let age =Pessoas.filter(function(x){
        return x.opniao == "3";
    });

    let soma=0;
    let media=0;

    age.forEach(x => {
        soma= soma + parseFloat(x.idade);
        media++;
    })

    return soma/media;

}

console.log(mediaOtimo(Pessoas));

let regular = (Pessoas) =>{
    let count=0;
    for (let i=0;i<10;i++){
        if(Pessoas[i].opniao=="1"){
            count++;
        }
    }
    return count;
}

console.log(regular(Pessoas));

let bom = (Pessoas) =>{
    let count=0;
    for (let i=0;i<10;i++){
        if(Pessoas[i].opniao=="2"){
            count++;
        }
    }
    return count*10;
}

console.log(bom(Pessoas)+"%");