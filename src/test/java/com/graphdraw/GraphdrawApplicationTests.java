package com.graphdraw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.graphdraw.math.MathOperation;
import com.graphdraw.math.Polynomial;

@SpringBootTest
class GraphdrawApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testLinSpace() {
		MathOperation math = new MathOperation();
		Double[] vector = math.linspace(1.0, 10.0, 8);
		
		math.printArr(vector);
	}
	
	@Test 
	
	public void testPolynomialFunction() {
		Polynomial poly = new Polynomial();
		
		double []coeffs= {1,2,3,4};
		double x0=2;
		double n = coeffs.length-1;
		String polynom = poly.printPoly(coeffs, n);
		String derPolynom = poly.printDerPoly(coeffs, n);
		//System.out.println(derPolynom);
		poly.NewtonRaphson(x0, coeffs);
	}

}
