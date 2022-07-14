*** Variables ***
${SITE}                                    https://www.hurb.com/br
${NAVEGADOR}                               Chrome
${COOKIES}                                 xpath=//*[@id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"]
${PACOTES}                                 xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${CAMPO_VAI_PRA_ONDE}                      xpath=//*[@id="destination-input"]
${BUENOS}                                  Buenos Aires
${URUGUAI}                                 Uruguai
${CHILE}                                   Chile
${PESQUISAR}                               xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[2]/button
${PACOTE_DE_VIAGEM}                        css=#__next > div > main > section > div.ResultsCardsContainer_ResultsCardContainer__CDDwR > a:nth-child(1) > div.h-kr8vcn
${ESCOLHER_PACOTE}                         xpath=//*[@id="__next"]/div/main/div[3]/aside/div/div/div[2]/button
${SELECIONAR_OPCAO}                        xpath=//*[@id="LGPKG-1384831-3032675"]
${SELECIONAR_OPCAO2}                       xpath=//*[@id="LGPKG-1102417-2732487"]
${SELECIONAR_OPCAO3}                       xpath=/html/body/div[13]/div/div/div/section/div/div/ul/li[1]/label/div[2]/div[2]
${PROXIMO}                                 css=body > div:nth-child(52) > div > div > div > footer > button
${SELECIONAR_DIARIA}                       xpath=/html/body/div[13]/div/div/div/section/div/button/div/div
${SELECIONAR_DIARIA2}                      xpath=/html/body/div[13]/div/div/div/section/div/button[1]/div/div
${SELECIONAR_DIARIA3}                      xpath=/html/body/div[13]/div/div/div/section/div/button/div/div
${PROXIMO2}                                css=body > div:nth-child(52) > div > div > div > footer > button.h-1yuatql
${IR_PARA_PAGAMENTO}                       css=body > div:nth-child(52) > div > div > div > footer > button.h-1yuatql
${CONFIGURACAO}                            1 pessoa por pacote
${PERIODO_VIAGEM}                          01 Mar 2024
${PERIODO_VIAGEM_URUGUAI}                  15 Set 2022
${PERIODO_VIAGEM_CHILE}                    01 Mar 2024
${BOLETO_PARCELADO}                        xpath=//*[@id="ui-id-1"]
${CAMPO_NOME}                              css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(1) > div > input
${NOME}                                    Luiz Delgado
${CAMPO_CPF}                               xpath=//*[@id="paymentMethods__bill"]/section/div[1]/div[2]/div/input
${CPF}                                     89890353768
${CAMPO_CELULAR}                           xpath=//*[@id="paymentMethods__bill"]/section/div[2]/div[1]/div/input
${CELULAR}                                 24999099334
${TERMOS_POLITICA}                         xpath=//*[@id="cancellation-policy"]
${CANCELAMENTO_GRATIS}                     Cancelamento Grátis!



*** Keywords ***
Abrir o site do Hurb
  Open Browser  ${SITE}  ${NAVEGADOR}
  Maximize Browser Window


Clicar em “Permitir todos os cookies”
  Sleep                                    5
  Wait and Click                           ${COOKIES}

Selecionar a opção “Pacotes”
  Wait and Click                           ${PACOTES}

Buscar por "Buenos Aires" e clicar em “Pesquisar”
  Wait and Input Text  ${CAMPO_VAI_PRA_ONDE}  ${BUENOS}
  Wait and Click  ${PESQUISAR}

Buscar por "Uruguai" e clicar em “Pesquisar”
  Wait and Input Text  ${CAMPO_VAI_PRA_ONDE}  ${URUGUAI}
  Wait and Click  ${PESQUISAR}

Buscar por "Chile" e clicar em “Pesquisar”
  Wait and Input Text  ${CAMPO_VAI_PRA_ONDE}  ${CHILE}
  Wait and Click  ${PESQUISAR}

Selecionar um pacote de viagem
  Wait and Click  ${PACOTE_DE_VIAGEM}

Clicar em “Escolher pacote”
  Switch Window  NEW
  Wait and Click  ${ESCOLHER_PACOTE}

Selecionar as opções do pacote e clicar em “Ir para pagamento”
  Wait and Click  ${SELECIONAR_OPCAO}
  Sleep  3
  Wait and Click  ${PROXIMO} 
  Wait and Click  ${SELECIONAR_DIARIA}
  Sleep  3
  Wait and Click  ${PROXIMO2}
  Wait and Click  ${IR_PARA_PAGAMENTO}

Selecionar as opções do Uruguai e clicar em “Ir para pagamento”
  Wait and Click  ${SELECIONAR_OPCAO2}
  Sleep  3
  Wait and Click  ${PROXIMO} 
  Wait and Click  ${SELECIONAR_DIARIA2}
  Sleep  3
  Wait and Click  ${PROXIMO2}
  Wait and Click  ${IR_PARA_PAGAMENTO}

Selecionar as opções do Chile e clicar em “Ir para pagamento”
  Wait and Click  ${SELECIONAR_OPCAO3}
  Sleep  3
  Wait and Click  ${PROXIMO} 
  Wait and Click  ${SELECIONAR_DIARIA3}
  Sleep  3
  Wait and Click  ${PROXIMO2}
  Wait and Click  ${IR_PARA_PAGAMENTO}

Validar as informações da “Configuração” da viagem
  Sleep  5
  Page Should Contain  ${CONFIGURACAO}

Validar as informações do período da viagem
  Page Should Contain  ${PERIODO_VIAGEM}

Validar as informações do período da viagem Uruguai
  Page Should Contain  ${PERIODO_VIAGEM_URUGUAI}

Validar as informações do período da viagem Chile
  Page Should Contain  ${PERIODO_VIAGEM_CHILE}

Selecionar a opção “Boleto parcelado”
  Wait and Click  ${BOLETO_PARCELADO}

Preencher os dados de pagamento
  Sleep  2
  Wait and Input Text  ${CAMPO_NOME}  ${NOME}
  Wait and Input Text  ${CAMPO_CPF}  ${CPF}
  Wait and Input Text  ${CAMPO_CELULAR}  ${CELULAR}

Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Wait and Click  ${TERMOS_POLITICA}

Validar a informação sobre cancelamento grátis
  Page Should Contain  ${CANCELAMENTO_GRATIS}

### Leywords Personalizadas ###

Wait and Click
  [Arguments]                              ${ELEMENTO}
  Wait Until Element is Visible            ${ELEMENTO}
  Click Element                            ${ELEMENTO}

Wait and Input Text
  [Arguments]                              ${CAMPO}               ${TEXTO}
  Wait Until Element is Visible            ${CAMPO}
  Input Text                               ${CAMPO}               ${TEXTO}