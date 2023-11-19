package main.java.model;

public class Conta { // Classe Pai paca Conta Corrente e Conta Poupança

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int sequencialConta = 1;

    public Conta(Cliente cliente) {
        this.agencia = "0001";
        this.numero = sequencialConta++;
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor){
        this.saldo -= valor;
        System.out.println("\nSacando: R$" + String.format("%.2f", valor) + " de " + this.getCliente().getNome());
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("\nDepositando: R$" + String.format("%.2f", valor) + " de " + this.getCliente().getNome());
    }

    public void transferir(double valor, Conta contaDestino){
        System.out.println("\nTransferindo: R$" + String.format("%.2f", valor) + " de " + this.getCliente().getNome() + " para " + contaDestino.getCliente().getNome());
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }

    protected void imprimirAtributos(){
        System.out.printf("Títular: %s%n", this.getCliente().getNome());
        System.out.printf("Agência: %s%n", this.getAgencia());
        System.out.printf("Número: %d%n", this.getNumero());
        System.out.printf("Saldo: %.2f%n", this.getSaldo());
    }

    public void imprimirExtrato(){}
}
