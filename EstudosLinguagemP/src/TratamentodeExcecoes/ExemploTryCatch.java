package TratamentodeExcecoes;

import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.println("Digite um valor inteiro: ");
            int numero = teclado.nextInt();
            System.out.println("Digite um valor inteiro: ");
            int numero2 = teclado.nextInt();

            System.out.println(numero+ "+" +numero2+ "= " +(numero+numero2));
        } catch (Exception ex){
            System.out.println("ERRO - Valor digitado não é um numero inteiro");
        }
    }
}
