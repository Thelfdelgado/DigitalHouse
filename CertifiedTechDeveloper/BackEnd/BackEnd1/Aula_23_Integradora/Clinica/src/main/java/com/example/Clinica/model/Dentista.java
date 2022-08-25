package com.example.Clinica.model;

public class Dentista {
    private Integer idDentista;
    private String nome;
    private Integer numMatricula;
    private Boolean atendeConvenio;

    public Dentista(Integer idDentista, String nome, Integer numMatricula, Boolean atendeConvenio) {
        this.idDentista = idDentista;
        this.nome = nome;
        this.numMatricula = numMatricula;
        this.atendeConvenio = atendeConvenio;
    }

    public Dentista(String nome, Integer numMatricula, Boolean atendeConvenio) {
        this.nome = nome;
        this.numMatricula = numMatricula;
        this.atendeConvenio = atendeConvenio;
    }

    public Integer getIdDentista() {
        return idDentista;
    }

    public void setIdDentista(Integer idDentista) {
        this.idDentista = idDentista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(Integer numMatricula) {
        this.numMatricula = numMatricula;
    }

    public Boolean getAtendeConvenio() {
        return atendeConvenio;
    }

    public void setAtendeConvenio(Boolean atendeConvenio) {
        this.atendeConvenio = atendeConvenio;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "idDentista=" + idDentista +
                ", nome='" + nome + '\'' +
                ", numMatricula=" + numMatricula +
                ", atendeConvenio=" + atendeConvenio +
                '}';
    }
}
