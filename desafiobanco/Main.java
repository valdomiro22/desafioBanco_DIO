package digitalInovatioOne.desafiobanco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.cepAgencia = "158789-65";
        cc.setNome("Agnaldo");
        cc.inprimirExtrato();

        poupanca.setNome("Maria Elena");
        poupanca.cepAgencia = "69584-578";
        poupanca.inprimirExtrato();
    }
}
