package A9;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Dom Casmurro";
        l1.autor = "Machado de Assis";
        l1.numeroPaginas = 256;

        Livro l2 = new Livro();
        l2.titulo = "O Hobbit";
        l2.autor = "J.R.R. Tolkien";
        l2.numeroPaginas = 336;

        Livro l3 = new Livro();
        l3.titulo = "1984";
        l3.autor = "George Orwell";
        l3.numeroPaginas = 328;

        l1.mostrarDetalhes();
        l2.mostrarDetalhes();
        l3.mostrarDetalhes();

        System.out.println("---");
        l1.abrirLivro();
        l1.mostrarDetalhes();
        l1.fecharLivro();
    }
}
