package com.graphdraw.math;
import java.math.*;

import org.springframework.stereotype.Component;

@Component
public class MathOperation {

	
	
	
	public static Double[] cos(Double[] argument){
        Double result [] = new Double[argument.length];
       for (int i=0; i < argument.length; i++){
           result[i] = Math.cos(argument[i]);
       }
         
   return result;
       
   }
	
	
	
public static Double[] linspace(Double a, Double b, Integer n) {
        
        Double step = (b-a)/n;
        Double lin[] = new Double[n];
        lin[0]=a;
        lin[n-1]=b;
        for (int i=1; i <= n-1; i++){
            lin[i]=lin[i-1]+step;
        }
        
          for (int i=0; i < n; i++){
          System.out.print(lin[i]+" ");
              
          }
        return lin;
    }
	

	  public static void printArr (Object[] arr) {
		  
		  if (arr instanceof Double[]) {
		  for (int i=0; i < arr.length; i++) {
			  System.out.print(arr[i]+" ");
		  }
		  }
	  }
}
