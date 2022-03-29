let nome = document.getElementById("nome");
let sobrenome = document.getElementById("sobrenome");

let botaoSalvar = document.getElementById("salvar");

botaoSalvar.addEventListener("click", function(evento){
    evento.preventDefault();

    console.log((nome.value.trim().toLowerCase().concat(' ', sobrenome.value.toUpperCase())).replace(/a/gi, "@").replace(/e/gi, "3"));
})