const espectadores = [

    {
        "nome": "Abigael Natte",
        "opiniao":1,
        "idade":29
    },
    {

        "nome": "Ramon Connell",
        "opiniao":2,
        "idade":45
    },
    {

        "nome": "Jarret Lafuente",
        "opiniao":3,
        "idade":21
    },
    {

        "nome": "Ansel Ardley",
        "opiniao":3,
        "idade":15
    },
    {

        "nome": "Jacki Shurmer",
        "opiniao":1,
        "idade":24
    },
    {

        "nome": "Jobi Mawtus",
        "opiniao":1,
        "idade":48
    },
    {

        "nome": "Thomasin Latour",
        "opiniao":2,
        "idade":18
    },
    {

        "nome": "Lonnie Verheijden",
        "opiniao":3,
        "idade":37
    },
    {

        "nome": "Alonso Wannan",
        "opiniao":2,
        "idade":22
    },
    {

        "nome": "Bendite Huggett",
        "opiniao":1,
        "idade":44
    }
  ]

  function resultado(a) {
    
    let regular = 0;
    let bom = 0;
    let otimo = 0;
    let somaIdadeOtimo = 0;
    let totalEspectadores = a.length;

    for (let i = 0; i < a.length; i++){
        opiniao = (a[i].opiniao)
    // console.log(opiniao);
    
    if ((a[i].opiniao) == 1){
        regular = (regular + 1);  
    }     

    if ((a[i].opiniao) == 2){
        bom = (bom + 1);  
    }    

    if ((a[i].opiniao) == 3){
        otimo = (otimo + 1);
        somaIdadeOtimo = (somaIdadeOtimo + (a[i].idade));
    }    
}
    console.log(regular + " espectadores acharam o filme regular.");
    console.log(bom + " espectadores acharam o filme bom. " + (bom/totalEspectadores)*100 + " % dos que foram no cinema");
    console.log(otimo + " espectadores acharam o filme ótimo. A média de idade deles é de " + Math.floor(somaIdadeOtimo/otimo) + " anos.");
    }


resultado(espectadores);