package TratamentodeExcecoes;

import java.util.Scanner;

public class ExemploThrow {

    public static final String  SENHASECRETA = "123456";
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Digite a senha: ");
            String senha = teclado.nextLine();
            if (!senha.equals(SENHASECRETA)){
                throw new Exception( "Senha inválida");
            }
            System.out.println("Senha correta\n BEM VINDO!!!!!");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
