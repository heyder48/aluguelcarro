package com.letscode.heyder.modelos.cliente;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null || !ddd.matches("^[0-9]{2}$") || !numero.matches("^([0-9]{8}|[0-9]{9})$")) {
            throw new IllegalArgumentException("Telefone invalido");
        }
        
        this.ddd = ddd;
        this.numero = numero;
    }

}
