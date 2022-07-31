package com.letscode.heyder.modelos.veiculos;

import java.math.BigDecimal;

public class CarroPequeno extends Veiculo {

    public CarroPequeno(final Marca marca, final String modelo, final String ano, final Cor cor, final String placa) {
        super(marca, modelo, ano, cor, placa);
    }

    @Override
    public BigDecimal precoBase() {
        return new BigDecimal("100");
    }


    
    
}
