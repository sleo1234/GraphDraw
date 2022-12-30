package com.graphdraw.api;

public class PolynomialRequest {

	public Double a;
	public Double b;
	public Integer n;
	
	public String [] coeffs;

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public String[] getCoeffs() {
		return coeffs;
	}

	public void setCoeffs(String[] coeffs) {
		this.coeffs = coeffs;
	}

	

	
}
