package javadoc;
/**
 * Esta clase es de Maquinaria.
 * @author Gianluca Valdivia 1º DAM
 *
 */
public class Locomotoras extends Maquinaria {
	/**
	 * Atributos de la clase locomotoras.
	 */
	private int potencia;
	private int antiguedad;
	private String mecanico;
	/**
	 * Método que devuelve la potencia de la locomotora.
	 * @return
	 */
	public int getPotencia() {
		return potencia;
	}
	/**
	 * Método que sirve para introducir una potencia de la locomotora.
	 * @param potencia
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	/**
	 * Método que devuelve la antigüedad de la locomotora.
	 * @return
	 */
	public int getAntiguedad() {
		return antiguedad;
	}
	/**
	 * Método que sirve para introducir la antigüedad de la locomotora.
	 * @param antigüedad
	 */
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	/**
	 * Método que devuelve el mecánico responsable de la locomotora.
	 * @return
	 */
	public String getMecanico() {
		return mecanico;
	}
	/**
	 * Método que sirve para introducir el mecánico responsable de la locomotora.
	 * @param mecanico
	 */
	public void setMecanico(String mecanico) {
		this.mecanico = mecanico;
	}
	/**
	 * Costructor de la clase Locomotoras.
	 */
	public Locomotoras() {
		this.potencia=1;
		this.antiguedad=0;
		this.mecanico="";
	}
}
