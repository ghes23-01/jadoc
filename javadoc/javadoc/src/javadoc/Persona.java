package javadoc;
/**
 * Es la clase persona.
 * @author Gianluca Valdivia 1º DAM
 *
 */
public class Persona {
	/**
	 * Atributos de la clase persona.
	 */
private String nombre;
private String DNI;
/**
 * Método que devuelve el nombre de la persona.
 * @return
 */
public String getNombre() {
	return nombre;
}
/**
 * Método que sirve para introducir el nombre de la persona.
 * @param nombre
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * Método que devuelve el DNI de la persona.
 * @return
 */
public String getDNI() {
	return DNI;
}
/**
 * Método que sirve para introducir el DNI de la persona.
 * @param DNI
 */
public void setDNI(String DNI) {
	this.DNI = DNI;
}
}
