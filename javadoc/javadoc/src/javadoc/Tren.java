package javadoc;
/**
 * 
 * @author Gianluca Valdivia 1º DAM
 *
 */

public class Tren extends Maquinaria {
	/**
	 * Atributo de la clase Tren.
	 */
private String maquinista;
/**
 *  Método que devuelve el maquinista del tren.
 * @return
 */
	public String getMaquinista() {
	return maquinista;
}
	/**
	 * Método que sirve para introducir el maquinista del tren.
	 * @param maquinista
	 */
public void setMaquinista(String maquinista) {
	this.maquinista = maquinista;
}
	/**
	 * Los objetos tipo Locomotoras y vagones.
	 */
Locomotoras a = new Locomotoras();

Vagones b = new Vagones();
Vagones c = new Vagones();
Vagones d = new Vagones();
Vagones f = new Vagones();
Vagones g = new Vagones();
}
