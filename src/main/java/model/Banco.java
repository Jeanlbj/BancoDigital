package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private  List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta conta) {
        this.contas.add(conta);
    }

    public void listarClientes() {
        System.out.println("\n=== Lista de Clientes ===");
        for (Conta conta : contas) {
            System.out.printf("\nCliente: %s%n", conta.getCliente().getNome());
            System.out.println("Saldo: " + String.format("%.2f", conta.getSaldo()));
        }
    }
}
