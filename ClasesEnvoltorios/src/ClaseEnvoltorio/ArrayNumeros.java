/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseEnvoltorio;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kadir
 */
public class ArrayNumeros {
    private ArrayList<Integer> numeros = new ArrayList();
    
    public void llenarArryaList(int cantidad){
        Random rdm= new Random();
        
        for (int i = 0; i < cantidad; i++) {
            numeros.add(rdm.nextInt(12));
        }
    }
    
    public int getNumero(int posicion){
        return numeros.get(posicion);
    }
            
    public void mostrarIteraciones(){
        ArrayList<Integer> iteraciones= new ArrayList();
        int it = 0;
        
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < numeros.size(); i++) {
                if(numeros.get(i) == j){
                    it = it + 1;
                }
            }
            iteraciones.add(it);
            it = 0;
        }
        
        for (int i = 0; i < 12; i++) {
            System.out.println(i + ": " + iteraciones.get(i));
        }
        
    }
 
}
