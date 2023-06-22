package aula;

public class Divides {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);

        try {
            divides(dividendo, divisor);
        }
        catch (ArrayIndexOutOfBoundsException ex1 ) {
            System.out.println("Não pode dividir por zero.");
        }
    }

    public static void divides(int dividendo, int divisor ){
        System.out.println("Divisão = "+(dividendo/dividendo));
    }
}
