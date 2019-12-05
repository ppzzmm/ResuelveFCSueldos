package pzm.resuelve.model.response;

import java.io.Serializable;

/**
 * Clase que contienen los atributos que mandaran como  resultado.
 *
 * @author Pablo Z&uacute;niga Mata
 * @since 04/12/2019
 */
public class ModelResponseSueldos implements Serializable{

	private static final long serialVersionUID = 4694395484436004114L;
	
	/*
	 * Nombre del jugador
	 */
	private String nombre;
	
	/*
	 * Goles meta por mes
	 */
	private Integer goles_minimos;
	
	/*
	 * Goles anotados en el mes
	 */
	private Integer goles;
	
	/*
	 * Sueldo fijo
	 */
	private Integer sueldo;
	
	/*
	 * Bono del jugador a alcanzar
	 */
	private Integer bono;
	
	/*
	 * Es la suma de su sueldo fijo más el porcentaje de bono
	 */
	private float sueldo_completo;
	
	/*
	 * El equipo al que pertenece
	 */
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
	public float getSueldo_completo() {
		return sueldo_completo;
	}

	/**
	 * @param sueldo_completo the sueldo_completo to set
	 */
	public void setSueldo_completo(float sueldo_completo) {
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
