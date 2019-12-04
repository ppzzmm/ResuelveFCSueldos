/*
 * ModelResponseSueldos.java 04/12/2019
 * <p>
 * Copyright (C) 2019 PZM
 * <p>
 * Todos los derechos reservados.
 */
package pzm.resuelve.model.response;

import java.io.Serializable;

/**
 * Clase que contienen los atributos que mandaran como  resultado.
 *
 * @author Pablo Z&uacute;niga Mata
 * @copyright PZM
 * @since 04/12/2019
 */
public class ModelResponseSueldos implements Serializable{

	private static final long serialVersionUID = 4694395484436004114L;
	
	private String nombre;
	
	private Integer goles_minimos;
	
	private Integer goles;
	
	private Integer sueldo;
	
	private Integer bono;
	
	private Integer sueldo_completo;
	
	private String equipo;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the goles_minimos
	 */
	public Integer getGoles_minimos() {
		return goles_minimos;
	}

	/**
	 * @param goles_minimos the goles_minimos to set
	 */
	public void setGoles_minimos(Integer goles_minimos) {
		this.goles_minimos = goles_minimos;
	}

	/**
	 * @return the goles
	 */
	public Integer getGoles() {
		return goles;
	}

	/**
	 * @param goles the goles to set
	 */
	public void setGoles(Integer goles) {
		this.goles = goles;
	}

	/**
	 * @return the sueldo
	 */
	public Integer getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @return the bono
	 */
	public Integer getBono() {
		return bono;
	}

	/**
	 * @param bono the bono to set
	 */
	public void setBono(Integer bono) {
		this.bono = bono;
	}

	/**
	 * @return the sueldo_completo
	 */
	public Integer getSueldo_completo() {
		return sueldo_completo;
	}

	/**
	 * @param sueldo_completo the sueldo_completo to set
	 */
	public void setSueldo_completo(Integer sueldo_completo) {
		this.sueldo_completo = sueldo_completo;
	}

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
	
	

}
