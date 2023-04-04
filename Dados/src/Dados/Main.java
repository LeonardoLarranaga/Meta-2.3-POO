/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kadir
 */
public class Main {
    public static void main(String arrgs[]){
        Dados dados = new Dados();
        

        dados.generarDados();
        dados.tirarDados();
        dados.mostrarDados();        
        
    }
}
