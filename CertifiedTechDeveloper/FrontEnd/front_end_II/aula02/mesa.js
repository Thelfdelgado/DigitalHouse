function getRandomNumber(min, max) {
    min = Math.ceil(min)
    max = Math.floor(max)
    return Math.floor(Math.random() * (max - min)) + min
}

let userResult = prompt(`
Essa questão é de vida ou morte, escolha com sabedoria
1- Papel
2- Tesoura
3- Pedra
`)

let machineResult = getRandomNumber(1, 4)

switch (userResult) {
    case '1':
        userResult='Papel'
        if(machineResult===1){
            machineResult='Papel'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto empatou`)
        } else if (machineResult===2) {
            machineResult='Tesoura'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto voce se f# demais`)
        } else if (machineResult===3) {
            machineResult='Pedra'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto voce amassou o computador`)
        }
        break;
    case '2':
        userResult='Tesoura'
        if(machineResult===1){
            machineResult='Papel'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto voce amassou o computador`)
        } else if (machineResult===2) {
            machineResult='Tesoura'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto empatou`)
        } else if (machineResult===3) {
            machineResult='Pedra'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto voce se f# demais`)
        }
        break;
    case '3':
        userResult='Pedra'
        if(machineResult===1){
            machineResult='Papel'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto voce se f# demais`)
        } else if (machineResult===2) {
            machineResult='Tesoura'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto voce amassou o computador`)
        } else if (machineResult===3) {
            machineResult='Pedra'
            alert(`O computador mostrou ${machineResult} e você mostrou ${userResult} portanto empatou`)
        }
        break;
    default:
        alert('Voce nao escolheu nada portanto o computador acabou com sua raça')
}