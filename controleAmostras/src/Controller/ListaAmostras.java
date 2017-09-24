package Controller;

import Model.Amostra;
import Recursos.Arquivo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public class ListaAmostras {

  private List<Amostra> amostras;

  public ListaAmostras() {
    amostras = new ArrayList<>();
  }

  public ListaAmostras(List<Amostra> amostras) {
    this.amostras = amostras;
  }

  public List<Amostra> getAmostras() {
    return amostras;
  }

  public void setAmostras(List<Amostra> amostras) {
    this.amostras = amostras;
  }

  public int getIndiceAmostra(String nome) {
    for (int i = 0; i < amostras.size(); i++) {
      if (amostras.get(i).getNome().equals(nome)) {
        return i;
      }
    }

    return -1;
  }

  public void salvarAmostra(Amostra amostra, int indice) {
    if (indice < 0) {
      amostras.add(amostra);
    } else {
      amostras.set(indice, amostra);
    }
  }

  public void excluirAmostra(int indice) {
    amostras.remove(indice);
  }

  public boolean salvarArquivo(String pastaArquivo, String nomeArquivo) {
    boolean resposta;
    String json;
    Gson gson;

    resposta = true;
    gson = new GsonBuilder().setPrettyPrinting().create();

    if (!nomeArquivo.endsWith(".txt")) {
      nomeArquivo += ".txt";
    }

    try {
      json = gson.toJson(this, ListaAmostras.class);

      if (!Arquivo.salvarArquivo(pastaArquivo, nomeArquivo, json)) {
        resposta = false;
      }
    } catch (Exception e) {
      resposta = false;
    }

    return resposta;
  }

  public boolean carregarArquivo(String pasta, String nome) {
    boolean resposta;
    String json;
    Gson gson;

    resposta = true;
    gson = new Gson();

    try {
      json = Arquivo.lerArquivo(pasta, nome);
      this.amostras = gson.fromJson(json, ListaAmostras.class).getAmostras();
    } catch (JsonSyntaxException e) {
      return false;
    } catch (Exception e) {
      return false;
    }

    return resposta;
  }

  public void novaLista() {
    this.amostras = new ArrayList<>();
  }

}
