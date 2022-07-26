package com.letscode.heyder.modelos.veiculos;

import java.math.BigDecimal;

public class CarroPequeno extends Veiculos {

    @Override
    public BigDecimal precoBase() {
        return new BigDecimal("100d");
    }


    
}
