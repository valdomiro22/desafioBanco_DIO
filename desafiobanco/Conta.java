package digitalInovatioOne.desafiobanco;

public abstract class Conta extends Cliente implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected String cepAgencia;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public String getCepAgencia() {
        return cepAgencia;
    }

    public void setCepAgencia(int cepAgencia) {
        this.cepAgencia = String.valueOf(cepAgencia);
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

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println("CEP da agencia: " + this.cepAgencia);
        System.out.println("Nome do cliente: " + super.getNome());
        System.out.printf("Saldo: %2f%n", this.saldo);
    }
}
