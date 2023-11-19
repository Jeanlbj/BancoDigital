package main.java;

import main.java.model.*;

public class Main {

    public static void main(String[] args) {

        // Instanciando Banco
        Banco banco = new Banco();
        banco.setNome("Banco Java");

        System.out.println("=== Bem vindo ao " + banco.getNome() + " ===");

        // Instaciando Clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jean Lucas");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Robson");

        // Instanciando Contas
        Conta conta1 = new ContaCorrente(cliente1);
        conta1.setSaldo(2000.00);
        conta1.imprimirExtrato();

        Conta conta2 = new ContaPoupaca(cliente2);
        conta2.setSaldo(1500.00);
        conta2.imprimirExtrato();

        // Cadastrando contas no sistema do Banco
        banco.setContas(conta1);
        banco.setContas(conta2);

        // Fazendo operações entre as contas
        System.out.println("\n***=== Fazendo operações ===***");
        conta1.sacar(300.00);
        conta2.sacar(50.00);
        conta1.transferir(200.00, conta2);

        // Extrado das contas após operações
        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        // Listando Clientes do banco
        banco.listarClientes();

    }

}