package br.com.leovieira.dscommerce.services.exceptions;

@SuppressWarnings("serial")
public class ForbiddenException extends RuntimeException {
	public ForbiddenException(String msg) {
		super(msg);
	}
}
