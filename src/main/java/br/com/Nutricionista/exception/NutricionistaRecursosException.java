package br.com.Nutricionista.exception;

public class NutricionistaRecursosException extends Exception {

	private static final long serialVersionUID = -6235652631311879506L;

	
	public NutricionistaRecursosException() {
		super();
	}

	public NutricionistaRecursosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NutricionistaRecursosException(String message, Throwable cause) {
		super(message, cause);
	}

	public NutricionistaRecursosException(String message) {
		super(message);
	}

	public NutricionistaRecursosException(Throwable cause) {
		super(cause);
	}
	

}
