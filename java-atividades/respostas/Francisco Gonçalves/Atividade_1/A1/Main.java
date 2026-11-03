public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Ana Silva";
        conta1.numeroConta = "12345-6";
        conta1.saldo = 500.00;

        conta1.exibirSaldo();
        conta1.depositar(250.00);
        conta1.sacar(100.00);
        conta1.exibirSaldo();
    }
}


