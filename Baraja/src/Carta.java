/**
 * Clase que representa una carta de baraja.
 * @param valor Valor de la carta (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K A)
 * @param figura Figura de la carta (diamantes, corazones, espadas, picas, tréboles)
 * A partir de la figura se puede obtener el color de la carta.
 * @author kadir
 */
public class Carta {
  
  private int valor;
  private Figura figura;
  
  public Carta(){
  
  }
  
  public int getValor() {
    return valor;
  }

  public Figura getFigura() {
    return figura;
  }
  
  
  public Color getColor() {
    return((figura == Figura.CORAZONES || figura == Figura.DIAMANTES)? Color.ROJO : Color.NEGRO);
  }

  public Carta(int valor, Figura figura) throws FueraDeRangoException{
    if(valor < 1 || valor > 13)
      throw new FueraDeRangoException("Valor "+valor+ " fuera de rango");
    this.valor = valor;
    this.figura = figura;
  }

  public Carta(String valor, Figura figura) throws FueraDeRangoException{
    valor = valor.toUpperCase();
    if(!valor.equals("K") && !valor.equals("Q") && !valor.equals("J") && !valor.equals("A"))
      throw new FueraDeRangoException("Cadena \""+valor+ "\" fuera de rango");
    this.valor = (valor.equals("K")?13:valor.equals("Q")?12:valor.equals("J")?11:1);
    this.figura = figura;
  }

  @Override
  public String toString() {
    String valorStr= String.valueOf(this.valor);
    if( valor == 1) valorStr = "A";
    if( valor == 11) valorStr = "J";
    if( valor == 12) valorStr = "Q";
    if( valor == 13) valorStr =  "K";
    
    return valorStr+" "+this.figura;
  }

}
