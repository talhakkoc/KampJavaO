 package kodlama.io.northwind.core.utilities.results;

import lombok.*;


public class Result {
	
	private boolean success;
	private String message ; 
	
	public Result(boolean success) {
		this.success=success;
	}
	
	public Result (boolean success,String message) {
		this.success=success;
		this.message = message;
	}
	


}
