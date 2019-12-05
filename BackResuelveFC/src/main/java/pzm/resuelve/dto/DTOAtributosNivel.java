package pzm.resuelve.dto;

import java.io.Serializable;

/**
 * Entidad de niveles
 *
 * @author Pablo Z&uacute;niga Mata
 * @since 04/12/2019
 */
public class DTOAtributosNivel implements Serializable{

	private static final long serialVersionUID = 4380898267360384246L;
	
	private String nivel;
	
	private Integer golesXmes;

	/**
	 * @return the nivel
	 */
	public String getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the golesXmes
	 */
	public Integer getGolesXmes() {
		return golesXmes;
	}

	/**
	 * @param golesXmes the golesXmes to set
	 */
	public void setGolesXmes(Integer golesXmes) {
		this.golesXmes = golesXmes;
	}
	
	

}
