package com.letscode.heyder.servicos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import com.letscode.heyder.modelos.aluguel.RequisicaoAluguel;
import com.letscode.heyder.modelos.cliente.ClientePessoaFisica;
import com.letscode.heyder.modelos.cliente.ClientePessoaJuridica;
import com.letscode.heyder.servicos.interfaces.IAluguel;

public class AluguelService implements IAluguel {

    @Override
    public BigDecimal getValor() {
        return null;
    }

    @Override
    public void alugar(RequisicaoAluguel reqAluguel) {
        
        String nomeContratante = reqAluguel.getCliente() instanceof ClientePessoaFisica ?
        ((ClientePessoaFisica) reqAluguel.getCliente()).getNome() : ((ClientePessoaJuridica) reqAluguel.getCliente()).getNomeFantasia();
        Integer dias = (reqAluguel.getDataInicio().until(reqAluguel.getDataFim())).getDays();
        BigDecimal diaria = new BigDecimal(0);
        diaria = diaria.add(reqAluguel.getVeiculo().precoBase());
        BigDecimal precoTotalAluguel = new BigDecimal(diaria.multiply(new BigDecimal(dias)).doubleValue());
        
        System.out.printf("Novo contrato de aluguel\nNome contratante: %s\nDias requisitados: %d\nPreço base da diária: R$%.2f\n" , nomeContratante, dias, diaria.doubleValue());

        if (reqAluguel.getCliente().isDiscountApplicable(dias)) {
            if (reqAluguel.getCliente() instanceof ClientePessoaFisica) {
                // Aplicar desconto de 5%
                precoTotalAluguel = precoTotalAluguel.multiply(new BigDecimal(0.95));
                
            } else if (reqAluguel.getCliente() instanceof ClientePessoaJuridica) {
                //Aplicar desconto de 10%
                precoTotalAluguel = precoTotalAluguel.multiply(new BigDecimal(0.90));
            }
        } 
        System.out.printf("Preço total do aluguel: R$%.2f", precoTotalAluguel.doubleValue());
        System.out.println("\n-----------------------------------------------------");

    }

}
