package com.book.utilities;

import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.book.constants.CommonExceptionConstants;
import com.book.constants.BooksExceptionConstants;
import com.book.exception.ProductException;

@RestControllerAdvice
public class ExceptionControllerAdvice  {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment environment;

	/**
	 * Exception handler for general exception "Exception".
	 * 
	 * @param exception
	 * @return the error information with error code and error message
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInfo> generalExceptionHandler(Exception ex) {

		logger.error(ex.getMessage(), ex);

		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		errorInfo.setErrorMsg(environment.getProperty(CommonExceptionConstants.GENERAL_ERROR.toString()));

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorInfo);
	}

	/**
	 * Exception handler for InfyTelException.
	 *
	 * @param exception
	 * @return the error information with error code and error message
	 */
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorInfo> mCartExceptionHandler(ProductException ex) {

		logger.error(ex.getMessage(), ex);

		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		errorInfo.setErrorMsg(environment.getProperty(ex.getMessage()));

		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	}


	/**
	 * Exception handler for MissingServletRequestParameterException.
	 *
	 * @param exception
	 * @return the error information with error code and error message
	 */
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ResponseEntity<ErrorInfo> requestParameterExceptionHandler(MissingServletRequestParameterException ex) {

		logger.error(ex.getMessage(), ex);

		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		errorInfo.setErrorMsg(ex.getMessage()+" "+environment.getProperty(CommonExceptionConstants.INPUT_PARAM_MISSING.toString()) );

		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	}

	
	/**
	 * Exception handler for MethodArgumentNotValidException and
	 * ConstraintViolationException.
	 *
	 * @param exception
	 * @return the error information with error code and error message
	 */
	@ExceptionHandler({ MethodArgumentNotValidException.class, ConstraintViolationException.class })
	public ResponseEntity<ErrorInfo> exceptionHandler(Exception ex) {
		
		logger.error(ex.getMessage(), ex);

		String errorMsg;

		if (ex instanceof MethodArgumentNotValidException) {
			MethodArgumentNotValidException manve = (MethodArgumentNotValidException) ex;
			errorMsg = manve.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage())
					.collect(Collectors.joining(", "));
		} else {
			ConstraintViolationException cve = (ConstraintViolationException) ex;

			errorMsg = cve.getConstraintViolations().stream().map(x -> x.getMessage())
					.collect(Collectors.joining(", "));
		}

		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		errorInfo.setErrorMsg(errorMsg);

		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * Exception handler for InfyTelException.
	 *
	 * @param exception
	 * @return the error information with error code and error message
	 */
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorInfo> noHandlerFoundException(Exception ex) {

		logger.error(ex.getMessage(), ex);

		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.NOT_FOUND.value());
		errorInfo.setErrorMsg(environment.getProperty(CommonExceptionConstants.NO_RESOURCE_FOUND.toString()));

		return new ResponseEntity<>(errorInfo, HttpStatus.NOT_FOUND);
	}

}
