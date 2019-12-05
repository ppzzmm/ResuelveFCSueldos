package pzm.resuelve.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pzm.resuelve.dto.DTOAtributosNivel;
import pzm.resuelve.dto.DTOEquipo;
import pzm.resuelve.dto.DTOJugador;
import pzm.resuelve.dto.DTONivelesPorEquipo;
import pzm.resuelve.model.request.ModelRequestSueldos;
import pzm.resuelve.model.response.ModelResponseSueldos;

/**
 * Servicio que contienen los métodos para calcular los sueldos de los jugadores
 *
 * @author Pablo Z&uacute;niga Mata
 * @since 04/12/2019
 */
@Service
public class CalcularSueldoService {
	
	/**
	 * M&eacute;todo encargado de obtener la meta del equipo
	 * 
	 * @param jugadores
	 * @param nivelEquipo
	 * @param tipoNivel
	 * @return
	 * @author Pablo Z&uacute;niga Mata
	 * @since 04/12/2019
	 */
	public DTOEquipo obtenerLaMetaDelEquipo(List<DTOJugador> jugadores, DTONivelesPorEquipo nivelEquipo, String tipoNivel) {
    DTOEquipo equipo = new DTOEquipo();
		Integer nivelGolesPorEquipo = 0;
		Integer golesPorEquipo = 0;
		Integer golesIndividual = 0;
		
		// Barremos la lista de los tipo de niveles del equipo parar obtener la meta de goles por mes del nivel.
		for(DTOAtributosNivel nivel: nivelEquipo.getTipoNiveles()) {
			if(tipoNivel.equalsIgnoreCase(nivel.getNivel())) {
				golesIndividual = nivel.getGolesXmes();
				break;
			}
		}
		
		// Barremos la lista de jugadores para obtener el n&uacute;mero de goles que anoto el equipo al mes y el n&uacute;mero de goles que debi&oacute; meter
		for(DTOJugador jugador: jugadores) {
			if(jugador.getEquipo().equalsIgnoreCase(nivelEquipo.getEquipo())) {
				for(DTOAtributosNivel nivel: nivelEquipo.getTipoNiveles()) {
					if(jugador.getNivel().equalsIgnoreCase(nivel.getNivel())) {
						nivelGolesPorEquipo+=nivel.getGolesXmes();
					}
				}
				golesPorEquipo += jugador.getGoles();
			}
		}
		equipo.setEquipo(nivelEquipo.getEquipo());
		equipo.setGolesPorEquipo(golesPorEquipo);
		equipo.setNivelGolesPorEquipo(nivelGolesPorEquipo);
		equipo.setGolesIndividual(golesIndividual);
		
		return equipo;
	}
	
	/**
	 * M&eacute;todo encargado de obtener el equipo y sus niveles predeterminados.
	 * 
	 * @param nombreEquipo
	 * @return
	 * @author Pablo Z&uacute;niga Mata
	 * @since 04/12/2019
	 */
	public DTONivelesPorEquipo obtenerEquipoPredeterminado(String nombreEquipo) {
		// Inicializamos los objetosque utilizaremos
		DTONivelesPorEquipo equipo = new DTONivelesPorEquipo();
		equipo.setEquipo(nombreEquipo);
		
		// Llenamos los tipos de niveles
		List<DTOAtributosNivel> niveles = new ArrayList<DTOAtributosNivel>();
		DTOAtributosNivel nivel = new DTOAtributosNivel();
		nivel.setNivel("A");
		nivel.setGolesXmes(5);
		niveles.add(nivel);
		nivel = new DTOAtributosNivel();
		nivel.setNivel("B");
		nivel.setGolesXmes(10);
		niveles.add(nivel);
		nivel = new DTOAtributosNivel();
		nivel.setNivel("C");
		nivel.setGolesXmes(15);
		niveles.add(nivel);
		nivel = new DTOAtributosNivel();
		nivel.setNivel("Cuauch");
		nivel.setGolesXmes(20);
		niveles.add(nivel);
		
		// Seteamos la lista de tipo DTONivel al equipo
		equipo.setTipoNiveles(niveles);
		
		return equipo;
	}

}
