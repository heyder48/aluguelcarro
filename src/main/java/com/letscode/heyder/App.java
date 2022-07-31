package com.letscode.heyder;

import java.time.LocalDate;
import java.util.Scanner;
import com.letscode.heyder.modelos.aluguel.RequisicaoAluguel;
import com.letscode.heyder.modelos.cliente.Cliente;
import com.letscode.heyder.modelos.cliente.ClientePessoaFisica;
import com.letscode.heyder.modelos.cliente.ClientePessoaJuridica;
import com.letscode.heyder.modelos.cliente.Endereco;
import com.letscode.heyder.modelos.veiculos.CarroMedio;
import com.letscode.heyder.modelos.veiculos.CarroPequeno;
import com.letscode.heyder.modelos.veiculos.CarroSUV;
import com.letscode.heyder.modelos.veiculos.Cor;
import com.letscode.heyder.modelos.veiculos.Marca;
import com.letscode.heyder.modelos.veiculos.Veiculo;
import com.letscode.heyder.servicos.AluguelService;

public class App {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Criação de massa de clientes:
        Endereco endereco = new Endereco("logradouro", "numero", "complemento", "bairro", "cidade", "estado", "cep");
        Cliente clienteFisico = new ClientePessoaFisica("email@email.com", endereco, "Paulo", "00000000000",
                "17/11/1997",
                "00000000000", "2025-10-10");
        Cliente clienteJuridico = new ClientePessoaJuridica("email@email.com", endereco, "00000000000000",
                "razaoSocial", "Turtletainment", (ClientePessoaFisica) clienteFisico);

        //Criação de veículos:
        Veiculo veiculoPequeno = new CarroPequeno(Marca.CHEVROLET, "modelo", "2018", Cor.PRETA, "AAA0000");
        Veiculo veiculoMedio = new CarroMedio(Marca.TOYOTA, "modelo", "2015", Cor.CINZA, "AAA0001");
        Veiculo veiculoSUV = new CarroSUV(Marca.FORD, "modelo", "2008", Cor.AZUL, "AAA0002");

        //Criação de datas de inicio/fim do aluguel
        LocalDate dataInicio = LocalDate.of(2022, 1, 1);

        LocalDate dataFim_00 = LocalDate.of(2022, 1, 2);
        LocalDate dataFim_01 = LocalDate.of(2022, 1, 5);
        LocalDate dataFim_02 = LocalDate.of(2022, 1, 11);

        // Criação da requisições de aluguel
        RequisicaoAluguel reqAluguel_00 = new RequisicaoAluguel(veiculoPequeno, clienteJuridico, dataInicio,
                dataFim_00);
        RequisicaoAluguel reqAluguel_01 = new RequisicaoAluguel(veiculoMedio, clienteJuridico, dataInicio,
                dataFim_02);
        RequisicaoAluguel reqAluguel_02 = new RequisicaoAluguel(veiculoMedio, clienteFisico, dataInicio,
               dataFim_01);
        RequisicaoAluguel reqAluguel_03 = new RequisicaoAluguel(veiculoSUV, clienteFisico, dataInicio,
                dataFim_02);

        // Aplicação do aluguel
        AluguelService aluguelService = new AluguelService();
        aluguelService.alugar(reqAluguel_00);
        aluguelService.alugar(reqAluguel_01);
        aluguelService.alugar(reqAluguel_02);
        aluguelService.alugar(reqAluguel_03);
    }
}
/**
 * }
 * /* public Cliente cadastrarClientePessoaFisica(){
 * System.out.println("Digite o nome do cliente:");
 * String nome = scanner.nextLine();
 * System.out.println("Digite o email do cliente:");
 * String email = scanner.nextLine();
 * 
 * }
 */
