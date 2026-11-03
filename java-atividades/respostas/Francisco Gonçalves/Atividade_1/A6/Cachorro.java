package A6;
public class Cachorro {
    String nome;
    String raca;
    int idade;

    public void latir() {
        System.out.println(nome + " diz: Au au!");
    }

    public void brincar() {
        System.out.println(nome + " está correndo atrás da bolinha.");
    }

    public void exibirDados() {
        System.out.println("Cachorro: " + nome + " | Raça: " + raca + " | Idade: " + idade + " ano(s)");
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Rex";
        c1.raca = "Pastor Alemão";
        c1.idade = 4;

        Cachorro c2 = new Cachorro();
        c2.nome = "Mel";
        c2.raca = "Poodle";
        c2.idade = 2;

        Cachorro c3 = new Cachorro();
        c3.nome = "Bob";
        c3.raca = "Vira-lata";
        c3.idade = 5;

        c1.exibirDados();
        c1.latir();
        c1.brincar();

        System.out.println("---");
        c2.exibirDados();
        c2.latir();

        System.out.println("---");
        c3.exibirDados();
        c3.brincar();
    }
}
