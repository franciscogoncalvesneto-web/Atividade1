package A4;

public class Main {
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