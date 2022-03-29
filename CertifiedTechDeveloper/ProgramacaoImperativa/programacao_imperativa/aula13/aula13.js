//Fixacao

// {

//     "nome": "Luiz",
//     "apelido": "Exercicio",
//     "idade": 23,
//     "usuario": "@Exercicio"
//     "email": "Exercicio@gmail.com"

// }

//Mesa

function ContasBancarias(numeroDeConta, tipoDeConta, saldo, titularDaConta) {
    this.numeroDeConta = numeroDeConta;
    this.tipoDeConta = tipoDeConta;
    this.saldo = saldo;
    this.titularDaConta = titularDaConta;
}

let conta0 = new ContasBancarias('5486273622', 'Conta Corrente', 27771, 'Abigael Natte');
let conta1 = new ContasBancarias('1183971869', 'Conta Poupança', 8675, 'Ramon Connell');
let conta2 = new ContasBancarias('9582019689', 'Conta Poupança', 27363, 'Jarret Lafuente');
let conta3 = new ContasBancarias('1761924656', 'Conta Poupança', 32415, 'Ansel Ardley');
let conta4 = new ContasBancarias('7401971607', 'Conta Poupança', 18789, 'Jacki Shurmer');
let conta5 = new ContasBancarias('630841470', 'Conta Corrente', 28776, 'Jobi Mawtus');
let conta6 = new ContasBancarias('4223508636', 'Conta Corrente', 2177, 'Thomasin Latour');
let conta7 = new ContasBancarias('185979521', 'Conta Poupança', 25994, 'Lonnie Verheijden');
let conta8 = new ContasBancarias('3151956165', 'Conta Corrente', 7601, 'Alonso Wannan');
let conta9 = new ContasBancarias('2138105881', 'Conta Poupança', 33196, 'Bendite Huggett');

const cadContasBancarias = [conta0, conta1, conta2, conta3, conta4, conta5, conta6, conta7, conta8, conta9];


let banco = {
    clientes: cadContasBancarias,
    consultarCliente: function (titularDaConta) {
        for (var i = 0; i < cadContasBancarias.length; i++) {
            if (cadContasBancarias[i].titularDaConta == titularDaConta) {
                return cadContasBancarias[i];
            }
        }
    },
    deposito: function (titularDaConta, valorDeposito) {
        for (var i = 0; i < cadContasBancarias.length; i++) {
            if (cadContasBancarias[i].titularDaConta == titularDaConta) {
                return 'Deposito realizado, seu novo saldo é ' + (cadContasBancarias[i].saldo += valorDeposito);
            }
        }
    },
    saque: function (titularDaConta, valorDoSque) {
        for (var i = 0; i < cadContasBancarias.length; i++) {
            if (cadContasBancarias[i].titularDaConta == titularDaConta && cadContasBancarias[i].saldo >= valorDoSque) {
                return 'Extração feita com sucesso, seu novo saldo é: ' + (cadContasBancarias[i].saldo -= valorDoSque);
            } else if (cadContasBancarias[i].titularDaConta == titularDaConta && cadContasBancarias[i].saldo < valorDoSque) {return 'Fundos insuficientes'}
        }
    },
}

console.log(banco.consultarCliente('Lonnie Verheijden'));
console.log(banco.deposito('Alonso Wannan', 200));
console.log(banco.saque('Alonso Wannan', 200));