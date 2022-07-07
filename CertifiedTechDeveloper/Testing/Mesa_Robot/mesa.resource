*** Variables ***
${SITE}                                    https://bugbank.netlify.app/
${NAVEGADOR}                               Chrome
${BOTAO_REGISTRAR}                         xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[3]/button[2]
${REGISTRAR_EMAIL}                         xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[2]/input
${EMAIL_NOVO}                              delgadoDh@bug.com
${REGISTRAR_NOME}                          xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[3]/input
${NOME}                                    Delgado
${REGISTRAR_SENHA}                         xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[4]/div/input
${SENHA_NOVA}                              Delgado123
${CONFIRMAR_SENHA}                         xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[5]/div/input
${CONFIRMAR}                               Delgado123
${BOTAO_CONTA_COM_SALDO}                   xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/div[6]/label/span
${BOTAO_CADASTRAR}                         xpath=//*[@id="__next"]/div/div[2]/div/div[2]/form/button
${BOTAO_FECHAR_CADASTRO}                   xpath=//*[@id="btnCloseModal"]
${CAMPO_EMAIL}                             xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[1]/input
${EMAIL}                                   delgadoDh@bug.com
${CAMPO_SENHA}                             xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[2]/div/input
${SENHA}                                   Delgado123
${BOTAO_ACESSAR}                           xpath=//*[@id="__next"]/div/div[2]/div/div[1]/form/div[3]/button[1]
${BOTAO_EXTRATO}                           xpath=//*[@id="btn-EXTRATO"]
${BOTAO_SAIR}                              xpath=//*[@id="btnExit"]


*** Keywords ***
Acessar o site
  Open Browser                             ${SITE}                        ${NAVEGADOR}
  Maximize Browser Window

Clicar em 'Registrar'
  Wait and Click                           ${BOTAO_REGISTRAR}

Registrar novo usuário
  Wait and Input Text                      ${REGISTRAR_EMAIL}             ${EMAIL_NOVO}
  Wait and Input Text                      ${REGISTRAR_NOME}              ${NOME}
  Wait and Input Text                      ${REGISTRAR_SENHA}             ${SENHA_NOVA}
  Wait and Input Text                      ${CONFIRMAR_SENHA}             ${CONFIRMAR}
  Wait and Click                           ${BOTAO_CONTA_COM_SALDO}
  Wait and Click                           ${BOTAO_CADASTRAR}
  Wait and Click                           ${BOTAO_FECHAR_CADASTRO}

Fazer login
  Wait and Input Text                      ${CAMPO_EMAIL}                 ${EMAIL}
  Wait and Input Text                      ${CAMPO_SENHA}                 ${SENHA}
  Wait and Click                           ${BOTAO_ACESSAR}

Clicar em 'Extrato'
  Wait and Click                           ${BOTAO_EXTRATO}

Clicar em 'Sair'
  Wait and Click                           ${BOTAO_SAIR}


### Leywords Personalizadas ###

Wait and Click
  [Arguments]                              ${ELEMENTO}
  Wait Until Element is Visible            ${ELEMENTO}
  Click Element                            ${ELEMENTO}

Wait and Input Text
  [Arguments]                              ${CAMPO}                       ${TEXTO}
  Wait Until Element is Visible            ${CAMPO}
  Input Text                               ${CAMPO}                       ${TEXTO}