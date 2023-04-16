
package Dados;

import java.util.HashMap;
import java.util.Random;

/**
 * Clase que representa un ArrayList de dados.
 * Contiene métodos para generar dados y tirarlos, así como mostarlos.
 * @author kadir
 */
public class Dados {
    private HashMap <Integer, Dado> dados = new HashMap<>();
    
    public Dados(){
    }
    
    public void generarDados(){
        Random rdm = new Random();
        
        int cd = 1 + rdm.nextInt(5);
        
        for (int i = 0; i < cd; i++) {
            if(rdm.nextInt(2) == 0)
                dados.put(i, new Dado(6));
            else
                dados.put(i, new Dado(12));
        }
    }
    
    public void tirarDados(){
        Dado dado;
        
        for (int i = 0; i < dados.size(); i++) {
            dado = dados.get(i);
            dado.tirarDado();
        }
    }
    
    public void mostrarDados(){
        Dado dado;
        
        for (int i = 0; i < dados.size(); i++) {
            dado = dados.get(i);
            System.out.println("Dado " + (i + 1) + "\nCantidad de caras " + dado.getCantidadCaras() + "\nCara tirada: "+ dado.getCaraVisible() + "\n");
        }
    }
}
