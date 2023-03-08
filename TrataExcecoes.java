import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TrataExcecoes {
    public static void main(String[] args) {
        TrataExcecoes te = new TrataExcecoes();
        te.lerArquivo();
    }

    public void lerArquivo()
    {
        try {
            String arquivoEntrada = "./arquivoEntrada.txt";
            BufferedReader arquivo = new BufferedReader(new FileReader(arquivoEntrada));
            String linha;
            while ((linha = arquivo.readLine()) != null) {
                System.out.println(linha + "\n");
            }
            arquivo.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e2) {
            System.out.println("Erro de leitura do arquivo");
        } catch (Exception e3) {
            System.out.println("Método inesperado");
            System.out.println("Descrição do erro:" + e3.getMessage());
        } finally {
            System.out.println("Encerrando");
        }
    }
}
