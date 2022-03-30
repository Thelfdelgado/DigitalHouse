# encoding:UTF-8
import random
import sys

userWin = 0
pcWin = 0
totalScore = 0


def percent():
    if totalScore > 0:
        x = ((totalScore - pcWin) / totalScore) * 100
        return x
    elif totalScore == 0:
        x = 0
        return x


while True:
    totalScore = userWin + pcWin
    aleatorio = random.randrange(0, 4)
    escolhaPc = ""
    print(" ")
    print("*** Pedra | Papel | Tesoura | Lagarto | Spock ***")
    print(" ")
    print("1)Pedra")
    print("2)Papel")
    print("3)Tesoura")
    print("4)Lizard")
    print("5)Spock")
    print("6) Show Scores")
    print("7)Sair do Programa")
    print(" ")
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
        print("Pontuações: ")
        print("Usuário: ", userWin, " pontos")
        print("Pc: ", pcWin, " pontos")
        print("Porcentagem de vitórias: ", percent(), "% ")
        continue
    elif opcao == 7:
        print("Nos vemos!")
        break
    else:
        print("Valor Invalido")
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
        userWin += 1
    elif escolhaPc == "pedra" and escolhaUsuario == "spock":
        print("Ganhou, spock vaporiza pedra")
        userWin += 1
    elif escolhaPc == "papel" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura corta papel")
        userWin += 1
    elif escolhaPc == "papel" and escolhaUsuario == "lizard":
        print("Ganhou, lizard come papel")
        userWin += 1
    elif escolhaPc == "tesoura" and escolhaUsuario == "pedra":
        print("Ganhou, pedra amassa tesoura")
        userWin += 1
    elif escolhaPc == "tesoura" and escolhaUsuario == "spock":
        print("Ganhou, spock quebra tesoura")
        userWin += 1
    elif escolhaPc == "spock" and escolhaUsuario == "lizard":
        print("Ganhou, lizard envenena spock")
        userWin += 1
    elif escolhaPc == "spock" and escolhaUsuario == "papel":
        print("Ganhou, papel refuta spock")
        userWin += 1
    elif escolhaPc == "lizard" and escolhaUsuario == "pedra":
        print("Ganhou, pedra esmaga lizard")
        userWin += 1
    elif escolhaPc == "lizard" and escolhaUsuario == "tesoura":
        print("Ganhou, tesoura decapita lizard")
        userWin += 1

    if escolhaUsuario == "pedra" and escolhaPc == "papel":
        print("Perdeu, papel cobre pedra")
        pcWin += 1
    elif escolhaUsuario == "pedra" and escolhaPc == "spock":
        print("Perdeu, spock vaporiza pedra")
        pcWin += 1
    elif escolhaUsuario == "papel" and escolhaPc == "tesoura":
        print("Perdeu, tesoura corta papel")
        pcWin += 1
    elif escolhaUsuario == "papel" and escolhaPc == "lizard":
        print("Perdeu, lizard come papel")
        pcWin += 1
    elif escolhaUsuario == "tesoura" and escolhaPc == "pedra":
        print("Perdeu, pedra amassa tesoura")
        pcWin += 1
    elif escolhaUsuario == "tesoura" and escolhaPc == "spock":
        print("Perdeu, spock quebra tesoura")
        pcWin += 1
    elif escolhaUsuario == "spock" and escolhaPc == "lizard":
        print("Perdeu, lizard envenena spock")
        pcWin += 1
    elif escolhaUsuario == "spock" and escolhaPc == "papel":
        print("Perdeu, papel refuta spock")
        pcWin += 1
    elif escolhaUsuario == "lizard" and escolhaPc == "pedra":
        print("Perdeu, pedra esmaga lizard")
        pcWin += 1
    elif escolhaUsuario == "lizard" and escolhaPc == "tesoura":
        print("Perdeu, tesoura decapita lizard")
        pcWin += 1
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