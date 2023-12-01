package Others.java.objetos;

import java.util.LinkedList;

public class Response {

	private boolean Success;
	private String Message;
	private LinkedList<String> Validation = new LinkedList<>();

	public Response() {

	}
	
	public Response(boolean Success, String Message) {
	      this.Success = Success;
	      this.Message = Message;
	  }

	public Response(boolean Success, String Message, LinkedList<String> Validation) {
		this.Success = Success;
		this.Message = Message;
		this.Validation = Validation;
	}

	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public LinkedList<String> getValidation() {
		return Validation;
	}

	public void setValidation(LinkedList<String> validation) {
		Validation = validation;
	}

	@Override
	public String toString() {
		return "Response [Success=" + Success + ", Message=" + Message + ", Validation=" + Validation + "]";
	}
	
	

}
