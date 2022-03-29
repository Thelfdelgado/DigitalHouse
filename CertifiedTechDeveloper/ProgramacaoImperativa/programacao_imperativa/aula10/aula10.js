let listaDesejo = [ "Celular", "Shape", "Pedal" ];
console.log(listaDesejo);
//[ 'Celular', 'Shape', 'Pedal' ]

console.log("Join separa os elementos do array e retorna uma string.");
console.log(listaDesejo.join(" | "));
//Celular | Shape | Pedal

console.log("Pop remove o último elemento do array e retorna aquele elemento.");
listaDesejo.pop();
console.log(listaDesejo);
//[ 'Celular', 'Shape' ]

console.log("Push adiciona um ou mais elementos ao final do array e retorna o novo comprimento.");
listaDesejo.push("CPU");
console.log(listaDesejo);
//[ 'Celular', 'Shape', 'CPU' ]

console.log("Shift remove o primeiro elemento do array e retorna esse elemento.");
listaDesejo.shift();
console.log(listaDesejo);
//[ 'Shape', 'CPU' ]

console.log("Unshift adiciona um ou mais elementos no início de um array.");
listaDesejo.unshift("Carro");
console.log(listaDesejo);
//[ 'Carro', 'Shape', 'CPU' ]