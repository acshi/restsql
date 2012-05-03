/* Copyright (c) restSQL Project Contributors. Licensed under MIT. */
package org.restsql.core;

/**
 * Exception is thrown when a request does not meet expectations.
 * 
 * @author Mark Sawers
 */
public class InvalidRequestException extends SqlResourceException {
	public static final String MESSSAGE_INSERT_MISSING_PARAMS = "Insert requests require parameters";
	public static final String MESSSAGE_UPDATE_MISSING_PARAMS = "Update requests require parameters";
	public static final String MESSAGE_SQLRESOURCE_REQUIRED = "Requests require SQL Resource name";
	public static final String MESSAGE_INVALID_PARAMS = "No valid parameters found";
	public static final String MESSAGE_LIMIT_REQUIRED = Request.PARAM_NAME_LIMIT + " parameter required";
	public static final String MESSAGE_OFFSET_REQUIRED = Request.PARAM_NAME_OFFSET + " parameter required";
	public static final String MESSAGE_READONLY_PARAM = "Readonly parameters cannot be written to";

	private static final long serialVersionUID = 1L;

	public InvalidRequestException(final String message) {
		super(message);
	}

	public InvalidRequestException(final Throwable cause) {
		super(cause);
	}
}
