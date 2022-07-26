package com.letscode.heyder.modelos.cliente;

import com.letscode.heyder.exceptions.CNPJInvalidoException;

public class CNPJ {

    private String numero;

    public CNPJ(String numero) throws CNPJInvalidoException {
        if(numero == null || numero.isEmpty()) {
            throw new CNPJInvalidoException("CNPJ não pode ser nulo ou vazio");
        }

        if(numero.length() != 14) {
            throw new CNPJInvalidoException("CNPJ deve ter 14 dígitos");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

}
