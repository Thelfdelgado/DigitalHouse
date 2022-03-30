let validacao = true;

let usuarioObjeto = {
    nome: "Usuario",
    endereco: {
        cidade: {
            nome: "Volta Redonda",
            cep: "27258-390"
        }
    }
}

let usuarioObjetoJson = JSON.stringify(usuarioObjeto);

let minhaPromisse = new Promise(function(resolve, reject){
    setTimeout(() => {
        if (validacao){
            resolve(usuarioObjetoJson);
        } else {
            reject(validacao);
        }
    }, 4000);
});

let resultado = minhaPromisse.then(
    function(resultado){
        let resultadoJs = JSON.parse(resultado)
        return resultadoJs;
    }
).then(function(resultado){
    console.log("Segundo then");
    console.log(resultado);
    console.log(resultado);
}).catch(
    function(erro){
        console.log(erro);
    }
)