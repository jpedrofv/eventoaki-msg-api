package br.com.eventoaki.msg.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.eventoaki.msg.api.model.GenericResponse;

@RestController
@RequestMapping("/review")
public class FaqController {

	
	@GetMapping
	public ResponseEntity<GenericResponse> getFaqByProduct(@RequestParam(value="productId") Integer productId){
		GenericResponse response = new GenericResponse();
		
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
