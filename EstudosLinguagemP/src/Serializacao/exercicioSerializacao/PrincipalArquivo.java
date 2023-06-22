package exercicioSerializacao;

import  java.io.IOException;
public class PrincipalArquivo {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/isabella.veras/OneDrive - Group Software Ltda/Documentos/LP/ArquivosNomes.txt";
        String path2 = "C:/Users/isabella.veras/OneDrive - Group Software Ltda/Documentos/LP/ArquivoSobrenomes.txt";


        ManipuladorArquivo.leitor(path);
        ManipuladorArquivo.leitor(path2);


    }
}

