package com.letscode.heyder.servicos.interfaces;

import java.math.BigDecimal;

import com.letscode.heyder.modelos.aluguel.RequisicaoAluguel;
import com.letscode.heyder.modelos.cliente.Cliente;
import com.letscode.heyder.modelos.veiculos.Veiculo;

public interface IAluguel {
    
    public BigDecimal getValor();
    public void alugar(RequisicaoAluguel aluguel);
}
