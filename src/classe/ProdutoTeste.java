package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.nome = "Gol";
        p1.preco = 4221;
        p1.desconto = 0.15;

        Produto p2 = new Produto();
        p2.nome = "Fiesta";
        p2.preco = 5003;
        p2.desconto = 0.35;

        double desconto1 = p1.precoComDesconto();
        double desconto2 = p2.precoComDesconto(0.1);

        double media = (desconto1 + desconto2)/2;

        System.out.printf("\nPreço do Gol com desconto: %.2f.", desconto2);
        System.out.printf("\nPreço do Fiesta com desconto: %.2f. ", desconto2);

        System.out.printf("\nMédia dos preços dos dois: %.2f.", media);
    }
}
