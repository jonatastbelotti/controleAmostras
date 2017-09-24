package Recursos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public class Arquivo {

  public static boolean salvarArquivo(String caminho, String nome, String conteudo) {
    File pasta;
    PrintWriter saida;

    pasta = new File(caminho);

    if (!pasta.exists()) {
      pasta.mkdirs();
    }

    try {
      saida = new PrintWriter(new File(pasta, nome));
      saida.print(conteudo);
      saida.close();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    }

    return true;
  }

  public static String lerArquivo(String pasta, String nome) {
    String resultado = null;
    DataInputStream in = null;

    try {
      File arquivo = new File(pasta + nome);

      if (!arquivo.isFile()) {
        arquivo.createNewFile();
      }

      byte[] buffer = new byte[(int) arquivo.length()];
      in = new DataInputStream(new FileInputStream(arquivo));
      in.readFully(buffer);
      resultado = new String(buffer);
    } catch (IOException ex) {
      resultado = "";
    } finally {
      try {
        in.close();
      } catch (IOException e) { //ignorar
      }
    }

    return resultado;
  }

  public static boolean arquivoExiste(String pasta, String nome) {
    if (!pasta.endsWith(File.separator)) {
      pasta += File.separator;
    }

    return new File(pasta + nome).exists();
  }

}
