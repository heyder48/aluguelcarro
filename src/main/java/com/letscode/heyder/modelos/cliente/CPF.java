package com.letscode.heyder.modelos.cliente;

import com.letscode.heyder.exceptions.CPFInvalidoException;

public class CPF {

    private final String numero;

    public String getNumero() {
        return numero;
    }

    

    public CPF(String numeroCPF) throws CPFInvalidoException {
        
        if (numeroCPF.length() != 11) {
            throw new CPFInvalidoException("CPF deve ter 11 dígitos");
        }

        this.numero = numeroCPF;
    }

}
