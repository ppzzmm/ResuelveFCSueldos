package pzm.resuelve.model.request;

import java.io.Serializable;
import java.util.List;

import pzm.resuelve.dto.DTOJugador;
import pzm.resuelve.dto.DTONivelesPorEquipo;

/**
 * Clase que contienen los atributos que se solicitan en el servicio
 *
 * @author Pablo Z&uacute;niga Mata
 * @since 04/12/2019
 */
public class ModelRequestSueldos implements Serializable{

	private static final long serialVersionUID = 3994417212851644936L;
	
	/*
	 * Lista de jugadores
	 */
	private List<DTOJugador> jugadores;
	
	/*
	 * Lista de Equipos
	 */
	private List<DTONivelesPorEquipo> equipos;

	/**
	 * @return the jugadores
	 */
	public List<DTOJugador> getJugadores() {
		return jugadores;
	}

	/**
	 * @param jugadores the jugadores to set
	 */
	public void setJugadores(List<DTOJugador> jugadores) {
		this.jugadores = jugadores;
	}

	/**
	 * @return the equipos
	 */
	public List<DTONivelesPorEquipo> getEquipos() {
		return equipos;
	}

	/**
	 * @param equipos the equipos to set
	 */
	public void setEquipos(List<DTONivelesPorEquipo> equipos) {
		this.equipos = equipos;
	}
	
}
