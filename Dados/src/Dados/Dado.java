package Dados;

import java.util.Random;

/**
 * Clase que representa un Dado con n número de caras.
 * @param cantidadCaras El número de caras que contiene el dado.
 * @param caraVisible El valor de la cara visible del dado.
 * @author kadir
 */
public class Dado {
    private int cantidadCaras;
    private int caraVisible;
    
    public Dado(int cantidadCaras){
        this.cantidadCaras = cantidadCaras;
    }
    
    public Dado(){
        this.cantidadCaras = 0;
    }
    
    public int getCaraVisible(){
        return caraVisible;
    }
    
    public int getCantidadCaras(){
        return cantidadCaras;
    }
    
    public void tirarDado(){
        Random rdm = new Random();
        caraVisible = 1 + rdm.nextInt(cantidadCaras);
    }
    
}
