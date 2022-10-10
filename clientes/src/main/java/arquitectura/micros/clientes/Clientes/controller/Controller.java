package arquitectura.micros.clientes.Clientes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class Controller {
	
	
	@GetMapping("/datos")
	public ResponseEntity<?> responseEntity (){
		return new ResponseEntity<>("Respuesta del Micro Clientes",HttpStatus.OK);
	}

}
