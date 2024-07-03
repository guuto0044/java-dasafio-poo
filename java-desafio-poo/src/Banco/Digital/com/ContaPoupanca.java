package Banco.Digital.com;
public class ContaPoupanca extends Conta {

    public void imprimirExtrato(){
        System.out.println("====Extrato Conta Poupança====");
        System.out.println(String.format("Agência: %d",super.agencia));
        System.out.println(String.format("Número: %d",super.numero));
        System.out.println(String.format("Saldo: %.2f",super.saldo));
    }
}