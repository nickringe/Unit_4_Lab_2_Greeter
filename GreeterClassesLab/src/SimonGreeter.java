
public class SimonGreeter extends Greeter {

	public SimonGreeter(String greeting) {
		super(greeting);

	}

	@Override
	public String greet(String name) {
		
		return "Simon Says, \"" + this.getGreeting()  + ", " + name + "!\"";
	}
}
