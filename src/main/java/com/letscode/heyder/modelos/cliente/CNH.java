package com.letscode.heyder.modelos.cliente;

import java.time.LocalDate;


import com.letscode.heyder.exceptions.CNHInvalidaException;

public class CNH {

    private String numero;
    private LocalDate dataVencimento;
    

    public CNH(String numero, LocalDate dataVencimento) throws CNHInvalidaException {
        if(numero.length() != 11) {
            throw new CNHInvalidaException("CNH deve ter 11 dígitos");
        }
        if(dataVencimento.isBefore(LocalDate.now())) {
            throw new CNHInvalidaException("Data de vencimento deve ser maior que a data atual");
        }
        
        this.numero = numero;
        this.dataVencimento = dataVencimento;
    }

    public String getNumero() {
        return numero;
    }




    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    
    

    

}
