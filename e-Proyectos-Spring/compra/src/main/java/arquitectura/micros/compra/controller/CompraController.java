package arquitectura.micros.compra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arquitectura.micros.compra.model.Compra;
import arquitectura.micros.compra.service.CompraService;

@RestController
@RequestMapping("/api/compra") 
public class CompraController {
	
	@Autowired
	private CompraService compraService;
		
	@PostMapping
	public ResponseEntity<?> saveCompra(@RequestBody Compra compra)
	{
		return new ResponseEntity<> (compraService.saveCompra(compra),
				HttpStatus.CREATED
				);
	}
	
	
	
	@GetMapping("{userId}")
	public ResponseEntity<?> getAllComprasOfUser(@PathVariable Long userId)
	{
		
		return ResponseEntity.ok(compraService.findAllComprasOfUser(userId));
		
		
	}

}
