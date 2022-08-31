package com.example.ecommerceMVC.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Produto {
    private int id;
    private String nomeProduto;
    private double valor;
}
