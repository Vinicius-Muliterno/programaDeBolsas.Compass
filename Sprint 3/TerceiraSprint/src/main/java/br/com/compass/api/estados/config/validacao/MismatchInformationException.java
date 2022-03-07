package br.com.compass.api.estados.config.validacao;

public class MismatchInformationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MismatchInformationException() {
		super("Data de fundação e tempo desde a fundação estão erradas.");
	}
}
