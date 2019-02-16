package com.br.gtic.webservice.exception;

import javax.xml.soap.*;
import javax.xml.ws.soap.SOAPFaultException;

/*
 * @author carlos henrique
 * @github https://github.com/httpsantos
 */
public class CalculatorSOAPFaultException extends SOAPFaultException {

	private static final long serialVersionUID = 5033876293681950170L;

	private static SOAPFactory soapFactory;

	static {
		try {
			soapFactory = SOAPFactory.newInstance();
		} catch (SOAPException e) {
			throw new CalculatorException("Erro em inicializar o objeto SOAPFactory." + " Stack: " + e.getMessage());
		}
	}

	public CalculatorSOAPFaultException(SOAPFault faultException) {
		super(faultException);
	}

	public static SOAPFactory getSoapFactory() {
		return soapFactory;
	}
}