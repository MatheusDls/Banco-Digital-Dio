
public class Main {

    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");
        Conta cc = new ContaCorrente(matheus);

        cc.depositar(10000);
        Conta cp = new ContaPoupanca(matheus);

        cc.transferir(0, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }

}