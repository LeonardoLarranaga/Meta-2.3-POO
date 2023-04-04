/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.Random;

/**
 *
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
