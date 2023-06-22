package Serializacao;

/**
 * Síntese
 *   Objetivo: Escrever um conteúdo informado no arquivo Teste.txt
 *   Entrada: Conteúdo a ser gravado no arquivo
 *    Saída: Resultado de sucesso ou não
 */

import java.io.FileOutputStream;     // importação da classe FileOutputStream
import java.io.FileNotFoundException;     // importação FileNotFoundException
import java.io.IOException;     // importação da classe IOException
import java.util.Scanner;     // importação da classe Scanner

public class ExemploOutputStream {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        try {

            FileOutputStream escrita = new FileOutputStream("Teste.txt");

            System.out.println("Informe o conteudo a ser gravado: ");

            String str = leitura.nextLine();

            byte[] conteudo = str.getBytes();

            escrita.write(conteudo);

            System.out.println("Operação Realizada com Sucesso");

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {

            System.out.println("Erro ao manipular arquivo");

        }

    }

}

