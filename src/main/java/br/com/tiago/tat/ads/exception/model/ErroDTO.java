package br.com.tiago.tat.ads.exception.model;

public class ErroDTO extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ErroDTO(String message) {
		super(message);
	}

	public ErroDTO(String message, Throwable cause) {
		super(message, cause);
	}

}
