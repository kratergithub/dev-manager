package app.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class FieldMissingException extends RuntimeException {

	public FieldMissingException() {
		super();
	}

	public FieldMissingException(String message, Throwable cause) {
		super(message, cause);
	}

	public FieldMissingException(String message) {
		super(message);
	}

	public FieldMissingException(Throwable cause) {
		super(cause);
	}

}
