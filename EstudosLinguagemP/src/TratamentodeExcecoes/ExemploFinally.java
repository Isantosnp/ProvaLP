package TratamentodeExcecoes;

import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        try{
            int dividendo, divisor;
            System.out.println("Dividendo: ");
            dividendo = teclado.nextInt();
            System.out.println("Divisor: ");
            divisor = teclado.nextInt();

            if(divisor == 0){
                throw new Exception("Não é permitido fazer uma divisão com 0");
            }
            System.out.println(dividendo+ "/" +divisor+" - " +(dividendo/divisor));
        }
        catch (Exception ex){
            System.out.println("ERROR : "+ex.getMessage());
        } finally {
            System.out.println("Bloco Finaly");
        }
    }
}
