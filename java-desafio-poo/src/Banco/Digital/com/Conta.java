package Banco.Digital.com;
public abstract class Conta implements Interface_Conta {
    
    private static final int AGENCIA = 1;
    private static int SEQUENCIA = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA;
        this.numero = SEQUENCIA ++;
    }



    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }



    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }



    @Override
    public void depositar(double valor) {
        saldo += valor;

    }



    public int getAgencia() {
        return agencia;
    }



    public int getNumero() {
        return numero;
    }



    public double getSaldo() {
        return saldo;
    }

    public void sacar(){

    }

    public void depositar(){

    }

    public void transferir(){

    }

}
