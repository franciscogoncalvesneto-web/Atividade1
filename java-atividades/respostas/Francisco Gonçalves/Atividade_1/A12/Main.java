package A12;

public class Main {
    public static void main(String[] args) {
        ProdutoEstoque p1 = new ProdutoEstoque();
        p1.nome = "Caderno";
        p1.preco = 18.50;
        p1.quantidade = 20;

        ProdutoEstoque p2 = new ProdutoEstoque();
        p2.nome = "Caneta";
        p2.preco = 2.50;
        p2.quantidade = 50;

        p1.mostrarEstoque();
        p1.retirarEstoque(5);
        p1.mostrarEstoque();

        System.out.println("---");
        p2.mostrarEstoque();
        p2.retirarEstoque(60);
        p2.adicionarEstoque(15);
        p2.mostrarEstoque();
    }
}