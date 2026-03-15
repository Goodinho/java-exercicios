package fundamentos.operadores;



public class DesafioAritmeticos {
    public static void main(String[] args) {
/*
        int a = 4 * 3 - 10;
        int b = (int) Math.pow(a, 3); // Math.pow serve para potência.
        System.out.println(b);
        */
        int equa1 = (3+2) * 6;
        equa1 = (int)Math.pow(equa1,2)/(3*2);

        int equa2 = (int) Math.pow((1-5) * (2-7) / 2,2);

        int equa3 = equa1 - equa2;

        int fim = (int) (Math.pow(equa3,3)/Math.pow(10,3));


        System.out.println(equa1);
        System.out.println(equa2);
        System.out.println(equa3);
        System.out.println(fim);
    }
}
