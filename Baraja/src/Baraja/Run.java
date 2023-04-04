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

public class Run{

  public static void main( String arrgs[]) {
    Baraja b = new Baraja();

    Carta carta = b.repartir();
    System.out.println(carta);
    
  }
  
}
