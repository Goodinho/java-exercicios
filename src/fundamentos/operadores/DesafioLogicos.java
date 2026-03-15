package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {

        boolean trab1 = true;
        boolean trab2 = true;

        System.out.println( "Televisão de 50p e sorvete: " + (trab1 && trab2));
        System.out.println( "Televisão de 32p e sorvete: " + (trab1 ^ trab2));
        System.out.println( "Ficar em casa, com saude: " + !(trab1 || trab2));


    }
}
