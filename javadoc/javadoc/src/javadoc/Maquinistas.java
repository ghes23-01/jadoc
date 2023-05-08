package javadoc;
/**
 * Es la clase Maquinistas.
 * @author Gianluca Valdivia 1º DAM
 *
 */

public class Maquinistas extends Persona {
	/**
	 * Atributos de la clase Maquinistas.
	 */
private double sueldo;
private String rango;
/**
 * Método que devuelve el sueldo del maquinista.
 * @return
 */
public double getSueldo() {
	return sueldo;
}
/**
 * Método que sirve para introducir el sueldo de la maquinista.
 * @param sueldo
 */
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
/**
 * Método que devuelve eñ rango del maquinista.
 * @return
 */
public String getRango() {
	return rango;
}
/**
 * Método que sirve para introducir el rango del maquinista.
 * @param rango
 */
public void setRango(String rango) {
	this.rango = rango;
}
}
