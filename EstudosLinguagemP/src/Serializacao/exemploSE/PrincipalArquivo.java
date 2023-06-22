package exemploSE;

import exercicioSerializacao.ManipuladorArquivo;

import  java.io.IOException;
public class PrincipalArquivo {
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/isabella.veras/OneDrive - Group Software Ltda/Documentos/LP/ArquivosNomes.txt";
        String path2 = "C:/Users/isabella.veras/OneDrive - Group Software Ltda/Documentos/LP/ArquivoSobrenomes.txt";
        String path3 = "C:/Users/isabella.veras/OneDrive - Group Software Ltda/Documentos/LP/Juntar.txt";

        ManipuladorArquivo.concatenar(path, path2, path3);
    }
}
