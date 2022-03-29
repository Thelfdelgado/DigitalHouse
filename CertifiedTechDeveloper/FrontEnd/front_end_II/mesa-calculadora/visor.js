// Função que adiciona os números no Visor quando pressionado os botões
function calcNum(num) {
    if (typeof gvisor == 'undefined') {
       document.calcform.visor.value = '';
    }
    document.calcform.visor.value = document.calcform.visor.value + num;
    gvisor = 1;
 }