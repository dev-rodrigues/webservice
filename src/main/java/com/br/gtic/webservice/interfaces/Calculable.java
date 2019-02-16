package com.br.gtic.webservice.interfaces;

/*
 * @author carlos henrique
 * @github https://github.com/httpsantos
 */
import static com.br.gtic.webservice.util.Constants.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.soap.SOAPException;

import com.br.gtic.webservice.exception.DivisionByZeroArithymeticException;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface Calculable {
	/**
	 * Divide method
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 * @throws DivisionByZeroArithymeticException
	 * @throws SOAPException
	 */
	@WebMethod(action = HOST + "/divide", operationName = "division")
	public double divide(@WebParam(name = "dividend") double dividend, @WebParam(name = "divisor") double divisor)
			throws DivisionByZeroArithymeticException, SOAPException;

	/**
	 * Add method
	 * 
	 * @param portion1
	 * @param portion2
	 * @return
	 */
	@WebMethod(action = HOST + "/add", operationName = "add")
	public double add(@WebParam(name = "portion1") double portion1, @WebParam(name = "portion2") double portion2);

	/**
	 * Subtract method
	 * 
	 * @param portion1
	 * @param portion2
	 * @return
	 */
	@WebMethod(action = HOST + "/subtract", operationName = "subtract")
	public double subtract(@WebParam(name = "portion1") double portion1, @WebParam(name = "portion2") double portion2);

	/**
	 * Multiply method
	 * 
	 * @param factor1
	 * @param factor2
	 * @return
	 */
	@WebMethod(action = HOST + "/multiply", operationName = "multiply")
	public double multiply(@WebParam(name = "factor1") double factor1, @WebParam(name = "factor2") double factor2);
}
