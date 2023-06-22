package Serializacao;

/**
 * Síntese
 *   Objetivo: Ler o conteúdo em bytes do arquivo Teste.txt pela
 *   		  classe FileInputStream
 *   Entrada: Nenhuma
 *   Saída: Conteúdo do arquivo Teste.txt
 */

import java.io.FileInputStream;    // importação da classe FileInputStream
import java.io.FileNotFoundException; // importação FileNotFoundException
import java.io.IOException; // importação da classe IOException

public class ExemploInputStream {

    public static void main(String[] args) {

        try {

            FileInputStream leitura = new FileInputStream("Teste.txt"); //Colocar o caminho do arquivo aqui

            byte [] conteudoByte = new byte[leitura.available()];

            leitura.read(conteudoByte);

            String conteudoStr = new String(conteudoByte);

            leitura.close();

            System.out.println(conteudoStr);

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {

            System.out.println("Erro ao manipular arquivo!");

        }

    }

}
