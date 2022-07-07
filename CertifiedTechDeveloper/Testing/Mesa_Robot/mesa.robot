*** Settings ***
Library                         SeleniumLibrary
Resource                        ./mesa.resource
# Test Teardown                   Close Browser

*** Test Cases ***
Processo de Transferência no BugBank
  Acessar o site
  Clicar em 'Registrar'
  Registrar novo usuário
  Fazer login
  Clicar em 'Extrato'
  Clicar em 'Sair'