
public class LoudGreeter extends Greeter {
	
	private String extra = "!!";

	public LoudGreeter(String greeting) {
		super(greeting);
	}
	
	public void addVolume()	{
		this.extra = extra + "!";
	}
	
	@Override
	public String greet(String name) {
		return this.getGreeting() + ", " + name + extra;
	}

}
