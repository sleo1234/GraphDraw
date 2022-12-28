package com.graphdraw.math;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
	  
	  
	  
	  public Double function (String functionName, double... param) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException{
		  Class<?> mathClass = java.lang.Math.class;
          double c;
          
          if (param.length >1){
        Method myMeth = mathClass.getMethod(functionName, double.class,double.class);
          c = (double) myMeth.invoke(mathClass, param[0],param[1]);
              
          }
          
          else{
              Method myMeth = mathClass.getMethod(functionName, double.class);
            c = (double) myMeth.invoke(mathClass, param[0]);
    
          }
       System.out.println("returned value: " + c);
       
       return c;
	  }
}
