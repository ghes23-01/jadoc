package javadoc;
/**
 * Es la clase Mecanicos.
 * @author Gianluca Valdivia 1º DAM
 *
 */
public class Mecanicos extends Persona {
	/**
	 * Atributo y enumeración de la clase Mecanicos. 
	 */
private int telefono;
enum especialidad {frenos, hidraulica, eletricidad, motor};
/**
 * Método que devuelve
 * @return
 */

public int getTelefono() {
	return telefono;
}
/**
 *  Método que sirve para introducir el teléfono.
 * @param telefono
 */
public void setTelefono(int telefono) {
	this.telefono = telefono;
}

}
