var nome = prompt("Insira seu nome")
var texto = document.createTextNode("Ola " + nome)
var p = document.createElement("p")
texto.appendChild(p)
document.body.appendChild(p)