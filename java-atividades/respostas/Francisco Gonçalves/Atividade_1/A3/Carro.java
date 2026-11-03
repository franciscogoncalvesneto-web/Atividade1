package A3;
public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    // Desafio: impedindo ligar duas vezes consecutivas
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(marca + " " + modelo + " foi ligado.");
        } else {
            System.out.println("Atenção: " + marca + " " + modelo + " já está ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(marca + " " + modelo + " foi desligado.");
        } else {
            System.out.println("Atenção: " + marca + " " + modelo + " já está desligado!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ") - Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2023;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar(); // Teste do desafio
        carro1.desligar();

        System.out.println("---");
        carro2.exibirInformacoes();
        carro2.ligar();
        carro2.exibirInformacoes();
    }
}
