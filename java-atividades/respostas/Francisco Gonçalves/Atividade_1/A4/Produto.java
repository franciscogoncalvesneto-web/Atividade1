package A4;
public class Produto {
    String nome;
    double preco;
    int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    // Desafio: método para aplicar desconto percentual
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            this.preco -= this.preco * (percentual / 100.0);
            System.out.printf("Desconto de %.1f%% aplicado ao produto %s. Novo preço: R$ %.2f\n", percentual, nome, preco);
        }
    }

    public void exibirProduto() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Qtd: %d | Total Estoque: R$ %.2f\n",
                nome, preco, quantidade, calcularValorEstoque());
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse Sem Fio", 80.00, 50);
        Produto p3 = new Produto("Teclado Mecânico", 250.00, 20);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        System.out.println("\n--- Aplicando Desconto ---");
        p1.aplicarDesconto(10);
        p1.exibirProduto();
    }
}
