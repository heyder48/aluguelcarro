package com.letscode.heyder;

import java.util.Scanner;

import com.letscode.heyder.modelos.cliente.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
    Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        
    }

    public Cliente cadastrarClientePessoaFisica(){
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do cliente:");
        String email = scanner.nextLine();
        
    }
}
