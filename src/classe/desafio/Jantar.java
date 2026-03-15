package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Eduardo", 99.8);

        Comida c1 = new Comida("Arroz", 0.222);
        Comida c2 = new Comida("Feijão", 0.333);

        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());
    }
}
