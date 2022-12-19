package com.graphdraw;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.graphdraw.math.MathOperation;

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

}
