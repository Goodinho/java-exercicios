package fundamentos.operadores;

public class Bhaskara {

    public static void main(String[] args) {

        double a = 1;
        double b = 12;
        double c = -13;

        double delta = b * b - 4 * a * c;

        System.out.println("Delta = " + delta);

        double raizDelta = Math.pow(delta, 0.5);

        double x1 = (-b + raizDelta) / (2 * a);
        double x2 = (-b - raizDelta) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}