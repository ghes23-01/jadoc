package javadoc;
/**
 * Es la clase Vagones.
 * @author Gianluca Valdivia 1º DAM
 *
 */

class Vagones extends Maquinaria {
	/**
	 * Atributos de la clase Vagones.
	 * 
	 * cargam  -Carga máxima que está medido en Kg.
	 * cargaac -Carga actual que está medido en Kg.
	 */
private double cargam;  
private double cargaac; 
private String tipoMercancia;
/**
 * Método que devuelve la carga máxima.
 * @return
 */
public double getCargam() {
	return cargam;
}
/**
 *  Método que sirve para introducir la carga máxima.
 * @param cargam
 */
public void setCargam(double cargam) {
	this.cargam = cargam;
}
/**
 * Método que devuelve la carga actual.
 * @return
 */
public double getCargaac() {
	return cargaac;
}
/**
 *  Método que sirve para introducir la carga actual.
 * @param cargaac
 */
public void setCargaac(double cargaac) {
	this.cargaac = cargaac;
}
/**
 * Método que devuelve el tipo de mercancia.
 * @return
 */
public String getTipoMercancia() {
	return tipoMercancia;
}
/**
 * Método que sirve para introducir el tipo de mercancia.
 * @param tipoMercancia
 */
public void setTipoMercancia(String tipoMercancia) {
	this.tipoMercancia = tipoMercancia;
}
/**
 *  Constructor de la clase vagones.
 */
public Vagones() {
	this.cargam=1;
	this.cargaac=1;
	this.tipoMercancia="";
}
}

