package A2;
public class Aluno {
    String nome;
    int idade;
    String curso;
    String matricula; // Desafio incluído

    public void exibirDados() {
        System.out.printf("Matrícula: %s | Nome: %s | Idade: %d | Curso: %s\n", matricula, nome, idade, curso);
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Carlos Eduardo";
        a1.idade = 20;
        a1.curso = "Análise e Desenvolvimento de Sistemas";
        a1.matricula = "2026001";

        Aluno a2 = new Aluno();
        a2.nome = "Beatriz Lima";
        a2.idade = 22;
        a2.curso = "Engenharia de Software";
        a2.matricula = "2026002";

        Aluno a3 = new Aluno();
        a3.nome = "Daniel Souza";
        a3.idade = 19;
        a3.curso = "Sistemas de Informação";
        a3.matricula = "2026003";

        a1.exibirDados();
        a2.exibirDados();
        a3.exibirDados();
    }
}