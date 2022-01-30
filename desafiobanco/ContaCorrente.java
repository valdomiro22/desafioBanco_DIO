package digitalInovatioOne.desafiobanco;

public class ContaCorrente extends Conta {

    @Override
    public void inprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInfosComuns();
    }
}
