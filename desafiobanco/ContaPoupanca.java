package digitalInovatioOne.desafiobanco;

public class ContaPoupanca extends Conta {

    @Override
    public void inprimirExtrato() {
        System.out.println("=== Extrato conta poupança ===");
        super.imprimirInfosComuns();
    }
}
