package javadoc;
/**
 * Esta clase es de jesfes de estación.
 * @author Gianluca Valdivia
 *
 */

public class JefesEstacion extends Persona {


/**
 * Fecha de nacimiento de jefe de estación.
 */
private int FechaNombramiento;

/**
 * Método que devuelve la fecha de nacimiento de jefe de estación.
 * @return
 */
public int getFechaNombramiento() {
	return FechaNombramiento;
}

/**
 * Método que sirve para introducir una fecha de nacimiento.
 * @param fechaNombramiento
 */
public void setFechaNombramiento(int fechaNombramiento) {
	this.FechaNombramiento = fechaNombramiento;
}
}
