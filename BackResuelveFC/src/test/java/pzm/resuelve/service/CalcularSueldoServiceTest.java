package pzm.resuelve.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pzm.resuelve.dto.DTOAtributosNivel;
import pzm.resuelve.dto.DTOEquipo;
import pzm.resuelve.dto.DTOJugador;
import pzm.resuelve.dto.DTONivelesPorEquipo;
import pzm.resuelve.model.request.ModelRequestSueldos;
import pzm.resuelve.model.response.ModelResponseSueldos;

/**
 * 
 *
 * @author Pablo Z&uacute;niga Mata
 * @since 04/12/2019
 */
public class CalcularSueldoServiceTest {

	/**
	 * Test method for {@link pzm.resuelve.service.CalcularSueldoService#calcularSueldoEquipo(pzm.resuelve.model.request.ModelRequestSueldos)}.
	 */
	@Test
	public void testCalcularSueldoEquipo() {
		CalcularSueldoService calcularSueldosService = new CalcularSueldoService();
//		Este resultado es para el jugador Luis
		double resultadoEsperado = 59550;
		double resultadoReal = 0;
		
		
		ModelRequestSueldos requestSueldo = new ModelRequestSueldos();		
		List<DTOJugador> jugadores = new ArrayList<DTOJugador>();
		
		// Datos del Jugador 1
		DTOJugador jugador = new DTOJugador();
		jugador.setNombre("Juan");
		jugador.setNivel("A");
		jugador.setGoles(6);
		jugador.setSueldo(20000);
		jugador.setBono(4000);
		jugador.setEquipo("ResuelveFC");
		jugadores.add(jugador);
		
		// Datos del Jugador 2
		jugador = new DTOJugador();
		jugador.setNombre("Pedro");
		jugador.setNivel("B");
		jugador.setGoles(7);
		jugador.setSueldo(30000);
		jugador.setBono(6000);
		jugador.setEquipo("ResuelveFC");
		jugadores.add(jugador);
				
		// Datos del Jugador 3
		jugador = new DTOJugador();
		jugador.setNombre("Martín");
		jugador.setNivel("C");
		jugador.setGoles(16);
		jugador.setSueldo(40000);
		jugador.setBono(8000);
		jugador.setEquipo("ResuelveFC");
		jugadores.add(jugador);
				
		// Datos del Jugador 4
		jugador = new DTOJugador();
		jugador.setNombre("Luis");
		jugador.setNivel("Cuauch");
		jugador.setGoles(19);
		jugador.setSueldo(50000);
		jugador.setBono(10000);
		jugador.setEquipo("ResuelveFC");
		jugadores.add(jugador);
		
		// agregamos la lista de los jugadores a la clase request
		requestSueldo.setJugadores(jugadores);
		
		List<ModelResponseSueldos> resultado = calcularSueldosService.calcularSueldoEquipo(requestSueldo);
		for(ModelResponseSueldos model:resultado) {
			if(model.getNombre().equalsIgnoreCase("Luis")) {
				resultadoReal = model.getSueldo_completo();
				break;
			}
		}
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}

	/**
	 * Test method for {@link pzm.resuelve.service.CalcularSueldoService#obtenerLaMetaDelEquipo(pzm.resuelve.dto.DTOJugador,
	 *  pzm.resuelve.dto.DTONivelesPorEquipo, java.lang.String)}.
	 */
	@Test
	public void testobtenerLaMetaDelEquipo() {
		CalcularSueldoService calcularSueldosService = new CalcularSueldoService();
//		Este resultado es para el jugador Luis
		double resultadoEsperado = 0;
		double resultadoReal = 0;		
		
		ModelRequestSueldos requestSueldo = new ModelRequestSueldos();		
		List<DTOJugador> jugadores = new ArrayList<DTOJugador>();
		
		// Datos del Jugador 1
		DTOJugador jugador = new DTOJugador();
		jugador.setNombre("Juan");
		jugador.setNivel("A");
		jugador.setGoles(6);
		jugador.setSueldo(20000);
		jugador.setBono(4000);
		jugador.setEquipo("ResuelveFC");
		jugadores.add(jugador);
		
		// Datos del Jugador 2
		jugador = new DTOJugador();
		jugador.setNombre("Pedro");
		jugador.setNivel("B");
		jugador.setGoles(7);
		jugador.setSueldo(30000);
		jugador.setBono(6000);
		jugador.setEquipo("ResuelveFC");
		jugadores.add(jugador);
				
		// Datos del Jugador 3
		jugador = new DTOJugador();
		jugador.setNombre("Martín");
		jugador.setNivel("C");
		jugador.setGoles(16);
		jugador.setSueldo(40000);
		jugador.setBono(8000);
		jugador.setEquipo("ResuelveFC");
		jugadores.add(jugador);
				
		// Datos del Jugador 4
		jugador = new DTOJugador();
		jugador.setNombre("Luis");
		jugador.setNivel("Cuauch");
		jugador.setGoles(19);
		jugador.setSueldo(50000);
		jugador.setBono(10000);
		jugador.setEquipo("ResuelveFC");
		jugadores.add(jugador);
		
		// agregamos la lista de los jugadores a la clase request
		requestSueldo.setJugadores(jugadores);
		
		DTONivelesPorEquipo nivelEquipo = new DTONivelesPorEquipo();
		List<DTOAtributosNivel> tipoNiveles = new ArrayList<>();		
		nivelEquipo.setEquipo("ResuelveFC");
		
		DTOAtributosNivel nivel = new DTOAtributosNivel();
		nivel.setGolesXmes(5);
		nivel.setNivel("A");
		tipoNiveles.add(nivel);
		
		nivel = new DTOAtributosNivel();
		nivel.setGolesXmes(10);
		nivel.setNivel("B");
		tipoNiveles.add(nivel);
		
		nivel = new DTOAtributosNivel();
		nivel.setGolesXmes(15);
		nivel.setNivel("C");
		tipoNiveles.add(nivel);
		
		nivel = new DTOAtributosNivel();
		nivel.setGolesXmes(20);
		nivel.setNivel("Cuauch");
		tipoNiveles.add(nivel);
		
		nivelEquipo.setTipoNiveles(tipoNiveles);
		
		DTOEquipo resultado = calcularSueldosService.obtenerLaMetaDelEquipo(jugadores, nivelEquipo, "Cuauch");
		
		// validamos el nivel de goles por equipo o la meta por equipo
		resultadoEsperado = 50;
		resultadoReal = resultado.getNivelGolesPorEquipo();
		assertEquals(resultadoEsperado, resultadoReal, 0.01);

		// validamos el n&uacueta;mero de goles individual
		resultadoEsperado = 20;
		resultadoReal = resultado.getGolesIndividual();
		assertEquals(resultadoEsperado, resultadoReal, 0.01);

		// validamos el n&uacueta;mero de goles por equipo
		resultadoEsperado = 48;
		resultadoReal = resultado.getGolesPorEquipo();
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}

}
