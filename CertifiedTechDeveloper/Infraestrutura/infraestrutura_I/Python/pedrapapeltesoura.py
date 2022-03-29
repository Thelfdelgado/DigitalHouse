#encoding:UTF-8
import random

while True: 
    aleatorio = random.randrange(0, 5)
    escolhaPc = ""
    print("1)Pedra")
    print("2)Papel")
    print("3)Tesoura")
    print("4)Lizard")
    print("5)Spock")
    print("6)Sair do Programa")
    opcao = int(input("O que você escolhe: "))
    
    if opcao == 1:
        escolhaUsuario = "pedra"
    elif opcao == 2:
        escolhaUsuario = "papel"
    elif opcao == 3:
        escolhaUsuario = "tesoura"
    elif opcao == 4:
        escolhaUsuario = "lizard"
    elif opcao == 5:
        escolhaUsuario = "spock"
    elif opcao == 6:
        print ("Nos vemos!")
        break
    else:
        print ("Valor Invalido")
        continue
        
    print("Tua escolha: ", escolhaUsuario)   
    if aleatorio == 0:
        escolhaPc = "pedra"
    elif aleatorio == 1:
        escolhaPc = "papel"
    elif aleatorio == 2:
        escolhaPc = "tesoura"
    elif aleatorio == 3:
        escolhaPc = "lizard"
    elif aleatorio == 4:
        escolhaPc = "spock"
    print("PC escolheu: ", escolhaPc)
    print("...")
    
    if escolhaPc == "pedra" and escolhaUsuario == "papel":
        print("Ganhou, papel cobre pedra")
    elif escolhaPc == "pedra" and escolhaUsuario == "spock":
        print("Ganhou, spock vaporiza pedra")
    elif escolhaPc == "papel" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura corta papel")
    elif escolhaPc == "papel" and escolhaUsuario == "lizard":
        print("Ganhou, lizard come papel")
    elif escolhaPc == "tesoura" and escolhaUsuario == "pedra":
        print("Ganhou, pedra amassa tesoura")
    elif escolhaPc == "tesoura" and escolhaUsuario == "spock":
        print("Ganhou, spock quebra tesoura")
    elif escolhaPc == "spock" and escolhaUsuario == "lizard":
        print("Ganhou, lizard envenena spock")
    elif escolhaPc == "spock" and escolhaUsuario == "papel":
        print("Ganhou, papel refuta spock")
    elif escolhaPc == "lizard" and escolhaUsuario == "pedra":
        print("Ganhou, pedra esmaga lizard")
    elif escolhaPc == "lizard" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura decapita lizard")
        
    if escolhaUsuario == "pedra" and escolhaPc == "papel":
        print("Perdeu, papel cobre pedra")
    elif escolhaUsuario == "pedra" and escolhaPc == "spock":
        print("Perdeu, spock vaporiza pedra")
    elif escolhaUsuario == "papel" and escolhaPc == "tesoura":
        print("Perdeu, tesoura corta papel")
    elif escolhaUsuario == "papel" and escolhaPc == "lizard":
        print("Perdeu, lizard come papel")
    elif escolhaUsuario == "tesoura" and escolhaPc == "pedra":
        print("Perdeu, pedra amassa tesoura")
    elif escolhaUsuario == "tesoura" and escolhaPc == "spock":
        print("Perdeu, spock quebra tesoura")
    elif escolhaUsuario == "spock" and escolhaPc == "lizard":
        print("Perdeu, lizard envenena spock")
    elif escolhaUsuario == "spock" and escolhaPc == "papel":
        print("Perdeu, papel refuta spock")
    elif escolhaUsuario == "lizard" and escolhaPc == "pedra":
        print("Perdeu, pedra esmaga lizard")
    elif escolhaUsuario == "lizard" and escolhaPc == "tesoura":
        print("Perdeu, tesoura decapita lizard")
    elif escolhaPc == escolhaUsuario:
        print("Empate")
    again = input("Jogar novamente? s/n: ")
    if 's' in again:
        continue
    elif 'n' in again:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")