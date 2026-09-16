package exercicioGson;

import java.io.FileWriter;
import java.io.IOException;

public class MainArquivoTxt {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("arquivo.txt");
        writer.write("Conteúdo a ser gravado no arquivo.");
        writer.close();

    }
}
