package com.aula46.TesteIntegrador.model;

public class LinguagemModel {
    public String tipo;
    public Boolean seOrientadoAoObjeto;

    public LinguagemModel(String tipo, Boolean seOrientadoAoObjeto) {
        this.tipo = tipo;
        this.seOrientadoAoObjeto = seOrientadoAoObjeto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getSeOrientadoAoObjeto() {
        return seOrientadoAoObjeto;
    }

    public void setSeOrientadoAoObjeto(Boolean seOrientadoAoObjeto) {
        this.seOrientadoAoObjeto = seOrientadoAoObjeto;
    }
}
