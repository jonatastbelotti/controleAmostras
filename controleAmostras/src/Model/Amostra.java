package Model;

import Recursos.Numero;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public class Amostra {

  private String nome;
  private String eletrolito;
  private double concentracaoEletrolito;
  private String aditivo;
  private double concentracaoAditivo;
  private String estequiometriaReacao;
  private String temperaturaQueima1;
  private String temperaturaQueima2;
  private double massaEletrolito;
  private double massaAditivo;
  private double massaPigmentoTeorica;
  private double massaPigmentoExperimental;

  public Amostra() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEletrolito() {
    return eletrolito;
  }

  public void setEletrolito(String eletrolito) {
    this.eletrolito = eletrolito;
  }

  public double getConcentracaoEletrolito() {
    return concentracaoEletrolito;
  }

  public String getConcentracaoEletrolitoString() {
    return Numero.getString(concentracaoEletrolito);
  }

  public void setConcentracaoEletrolito(double val) {
    this.concentracaoEletrolito = val;
  }

  public void setConcentracaoEletrolito(String val) {
    this.concentracaoEletrolito = Numero.getDouble(val);
  }

  public String getAditivo() {
    return aditivo;
  }

  public void setAditivo(String aditivo) {
    this.aditivo = aditivo;
  }

  public double getConcentracaoAditivo() {
    return concentracaoAditivo;
  }

  public String getConcentracaoAditivoString() {
    return Numero.getString(concentracaoAditivo);
  }

  public void setConcentracaoAditivo(double concentracaoAditivo) {
    this.concentracaoAditivo = concentracaoAditivo;
  }

  public void setConcentracaoAditivo(String val) {
    this.concentracaoAditivo = Numero.getDouble(val);
  }

  public String getEstequiometriaReacao() {
    return estequiometriaReacao;
  }

  public void setEstequiometriaReacao(String estequiometriaReacao) {
    this.estequiometriaReacao = estequiometriaReacao;
  }

  public String getTemperaturaQueima1() {
    return temperaturaQueima1;
  }

  public void setTemperaturaQueima1(String temperaturaQueima1) {
    this.temperaturaQueima1 = temperaturaQueima1;
  }

  public String getTemperaturaQueima2() {
    return temperaturaQueima2;
  }

  public void setTemperaturaQueima2(String temperaturaQueima2) {
    this.temperaturaQueima2 = temperaturaQueima2;
  }

  public double getMassaEletrolito() {
    return massaEletrolito;
  }

  public String getMassaEletrolitoString() {
    return Numero.getString(massaEletrolito);
  }

  public void setMassaEletrolito(double massaEletrolito) {
    this.massaEletrolito = massaEletrolito;
  }

  public void setMassaEletrolito(String val) {
    this.massaEletrolito = Numero.getDouble(val);
  }

  public double getMassaAditivo() {
    return massaAditivo;
  }

  public String getMassaAditivoString() {
    return Numero.getString(massaAditivo);
  }

  public void setMassaAditivo(double massaAditivo) {
    this.massaAditivo = massaAditivo;
  }

  public void setMassaAditivo(String val) {
    this.massaAditivo = Numero.getDouble(val);
  }

  public double getMassaPigmentoTeorica() {
    return massaPigmentoTeorica;
  }

  public String getMassaPigmentoTeoricaString() {
    return Numero.getString(massaPigmentoTeorica);
  }

  public void setMassaPigmentoTeorica(double massaPigmentoTeorica) {
    this.massaPigmentoTeorica = massaPigmentoTeorica;
  }

  public void setMassaPigmentoTeorica(String val) {
    this.massaPigmentoTeorica = Numero.getDouble(val);
  }

  public double getMassaPigmentoExperimental() {
    return massaPigmentoExperimental;
  }

  public String getMassaPigmentoExperimentalString() {
    return Numero.getString(massaPigmentoExperimental);
  }

  public void setMassaPigmentoExperimental(double massaPigmentoExperimental) {
    this.massaPigmentoExperimental = massaPigmentoExperimental;
  }

  public void setMassaPigmentoExperimental(String val) {
    this.massaPigmentoExperimental = Numero.getDouble(val);
  }

  public String getRendimento() {
    double resposta;

    if (massaPigmentoTeorica == 0.0 || massaPigmentoExperimental == 0.0) {
      resposta = 0.0;
    } else {
      resposta = (100.0 / massaPigmentoTeorica) * massaPigmentoExperimental;
    }

    return Numero.getString(resposta);
  }
}
