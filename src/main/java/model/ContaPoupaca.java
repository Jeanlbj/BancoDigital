package main.java.model;

public class ContaPoupaca extends Conta {

    public ContaPoupaca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        this.imprimirAtributos();
    }
}
