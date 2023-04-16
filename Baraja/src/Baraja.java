/**
 * Clase baraja que representa las 52 cartas de un mazo.
 * @param mazo ArrayList de tipo Carta que representa un mazo de cartas.
 *
 */

import java.util.HashSet;
import java.util.Random;

public class Baraja {
  private HashSet<Carta> mazo;

  public Baraja() {
    this.mazo = new HashSet<>();
    inicializa();
  }

  private void inicializa() {
    for (Figura f : Figura.values()) {
      for (int v = 1; v <= 13; v++) {
        try {
          mazo.add(new Carta(v, f));
        } catch (FueraDeRangoException e) {
          System.out.println(e);
        }
      }
    }
  }

  public Carta repartir() {
    Random rdm = new Random();

    Carta carta = new Carta();
    int index = rdm.nextInt(mazo.size());
    for (Carta c : mazo) {
      if (index-- == 0) {
        carta = c;
        break;
      }
    }

    mazo.remove(carta);
    return carta;
  }

  @Override
  public String toString() {
    StringBuffer mazoStr = new StringBuffer();
    for (Carta c : mazo) {
      mazoStr.append(c.toString()+"\n");
    }
    return mazoStr.toString();
  }
}
