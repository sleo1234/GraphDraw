package com.graphdraw.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.graphdraw.math.MathOperation;

@RestController
public class FunctionGraph {

	MathOperation math = new MathOperation();
	GraphDataResponse response = new GraphDataResponse();
	
	
	@GetMapping("/cos")
	public ResponseEntity<GraphDataResponse> cosine(@RequestParam("a") Double a, @RequestParam("b") Double b, @RequestParam("n") Integer n) {
		Double[] vector = math.linspace(a, b, n);
		
		Double[] cosOf = math.cos(vector);
		response.setxValues(vector);
		response.setyValues(cosOf);
		System.out.println(response);
	return new ResponseEntity<GraphDataResponse>(response, HttpStatus.OK);
	}
	
	
	
}
