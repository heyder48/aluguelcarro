package com.letscode.heyder.modelos.cliente;

import com.letscode.heyder.exceptions.CNPJInvalidoException;
import com.letscode.heyder.exceptions.EmailInvalidoException;

public class ClientePessoaJuridica extends Cliente {

    
    private final CNPJ cnpj;
    private final String razaoSocial;
    private String nomeFantasia;
    private ClientePessoaFisica responsavel;

    
    public ClientePessoaJuridica(String email, Endereco endereco,String numeroCNPJ,String razaoSocial,String nomeFantasia,ClientePessoaFisica responsavel) throws EmailInvalidoException, CNPJInvalidoException {
        super(email, endereco);
        this.cnpj = new CNPJ(numeroCNPJ);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.responsavel = responsavel;
        
    }
    @Override
    public Boolean isDiscountApplicable(Integer dias) {
        if (dias >= 3) {
            System.out.println("Desconto para pessoa jurídica aplicado");
            return true;
        }
        return false;
    }

    public CNPJ getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public ClientePessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ClientePessoaFisica responsavel) {
        this.responsavel = responsavel;
    }
    
}
