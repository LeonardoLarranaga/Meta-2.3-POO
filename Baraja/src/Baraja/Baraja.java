/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baraja;

/**
 *
 * @author kadir
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Baraja {
  private ArrayList<Carta> mazo;

  public Baraja() {
    this.mazo = new ArrayList<>();
    inicializa();
  }

  private void inicializa() {
    for (Figura f: Figura.values()) {
      for( int v= 1 ; v <= 13 ; v++) {
        try {
          mazo.add(new Carta(v,f));
        } catch (FueraDeRangoException e) {
          System.out.println(e);
        }
      }
    }
  }

  public Carta repartir() {
    Random rdm = new Random();
    
    Carta carta = new Carta();
    carta = mazo.get(1+rdm.nextInt(52));
    
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
