package Model;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public class Configuracao {

  private String pastaUltimoArquivo;
  private String nomeUltimoArquivo;

  public Configuracao() {
  }

  public Configuracao(String pastaUltimoArquivo, String nomeUltimoArquivo) {
    this.pastaUltimoArquivo = pastaUltimoArquivo;
    this.nomeUltimoArquivo = nomeUltimoArquivo;
  }

  public String getPastaUltimoArquivo() {
    return pastaUltimoArquivo;
  }

  public void setPastaUltimoArquivo(String pastaUltimoArquivo) {
    this.pastaUltimoArquivo = pastaUltimoArquivo;
  }

  public String getNomeUltimoArquivo() {
    return nomeUltimoArquivo;
  }

  public void setNomeUltimoArquivo(String nomeUltimoArquivo) {
    this.nomeUltimoArquivo = nomeUltimoArquivo;
  }

}
