package A7;
public class AlunoNotas {
    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public void exibirResultado() {
        double media = calcularMedia();
        String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.printf("Aluno: %s | Média: %.2f | Situação: %s\n", nome, media, situacao);
    }

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
