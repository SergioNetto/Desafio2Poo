/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjbanco;

import java.util.Scanner;

/**
 *
 * @author s_n_a
 */
public class PrjBancoTest {
    
    public Cliente[] clientes;
    
    public PrjBancoTest(){    
        clientes = new Cliente[10];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrjBancoTest relCliente = new PrjBancoTest();
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira os dados do cliente n." +(i+1)+ ": ");
            System.out.print("Digite o CPF: ");
            String cpf = (sc.nextLine());
            if(cpf.equals("-1")) break;
            relCliente.clientes[i]= new Cliente();
            relCliente.clientes[i].setCPF(cpf);
            System.out.print("Digite o nome: ");
            relCliente.clientes[i].setNome(sc.nextLine());
            
            Conta contanova = new Conta();
            System.out.print("Digite o numero da conta: ");
            contanova.setNumeroConta(Integer.parseInt(sc.nextLine()));
            System.out.print("Digite o saldo medio: ");
            contanova.setSaldoMedio(Double.parseDouble(sc.nextLine()));
            relCliente.clientes[i].setConta(contanova);        
        }
        
        for (int i = 0; i < 10; i++) {
            if (relCliente.clientes[i]==null) break;
            relCliente.clientes[i].imprime(relCliente.clientes[i]);
            System.out.println("Limite: "+relCliente.clientes[i].limite(relCliente.clientes[i]));
            System.out.println("");
        }
        
        
    }
    
    
    
}
