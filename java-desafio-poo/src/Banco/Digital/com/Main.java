package Banco.Digital.com;
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaPoupanca();
        Conta cp = new ContaPoupanca();

        cc.depositar(1000);

        cc.imprimirExtrato();

        cc.transferir(cp, 500);
        cp.imprimirExtrato();
    }
}
