package Serializacao;

/**
 * Síntese
 *   Objetivo: Ler o arquivo Alunos.txt e imprimir na console
 *   Entrada: sem entrada
 *   Saída: Listar os nomes que estao no arquivo Alunos.txt na console
 */

import java.io.File;     // importação da classe File
import java.io.IOException;     // importação da classe IOException
import java.io.RandomAccessFile; // importação da classe RandomAccessFile;

class RandomAccessFileDemo {

    public static void main(String[]args) throws IOException {

        File fileName = new File("C:\\Alunos.txt");

        RandomAccessFile obj = new RandomAccessFile(fileName , "rw");

        String result = null;

        int i=0;


        while(i<obj.length()){

            result=obj.readLine();

            if(result==null){

                break;

            }

            System.out.println(result);

            i++;

        }

    }

}
