package com.javid.mo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

	@GetMapping("/cars")
	public ResponseEntity<List<String>> getBookList(){ 
		return ResponseEntity.ok(CarService.getCarList());
	}
	
}
