package Banco.Digital.com;
public interface Interface_Conta {
    void sacar( double valor);
    void transferir(Conta contaDestino,double valor);
    void depositar(double valor);

    void imprimirExtrato();
}
