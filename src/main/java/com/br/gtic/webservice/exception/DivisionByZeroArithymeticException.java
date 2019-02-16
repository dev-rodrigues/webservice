package com.br.gtic.webservice.exception;

/*
 * @author carlos henrique
 * @github https://github.com/httpsantos
 */
public class DivisionByZeroArithymeticException extends ArithmeticException {

	private static final long serialVersionUID = 3966478940709679190L;

	public DivisionByZeroArithymeticException() {
	}

	public DivisionByZeroArithymeticException(String message) {
		super(message);
	}
}
