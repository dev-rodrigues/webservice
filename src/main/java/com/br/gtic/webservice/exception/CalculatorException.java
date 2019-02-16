package com.br.gtic.webservice.exception;

/*
 * @author carlos henrique
 * @github https://github.com/httpsantos
 */
public class CalculatorException extends RuntimeException {

	private static final long serialVersionUID = 1348935907886197059L;
	
	public CalculatorException() {
	}
	
	public CalculatorException(String message) {
		super(message);
	}

}
