package Recursos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.File;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public class Configuracao {

  private static final String nomeArquivoConfiguracao = "configuracaoAmostras.txt";

  private static String pastaUltimoArquivo;
  private static String nomeUltimoArquivo;

  public static String getPastaUltimoArquivo() {
    return pastaUltimoArquivo;
  }

  public static String getNomeUltimoArquivo() {
    return nomeUltimoArquivo;
  }

  public static void carregarConfiguracao() {
    String pastaPrograma;
    String json;
    Gson gson;

    pastaUltimoArquivo = null;
    nomeUltimoArquivo = null;
    gson = new Gson();

    try {
      pastaPrograma = System.getProperty("user.dir");

      if (!pastaPrograma.endsWith(File.separator)) {
        pastaPrograma += File.separator;
      }

      json = Arquivo.lerArquivo(pastaPrograma, nomeArquivoConfiguracao);
      Model.Configuracao config = gson.fromJson(json, Model.Configuracao.class);

      if (Arquivo.arquivoExiste(config.getPastaUltimoArquivo(), config.getNomeUltimoArquivo())) {
        pastaUltimoArquivo = config.getPastaUltimoArquivo();
        nomeUltimoArquivo = config.getNomeUltimoArquivo();
      }
    } catch (JsonSyntaxException e) {
      pastaUltimoArquivo = null;
      nomeUltimoArquivo = null;
    } catch (Exception e) {
      pastaUltimoArquivo = null;
      nomeUltimoArquivo = null;
    }
  }

  public static void salvarConfiguracao(String pastaArquivo, String nomeArquivo) {
    String pastaPrograma;
    Model.Configuracao config;
    String json;
    Gson gson;

    gson = new GsonBuilder().setPrettyPrinting().create();
    config = new Model.Configuracao(pastaArquivo, nomeArquivo);

    try {
      pastaPrograma = System.getProperty("user.dir");

      if (!pastaPrograma.endsWith(File.separator)) {
        pastaPrograma += File.separator;
      }

      json = gson.toJson(config, Model.Configuracao.class);
      Arquivo.salvarArquivo(pastaPrograma, nomeArquivoConfiguracao, json);
      pastaUltimoArquivo = pastaArquivo;
      nomeUltimoArquivo = nomeArquivo;
    } catch (JsonSyntaxException e) {
    }
  }

}
