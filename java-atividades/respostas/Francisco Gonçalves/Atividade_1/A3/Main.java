package A3;

public class Main {
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