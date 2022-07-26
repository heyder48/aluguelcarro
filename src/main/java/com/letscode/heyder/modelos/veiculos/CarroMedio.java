package com.letscode.heyder.modelos.veiculos;

import java.math.BigDecimal;

public class CarroMedio extends Veiculos {

    @Override
    public BigDecimal precoBase() {
        return new BigDecimal("150d");
    }


    
}
