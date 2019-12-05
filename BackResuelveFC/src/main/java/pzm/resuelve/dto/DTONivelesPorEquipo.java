package pzm.resuelve.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clase que contienen los atributos del equipo
 *
 * @author Pablo Z&uacute;niga Mata
 * @since 04/12/2019
 */
public class DTONivelesPorEquipo implements Serializable{

	private static final long serialVersionUID = -1840513105508927188L;

	/*
	 * Nombre del equipo
	 */
	private String equipo;
	
	/*
	 * Niveles
	 */
	private List<DTOAtributosNivel> tipoNiveles;
	
	

	/**
	 * @return the equipo
	 */
	public String getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	/**
	 * @return the tipoNiveles
	 */
	public List<DTOAtributosNivel> getTipoNiveles() {
		return tipoNiveles;
	}

	/**
	 * @param tipoNiveles the tipoNiveles to set
	 */
	public void setTipoNiveles(List<DTOAtributosNivel> tipoNiveles) {
		this.tipoNiveles = tipoNiveles;
	}	

}
