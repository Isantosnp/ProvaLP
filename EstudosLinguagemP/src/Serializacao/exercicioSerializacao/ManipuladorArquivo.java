package exercicioSerializacao;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManipuladorArquivo {
    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter((path)));
        String linha = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo :");
        linha = in.nextLine();
         // Write = escrever   append = para escrever no arquivo.
        buffWrite.close();
    }

    public static void concatenar(String path, String path2, String path3)  throws IOException {
        BufferedReader NomeBuff = new BufferedReader(new FileReader(path)); // Instancia do arquivo de tipo de leitura
        // Cria memória de leitura temporária
        BufferedReader SobrenomeBuff = new BufferedReader(new FileReader(path2));
        BufferedReader buffRead3 = new BufferedReader(new FileReader(path3));

        String linhaNome, linhaSobrenome;

        while((linhaNome = NomeBuff.readLine()) != null && (linhaSobrenome = SobrenomeBuff.readLine()) != null){

        }
        NomeBuff.close();
        SobrenomeBuff.close();
        buffRead3.close();




    }

    }


