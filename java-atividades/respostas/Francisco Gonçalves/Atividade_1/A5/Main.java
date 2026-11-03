package A5;

public class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.marca = "Samsung";
        c1.modelo = "Galaxy S23";
        c1.bateria = 45;

        Celular c2 = new Celular();
        c2.marca = "Apple";
        c2.modelo = "iPhone 15";
        c2.bateria = 15;

        c1.exibirInformacoes();
        c1.ligar();

        System.out.println("---");
        c2.exibirInformacoes();
        c2.carregarBateria();
        c2.exibirInformacoes();
    }
}
