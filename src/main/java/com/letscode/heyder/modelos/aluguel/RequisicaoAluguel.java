package com.letscode.heyder.modelos.aluguel;

import com.letscode.heyder.modelos.veiculos.Veiculo;

import java.time.LocalDate;

import com.letscode.heyder.modelos.cliente.Cliente;

public class RequisicaoAluguel {

    private Veiculo veiculo;
    private Cliente  cliente;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public RequisicaoAluguel(Veiculo veiculo, Cliente cliente, LocalDate dataInicio, LocalDate dataFim) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    
    
}
