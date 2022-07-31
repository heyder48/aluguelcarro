package com.letscode.heyder.modelos.cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.letscode.heyder.exceptions.CNHInvalidaException;
import com.letscode.heyder.exceptions.CPFInvalidoException;
import com.letscode.heyder.exceptions.DataInvalidaException;
import com.letscode.heyder.exceptions.EmailInvalidoException;
import com.letscode.heyder.exceptions.NomeInvalidoException;

public class ClientePessoaFisica extends Cliente{

    
    private final String nome;
    private final CPF cpf;
    private final CNH cnh;
    private final LocalDate dataNascimento;

    

    public ClientePessoaFisica(String email, Endereco endereco,String nome,String numeroCPF, String dataNascimento,String numeroCnh,String dataVencimentoCnh) throws EmailInvalidoException, CPFInvalidoException, NomeInvalidoException, DataInvalidaException, CNHInvalidaException {

        super(email, endereco);

        if(nome.isEmpty()){
            throw new NomeInvalidoException("Nome não pode ser vazio");
        }

        if(LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")).isAfter(LocalDate.now())){
            throw new DataInvalidaException("Data de nascimento não pode ser maior que a data atual");
        }
        
        this.nome = nome;
        this.cpf = new CPF(numeroCPF);
        this.dataNascimento = LocalDate.parse(dataNascimento,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.cnh = new CNH(numeroCnh, LocalDate.parse(dataVencimentoCnh));
        
    }

    @Override
    public Boolean isDiscountApplicable(Integer dias) {
        if(dias >= 5) {
            System.out.println("Desconto para pessoa física aplicado");
            return true;
        }
        return false;
    }

    public CPF getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public Long getIdade(){

        return ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
    }

    public CNH getCnh() {
        return cnh;
    }





    
}
