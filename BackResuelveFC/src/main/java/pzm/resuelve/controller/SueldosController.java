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
@RequestMapping(value = "/servicio")
public class SueldosController {
	
	@Autowired
	CalcularSueldoService calcularSueldosService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value="/calcularSueldo/")
	public ResponseEntity<List<ModelResponseSueldos>> calcularSueldoEquipo(@RequestBody ModelRequestSueldos capturaOficioForm, HttpServletRequest httpRequest){
		List<ModelResponseSueldos> respuesta = new ArrayList<ModelResponseSueldos>();
		if(capturaOficioForm != null && capturaOficioForm.getJugadores() != null) {
			respuesta = calcularSueldosService.calcularSueldoEquipo(capturaOficioForm);
		}
		return new ResponseEntity<List<ModelResponseSueldos>>(respuesta, HttpStatus.OK);
	}

}
