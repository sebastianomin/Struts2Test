
public class TestAction {
	
	String message;
	
	
	
	public String execute() {
		System.out.println("execute() method called");
		message="ERROR Message";
		return "error";
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
