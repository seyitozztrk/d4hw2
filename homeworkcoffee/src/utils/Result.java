package utils;

public class Result implements interfaces.Result {
	private boolean success;
	private String message;
	@Override
	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return success;
	}
	public Result(boolean success) {
		this.success = success;
	}
	
	
	public Result(Boolean success, String message) {
		this(success);
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
