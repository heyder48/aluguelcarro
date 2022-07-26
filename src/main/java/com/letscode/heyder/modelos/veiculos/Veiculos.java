package com.letscode.heyder.modelos.veiculos;

import java.math.BigDecimal;

public abstract class Veiculos {

    private Marca marca;
    private String modelo;
    private String ano;
    private Cor cor;
    private String placa;

    public abstract BigDecimal precoBase();
    
}
