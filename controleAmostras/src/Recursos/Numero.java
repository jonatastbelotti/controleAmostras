package Recursos;

import java.text.DecimalFormat;

/**
 *
 * @author Jônatas Trabuco Belotti [jonatas.t.belotti@hotmail.com]
 */
public abstract class Numero {

  public static double getDouble(String texto) {
    double resposta;

    try {
      texto = texto.replace(",", ".");

      resposta = Double.parseDouble(texto);
    } catch (NumberFormatException e) {
      resposta = 0D;
    }

    return resposta;
  }

  public static String getString(double numero) {
    String resposta;
    DecimalFormat decimalFormat;

    try {
      decimalFormat = new DecimalFormat("#####0.0####");
      resposta = decimalFormat.format(numero);
      resposta = resposta.replace(".", ",");
    } catch (Exception e) {
      resposta = "0,0";
    }

    return resposta;
  }

}
