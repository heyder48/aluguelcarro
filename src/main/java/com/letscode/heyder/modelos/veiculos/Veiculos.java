package com.letscode.heyder.modelos.veiculos;

import java.math.BigDecimal;

public abstract class Veiculos {

    private final Marca marca;
    private final String modelo;
    private final String ano;
    private Cor cor;
    private final String placa;

    public Veiculos(final Marca marca, final String modelo, final String ano, final Cor cor, final String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public abstract BigDecimal precoBase();
    
}
