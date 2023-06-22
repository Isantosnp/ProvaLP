package aula;

public class Dividess {

        public static void main(String[] args) {
            int dividendo = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            try {
                dividess(dividendo, divisor);
            } catch (ArithmeticException ex1) {
                System.out.println("Não pode dividir por zero.");
            } catch (ArrayIndexOutOfBoundsException ex2) {
                System.out.println("Não pode dividir por zero.");
            }
        }

        public static void dividess (int dividendo, int divisor ){
            System.out.println("Divisão = "+(dividendo/dividendo));
        }
    }

