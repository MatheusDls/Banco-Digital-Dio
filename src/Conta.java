
public abstract class Conta implements AcoesBanco {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.setCliente(cliente);
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor) {
            System.out.println("Saldo atual: "+saldo);
            saldo -= valor;
            System.out.println("Saldo pós saque: "+saldo);
        } else {
            System.out.println("Saque nao efetuado, valor maior do que o limite disponivel.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
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
    protected void imprimirInfosComuns() {
        System.out.println("Nome: Matheus de lima santos");
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Numero: %s", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}