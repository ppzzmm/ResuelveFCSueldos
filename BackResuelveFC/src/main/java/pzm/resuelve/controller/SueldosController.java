package pzm.resuelve.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import pzm.resuelve.model.request.ModelRequestSueldos;
import pzm.resuelve.model.response.ModelResponseSueldos;
import pzm.resuelve.service.CalcularSueldoService;

/**
 * Controller - Contiene el Servicio para calcular los sueldos de cada jugador
 *
 * @author Pablo Z&uacute;niga Mata
 * @since 04/12/2019
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/servicio")
public class SueldosController {
	
	@Autowired
	CalcularSueldoService calcularSueldosService;
	
		
	/**
	 * Servicio encargado de validar y calcular los sueldos de cada jugador de acuerdo a su equipo
	 * 
	 * @param capturaOficioForm
	 * @param ModelRequestSueldos httpRequest
	 * @return ResponseEntity<List<ModelResponseSueldos>>
	 * @author Pablo Z&uacute;niga Mata
	 * @since 04/12/2019
	 */
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value="/calcularSueldo/")
	public ResponseEntity<List<ModelResponseSueldos>> calcularSueldoEquipo(@RequestBody ModelRequestSueldos requestSueldos, HttpServletRequest httpRequest){
		List<ModelResponseSueldos> respuesta = new ArrayList<ModelResponseSueldos>();
		if(requestSueldos != null && requestSueldos.getJugadores() != null) {
			respuesta = calcularSueldosService.calcularSueldoEquipo(requestSueldos);
		}
		return new ResponseEntity<List<ModelResponseSueldos>>(respuesta, HttpStatus.OK);
	}

}
