package com.graphdraw.math;

import org.springframework.stereotype.Component;

@Component
public class Polynomial {

	
	
	public Polynomial () {
		
	}
	
public Double NewtonRaphson(Double x, Double [] coeffs){
        
        Double n = coeffs.length-1.0;
        
        
        Double sol=0.0;
        int i=0; 
        Double   h=polynomial(coeffs,n,x)/derPolynomial(coeffs,n,x);
        while(Math.abs(h) > 0.0001){
         h=polynomial(coeffs,n,x)/derPolynomial(coeffs,n,x);
            x=x-h;
            i++;
         System.out.println(x+ " at " + i + " iteration");
            sol=x;
        }
        System.out.println("The solutiom found was: " +sol);
        return sol;
    }
    
    
    public String printDerPoly(Double [] coeffs, Double n){
        String exp="";
        Double []derCoeffs=multiply(coeffs,n);
        exp=printPoly(derCoeffs,n-1);
        System.out.print("Derivative of "
        +printPoly(coeffs,n)+ " is "
      +  exp);
        return exp.substring(0,exp.length()-2);
    }
    
    
    
    public String printPoly(Double [] coeffs, Double n){
       String s="";
       String exp="";
       
       for (int i=0; i < coeffs.length; i++){
           s=s + String.valueOf(coeffs[i]) + "*x^"+ String.valueOf(n)+"+";
           n--;
           if (n  <0){
               break;
           }
           
       }
       exp=s.replace("+-","-");
       
      
     
       return exp.substring(0, exp.length()-2);
    }
    
    
    public Double polynomial(Double []coeffs, Double n, Double x){
    double s =0.0;
    
     for (int i=0; i < coeffs.length; i++){
         s=s+coeffs[i]*Math.pow(x,n);
         n--;
         
        }
        return s;
    }
    
   public double derPolynomial (Double coeffs[], Double n, Double x){
       Double exp=0.0;
     
    
        exp = polynomial (multiply(coeffs,n), n-1,x);
       
        return exp;
        
    }

    public Double[] multiply(Double[] coeffs, Double k) {
           Double[] prod=new Double[coeffs.length];
           
            for (int i=0; i < coeffs.length; i++){
                
              prod[i] = coeffs[i]*k;
              k--;
         }
         return prod;
    }
    
    
    public static void printArr(double [] arr){
        
        
      for (int i=0; i < arr.length; i++){
          System.out.print(arr[i]+ " ");
      }
      }
    
    
}
