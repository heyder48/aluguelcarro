package com.letscode.heyder.modelos.cliente;

import java.util.ArrayList;
import java.util.List;

import com.letscode.heyder.exceptions.EmailInvalidoException;

/**
 * Cliente
 */
public abstract class Cliente {

    protected Email email;
    protected List<Telefone> telefones = new ArrayList<>();
    protected Endereco endereco;


    public Cliente(String email, Endereco endereco) throws EmailInvalidoException {
        this.email = new Email(email);
        
        this.endereco = endereco;
    }

    public void addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }
    
    public void deletaTelefone(Telefone telefone) {
        this.telefones.remove(telefone);
    }


}