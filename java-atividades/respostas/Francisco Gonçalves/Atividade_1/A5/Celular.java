package A5;
public class Celular {
    String marca;
    String modelo;
    int bateria; // em porcentagem (0 a 100)

    public void ligar() {
        if (bateria > 0) {
            System.out.println(marca + " " + modelo + " está ligando...");
        } else {
            System.out.println("Sem bateria para ligar o aparelho.");
        }
    }

    public void carregarBateria() {
        this.bateria = 100;
        System.out.println("Bateria do " + marca + " " + modelo + " totalmente carregada (100%).");
    }

    public void exibirInformacoes() {
        System.out.println("Celular: " + marca + " " + modelo + " | Bateria: " + bateria + "%");
    }

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
