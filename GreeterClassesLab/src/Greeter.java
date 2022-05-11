
public class Greeter {
	private String greeting; //instance variable
	

	public String getGreeting() { // Getter
		return this.greeting;
	}
	

	public void setGreeting(String greeting) { // Setter
		this.greeting = greeting;
	}
	
	

	public Greeter(String greeting) { // Constructor
		this.greeting = greeting;
		
	}

	public String greet(String name) { // Method
		return  this.greeting + ", " +  name + "!";
	}
}
