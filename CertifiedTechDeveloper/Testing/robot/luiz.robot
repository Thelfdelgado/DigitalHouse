*** Settings ***
Library                         SeleniumLibrary
Resource                        ./luiz.resource
# Test Teardown                   Close Browser

*** Test Cases ***
Processo de compra na loja Sauce Demo
  Acessar o site
  Fazer login
  Adicionar um produto ao carrinho
  Acessar o carrinho
  Clicar em 'Checkout'
  Preencher informações do usuário
  Clicar em 'Finish'

Processo de compra na loja Sauce Demo com usuário incorreto
  Acessar o site
  Fazer login com usuário incorreto