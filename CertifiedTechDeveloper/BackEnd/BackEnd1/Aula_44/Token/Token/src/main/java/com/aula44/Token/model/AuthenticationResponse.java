package com.aula44.Token.model;

public class AuthenticationResponse {
    // Classe para retornar com token para teste de autenticacao
    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
