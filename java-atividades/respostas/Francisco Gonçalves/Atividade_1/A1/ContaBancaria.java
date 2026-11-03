public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado. Novo saldo: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado. Novo saldo: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Conta: %s | Saldo: R$ %.2f\n", titular, numeroConta, saldo);
    }

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