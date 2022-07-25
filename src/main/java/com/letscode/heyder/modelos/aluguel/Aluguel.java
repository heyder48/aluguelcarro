package com.letscode.heyder.modelos.aluguel;

import com.letscode.heyder.modelos.veiculos.Veiculos;

import java.time.LocalDate;

import com.letscode.heyder.modelos.cliente.Cliente;

public class Aluguel {

    private Veiculos veiculo;
    private Cliente cliente;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Aluguel(Veiculos veiculo, Cliente cliente, LocalDate dataInicio, LocalDate dataFim) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
}
