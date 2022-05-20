package TratamentoDeExcecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionCustom1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nApesar da exception ou não, o programa continua... ");

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorre um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {
    private String nomeDoAquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoAquivo, String diretorio) {
        super("O arquivo " + nomeDoAquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoAquivo = nomeDoAquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "{" +
                " nomeDoAquivo='" + getNomeDoAquivo() + "'" +
                ", diretorio='" + getDiretorio() + "'" +
                "}";
    }

    public String getNomeDoAquivo() {
        return this.nomeDoAquivo;
    }

    public void setNomeDoAquivo(String nomeDoAquivo) {
        this.nomeDoAquivo = nomeDoAquivo;
    }

    public String getDiretorio() {
        return this.diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

}