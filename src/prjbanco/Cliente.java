/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjbanco;

/**
 *
 * @author s_n_a
 */
public class Cliente {
    private String CPF;
    private String nome;
    private Conta conta; 

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta=conta;
    }
    
    public void imprime(Cliente cliente){
        System.out.println("Nome: "+cliente.getNome() );
        System.out.println("CPF: "+cliente.getCPF() );
        System.out.println("Numero conta: "+cliente.getConta().getNumeroConta() );
        System.out.println("Saldo Medio: "+cliente.getConta().getSaldoMedio() );                
    }

    double limite(Cliente cliente) {
        double lim=0;
        if ((cliente.getConta().getSaldoMedio()>200)&&(cliente.getConta().getSaldoMedio()<401)) lim=cliente.getConta().getSaldoMedio()*0.2;
        if ((cliente.getConta().getSaldoMedio()>400)&&(cliente.getConta().getSaldoMedio()<601)) lim=cliente.getConta().getSaldoMedio()*0.3;
        if ((cliente.getConta().getSaldoMedio()>600)) lim=cliente.getConta().getSaldoMedio()*0.4;
        return lim;
    }
    
}
