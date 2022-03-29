// Função do algoritmo de "passagem" das ações do usuário
function calcParse(oper) {
    var valor = document.calcform.visor.value;
    delete gvisor;
 
    if (typeof goper != 'undefined' && oper == 'resultado') {
        gvalor = calcOper(goper, gvalor, valor);
        document.calcform.visor.value = gvalor;
        delete oper;
        delete gvalor;
        return(0);
    }
 
    if (typeof gvalor != 'undefined') {
        gvalor = calcOper(goper, gvalor, valor);
        goper = oper;
        document.calcform.visor.value = gvalor;
    } else {
        gvalor = valor;
        goper = oper;
    }
 
}