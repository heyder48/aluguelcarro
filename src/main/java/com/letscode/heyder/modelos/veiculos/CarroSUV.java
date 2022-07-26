package com.letscode.heyder.modelos.veiculos;

import java.math.BigDecimal;

public class CarroSUV extends Veiculos {

    @Override
    public BigDecimal precoBase() {
        return new BigDecimal("200d");
    }


    
}
