import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LancaExcecoes {
    public static void main(String[] args) throws Exception {
        LancaExcecoes le = new LancaExcecoes();
        le.lerArquivo();
    }

    public void lerArquivo() throws FileNotFoundException, IOException
    {
        String arquivoEntrada = "./arquivoEntrada.txt";
        BufferedReader arquivo = new BufferedReader(new FileReader(arquivoEntrada));
        String linha;
        while ((linha = arquivo.readLine()) != null) {
            System.out.println(linha + "\n");
        }
        arquivo.close();
    }
}