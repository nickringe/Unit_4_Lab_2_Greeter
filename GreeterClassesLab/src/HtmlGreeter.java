
public class HtmlGreeter extends Greeter {
	
	private String tagName;
	
	public HtmlGreeter(String greeting) {
		super(greeting);
		this.tagName = "h1";
		setGreeting(greeting);
	}
	
	public HtmlGreeter(String greeting, String tagName) {
		super(greeting);
		setGreeting(greeting);
		this.tagName = tagName;
	}
	
	@Override
	public String greet(String name) {
		return "<" + tagName + ">" + this.getGreeting() + ", " + name + "!</" + tagName + ">";
	}

}
