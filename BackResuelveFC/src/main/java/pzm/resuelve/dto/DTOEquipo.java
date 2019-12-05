/*
 * ModelRequestEquipo.java 04/12/2019
 * <p>
 * Copyright (C) 2019 PZM
 * <p>
 * Todos los derechos reservados.
 */
package pzm.resuelve.dto;

import java.io.Serializable;

/**
 * Clase que contienen los atributos que se solicitan del equipo
 *
 * @author Pablo Z&uacute;niga Mata
 * @copyright PZM
 * @since 04/12/2019
 */
public class DTOEquipo implements Serializable {

	private static final long serialVersionUID = -4441137038559359436L;

	/*
	 * Nombre del equipo
	 */
	private String equipo;

	/*
	 * Meta de goles al mes 
	 */
	private Integer nivelGolesPorEquipo;

	/*
	 * Goles anotados en el mes por equipo
	 */
	private Integer golesPorEquipo;

	/*
	 * Goles anotados en el mes por jugador
	 */
	private Integer golesIndividual;
	
	

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
	 * @return the nivelGolesPorEquipo
	 */
	public Integer getNivelGolesPorEquipo() {
		return nivelGolesPorEquipo;
	}

	/**
	 * @param nivelGolesPorEquipo the nivelGolesPorEquipo to set
	 */
	public void setNivelGolesPorEquipo(Integer nivelGolesPorEquipo) {
		this.nivelGolesPorEquipo = nivelGolesPorEquipo;
	}

	/**
	 * @return the golesPorEquipo
	 */
	public Integer getGolesPorEquipo() {
		return golesPorEquipo;
	}

	/**
	 * @param golesPorEquipo the golesPorEquipo to set
	 */
	public void setGolesPorEquipo(Integer golesPorEquipo) {
		this.golesPorEquipo = golesPorEquipo;
	}

	/**
	 * @return the golesIndividual
	 */
	public Integer getGolesIndividual() {
		return golesIndividual;
	}

	/**
	 * @param golesIndividual the golesIndividual to set
	 */
	public void setGolesIndividual(Integer golesIndividual) {
		this.golesIndividual = golesIndividual;
	}
	
	
	
}
