package com.letscode.heyder.modelos.cliente;

import com.letscode.heyder.exceptions.EnderecoInvalidoException;

public class Endereco {

    private  String logradouro;
    private  String numero;
    private  String complemento;
    private  String bairro;
    private  String cidade;
    private  String estado;
    private  String cep;

    

    
    /**
     * Construtor da classe Endereco.
     * @param logradouro
     * @param numero
     * @param complemento
     * @param bairro
     * @param cidade
     * @param estado
     * @param cep
     * @throws EnderecoInvalidoException
     */

    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
            String cep) throws EnderecoInvalidoException {
        
        if(logradouro == null || logradouro.isEmpty()) {
            throw new EnderecoInvalidoException("Logradouro não pode ser nulo ou vazio");
        }
        if(numero == null || numero.isEmpty()) {
            throw new EnderecoInvalidoException("Numero não pode ser nulo ou vazio");
        }
        if(bairro == null || bairro.isEmpty()) {
            throw new EnderecoInvalidoException("Bairro não pode ser nulo ou vazio");
        }

        if(cidade == null || cidade.isEmpty()) {
            throw new EnderecoInvalidoException("Cidade não pode ser nulo ou vazio");
        }
        if(estado == null || estado.isEmpty()) {
            throw new EnderecoInvalidoException("Estado não pode ser nulo ou vazio");
        }
        if(cep == null || cep.isEmpty()) {
            throw new EnderecoInvalidoException("CEP não pode ser nulo ou vazio");
        }

        
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


}
