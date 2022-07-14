# Luiz Felipe Delgado Vieira Martins De Souza

*** Settings ***
Library                         SeleniumLibrary
Resource                        ./Hurb.resource
Test Setup                      Abrir o site do Hurb
# Test Teardown                   Close Browser

*** Test Cases ***
Processo de compra de pacote de viagem Buenos Aires
  Clicar em “Permitir todos os cookies”
  Selecionar a opção “Pacotes”
  Buscar por "Buenos Aires" e clicar em “Pesquisar”
  Selecionar um pacote de viagem
  Clicar em “Escolher pacote”
  Selecionar as opções do pacote e clicar em “Ir para pagamento”
  Validar as informações da “Configuração” da viagem
  Validar as informações do período da viagem
  Selecionar a opção “Boleto parcelado”
  Preencher os dados de pagamento
  Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Validar a informação sobre cancelamento grátis

Processo de compra de pacote de viagem Uruguai
  Clicar em “Permitir todos os cookies”
  Selecionar a opção “Pacotes”
  Buscar por "Uruguai" e clicar em “Pesquisar”
  Selecionar um pacote de viagem
  Clicar em “Escolher pacote”
  Selecionar as opções do Uruguai e clicar em “Ir para pagamento”
  Validar as informações da “Configuração” da viagem
  Validar as informações do período da viagem Uruguai
  Selecionar a opção “Boleto parcelado”
  Preencher os dados de pagamento
  Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Validar a informação sobre cancelamento grátis

Processo de compra de pacote de viagem Chile
  Clicar em “Permitir todos os cookies”
  Selecionar a opção “Pacotes”
  Buscar por "Chile" e clicar em “Pesquisar”
  Selecionar um pacote de viagem
  Clicar em “Escolher pacote”
  Selecionar as opções do Chile e clicar em “Ir para pagamento”
  Validar as informações da “Configuração” da viagem
  Validar as informações do período da viagem Chile
  Selecionar a opção “Boleto parcelado”
  Preencher os dados de pagamento
  Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Validar a informação sobre cancelamento grátis