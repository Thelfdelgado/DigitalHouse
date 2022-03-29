onload = function () {
    alert("Cadastre Seu Nome e Sobrenome!")
};

let btnCadastra = document.getElementById("botaoCadastrar");

    btnCadastra.addEventListener("click", (evento) => {
        evento.preventDefault();
        console.log("O botão 'Cadastrar' foi clicado");
    });

    btnCadastra.onmouseover = function () {
        console.log("Cursor em cima do button 'Cadastrar'");
        btnCadastra.style.backgroundColor = "#d6d6d6";

    btnCadastra.onmouseout = function () {
        console.log("Cursor saiu do button 'Cadastrar'");
        btnCadastra.style.backgroundColor = "";
    }};

let btnLimpar = document.getElementById("botaoLimpar");

    btnLimpar.onmouseover = function () {
        console.log("Cursor em cima do button 'Cadastrar'");
        btnLimpar.style.backgroundColor = "#d6d6d6";

    btnLimpar.onmouseout = function () {
        console.log("Cursor saiu do button 'Cadastrar'");
        btnLimpar.style.backgroundColor = "";
    }};