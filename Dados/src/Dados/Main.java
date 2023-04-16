package Dados;

/**
 * Clase que contiene el método main para iniciar la aplicación.
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
