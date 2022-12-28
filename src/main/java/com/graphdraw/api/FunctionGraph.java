package com.graphdraw.api;

import java.lang.reflect.InvocationTargetException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.graphdraw.math.MathOperation;

@RestController
public class FunctionGraph {

	MathOperation math = new MathOperation();
	GraphDataResponse response = new GraphDataResponse();
	Gson gson = new Gson();
	
	@GetMapping("/function")
	public ResponseEntity<GraphDataResponse> function(@RequestParam ("name") String name, @RequestParam("a") Double a, @RequestParam("b") Double b, @RequestParam("n") Integer n
			,Model model) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Double[] vector = math.linspace(a, b, n);
		
		Double[] yValues = new Double[vector.length];
		
		for (int i=0; i < yValues.length; i++) {
			yValues[i] = math.function(name, vector[i]);
		}
		response.setxValues(vector);
		response.setyValues(yValues);
		model.addAttribute("values", gson.toJson(response));
	//System.out.println("--------------" +gson.toJson(response) );
	return new ResponseEntity<GraphDataResponse>(response, HttpStatus.OK);
	
	}
	
	
	
}
