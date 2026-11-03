package A12;
public class ProdutoEstoque {
    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
            System.out.println(qtd + " unidade(s) adicionada(s) ao estoque de " + nome);
        }
    }

    public void retirarEstoque(int qtd) {
        if (qtd > 0 && (quantidade - qtd) >= 0) {
            quantidade -= qtd;
            System.out.println(qtd + " unidade(s) retirada(s) do estoque de " + nome);
        } else {
            System.out.println("Operação negada! Quantidade insuficiente em estoque para " + nome);
        }
    }

    public void mostrarEstoque() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantidade);
    }

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
        p2.retirarEstoque(60); // Teste da regra de impedimento
        p2.adicionarEstoque(15);
        p2.mostrarEstoque();
    }
}