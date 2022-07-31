package com.letscode.heyder.modelos.veiculos;

import java.math.BigDecimal;

public abstract class Veiculo {

    private final Marca marca;
    private final String modelo;
    private final String ano;
    private Cor cor;
    private final String placa;

    public Veiculo(final Marca marca, final String modelo, final String ano, final Cor cor, final String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public abstract BigDecimal precoBase();

    public Marca getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public Cor getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }
    
}
