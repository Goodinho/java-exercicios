package controle;

public class ParOuImpar {
    public static void main(String[] args) {

        int valor = 9;

        if(valor % 2 == 0 && valor <= 10 && valor >= 0){
            System.out.println("O valor é Par");
        } else if (valor % 2 == 1 && valor <= 10 && valor >= 0){
            System.out.println("É ímpar");
        } else
            System.out.println("Valor ínvalido: [1 ate 10]");

    }
}
