*** Variables ***
${SITE}                                    https://www.digitalhouse.com/br
${NAVEGADOR}                               Chrome
${IFRAME_COOKIES}                          xpath=/html/body/iframe[2]
${BOTAO_COOKIES}                           xpath=/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div[2]
${OUTROS_CURSOS}                           xpath=//*[@id="__next"]/div/main/section/div/div[3]/div/a
${DATA_ANALYTICS}                          xpath=//*[@id="__next"]/div/main/section[2]/div/div/div[3]/a/span/p[1]
${CHAMADA_DATA_ANALYTICS}                  voltado para qualquer pessoa que deseja ampliar suas capacidades analíticas
${DESCRICAO_DATA_ANALYTICS}                pessoas interessadas
${INSCREVER_AGORA}                         xpath=//*[@id="__next"]/div/main/section/div/div/div[1]/div/div[2]/div[1]/a
${INSCREVER}                               xpath=//*[@id="proximas-turmas"]/div/div[2]/div[2]/div/a
${PRECO}                                   R$10.315

*** Keywords ***
Abrir o novo site da Digital House Brasil
  Open Browser                             ${SITE}                ${NAVEGADOR}
  Maximize Browser Window

Clicar em “Aceitar Cookies”
  Sleep                                    5
  Select Frame                             ${IFRAME_COOKIES}
  Wait and Click                           ${BOTAO_COOKIES}
  Unselect Frame

Clicar em “Ver outros cursos”
  Wait and Click                           ${OUTROS_CURSOS}

Selecionar o curso “Data Analytics”
  Wait and Click                           ${DATA_ANALYTICS}

Verificar se o texto de chamada do curso está correto
  Page Should Contain                      ${CHAMADA_DATA_ANALYTICS}

Verificar se a descrição do curso está correta
  Page Should Contain                      ${DESCRICAO_DATA_ANALYTICS}

Clicar em “Inscreva-se agora
  Wait and Click                           ${INSCREVER_AGORA}

Clicar em “Inscreva-se”
  Sleep                                    5
  Wait and Click                           ${INSCREVER}

Validar que o valor do curso é “R$10.315”
  Page Should Contain                      ${PRECO}

### Leywords Personalizadas ###

Wait and Click
  [Arguments]                              ${ELEMENTO}
  Wait Until Element is Visible            ${ELEMENTO}
  Click Element                            ${ELEMENTO}

Wait and Input Text
  [Arguments]                              ${CAMPO}               ${TEXTO}
  Wait Until Element is Visible            ${CAMPO}
  Input Text                               ${CAMPO}               ${TEXTO}