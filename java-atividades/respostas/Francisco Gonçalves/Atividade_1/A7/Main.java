package A7;

public class Main {
    public static void main(String[] args) {
        AlunoNotas a1 = new AlunoNotas();
        a1.nome = "Fernanda Ramos";
        a1.nota1 = 8.5;
        a1.nota2 = 7.0;

        AlunoNotas a2 = new AlunoNotas();
        a2.nome = "Gabriel Santos";
        a2.nota1 = 5.5;
        a2.nota2 = 6.0;

        a1.exibirResultado();
        a2.exibirResultado();
    }
}
