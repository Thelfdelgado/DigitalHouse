const data = [
        {
            "sexo": "F",
            "nome": "Abigael Natte",
            "altura": 1.61
        },
        {
            
            "sexo": "M",
            "nome": "Ramon Connell",
            "altura": 1.75
        },
        {
            
            "sexo": "M",
            "nome": "Jarret Lafuente",
            "altura": 1.55
        },
        {
            
            "sexo": "F",
            "nome": "Ansel Ardley",
            "altura": 1.67
        },
        {
            
            "sexo": "F",
            "nome": "Jacki Shurmer",
            "altura": 1.75
        },
        {
            
            "sexo": "M",
            "nome": "Jobi Mawtus",
            "altura": 1.88
        },
        {
            
            "sexo": "M",
            "nome": "Thomasin Latour",
            "altura": 1.67
        },
        {
            
            "sexo": "F",
            "nome": "Lonnie Verheijden",
            "altura": 1.63
        },
        {
            
            "sexo": "M",
            "nome": "Alonso Wannan",
            "altura": 1.92
        },
        {
            
            "sexo": "F",
            "nome": "Bendite Huggett",
            "altura": 1.80
        }
    ];

// const menorAltura = data.reduce((a,b)=>{
//     if(b.altura < a.altura) a = b;
//     return a;
//  });

// console.log(menorAltura);

// const maiorAltura = data.reduce((a,b)=>{
//     if(b.altura > a.altura) a = b;
//     return a
// });

// console.log(maiorAltura);

const numMen = data.find(function (datas) {
        return datas.sexo === "M";
    }
)

console.log(numMen);

const mediaFem = data.reduce (function (media) {
    return media.altura
})