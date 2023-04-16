import java.text.DecimalFormat;

/**
 * Clase Complejo que representa un número complejo.
 * @param real La parte real del número complejo.
 * @param imaginario La parte imaginara del número complejo.
 */

public class Complejo {
	private double real;
	private double imaginario;
	
	public Complejo(double real, double imaginario) { 
		this.real = real;
		this.imaginario = imaginario;
	}

	public double getReal() {
		return real;
	}

	public double getImaginario() {
		return imaginario;
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("#.####");
		return formato.format(real) + (imaginario >= 0 ? " + " : " ") + formato.format(imaginario) + "𝑖";
	}
}
