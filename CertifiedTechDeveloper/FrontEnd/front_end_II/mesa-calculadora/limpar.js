
// Função que limpa a calculadora e todas as variáveis existentes.
function calcLimpar() {
    document.calcform.visor.value = '';
    delete gvalor;
    delete goper;
    delete gvisor;
}