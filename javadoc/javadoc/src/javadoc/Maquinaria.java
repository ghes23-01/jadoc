package javadoc;
/**
 * Es la clase Maquinaria.
 * @author Gianluca Valdivia 1º DAM
 *
 */

public class Maquinaria {
	/**
	 * Identificación de las maquinarias de la empresa.
	 */
private String ID;
/**
 * Método que devuelve la identificación de las maquinarias
 * @return
 */
public String getID() {
	return ID;
}
/**
 * Método que sirve para introducir la identificación de las maquinarias
 * @param ID
 */
public void setID(String ID) {
	this.ID = ID;
}
}