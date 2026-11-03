package A10;
public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Desafio: tratamento da divisão por zero
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double x = 10.0;
        double y = 4.0;

        System.out.println("Soma: " + calc.somar(x, y));
        System.out.println("Subtração: " + calc.subtrair(x, y));
        System.out.println("Multiplicação: " + calc.multiplicar(x, y));
        System.out.println("Divisão: " + calc.dividir(x, y));

        System.out.println("Divisão por zero: " + calc.dividir(x, 0));
    }
}
