package Utils;

public class ControllerNotFoundException extends RuntimeException {
	
	public ControllerNotFoundException(String message) {
		super(message);
	}
}