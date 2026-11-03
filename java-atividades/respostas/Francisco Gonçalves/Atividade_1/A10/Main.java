package A10;

public class Main {
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