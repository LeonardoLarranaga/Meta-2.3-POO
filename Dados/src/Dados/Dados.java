/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kadir
 */
public class Dados {
    private ArrayList<Dado> dados = new ArrayList();
    
    public Dados(){
    }
    
    public void generarDados(){
        Random rdm = new Random();
        
        int cd = 1 + rdm.nextInt(5);
        
        for (int i = 0; i < cd; i++) {
            if(rdm.nextInt(2) == 0)
                dados.add(new Dado(6));
            else
                dados.add(new Dado(12));
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
