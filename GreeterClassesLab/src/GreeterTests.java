import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterTests {

	@Test
	void greeterTestName() {
		Greeter testName = new Greeter("Hello");
		assertEquals("Hello, Nick!", testName.greet("Nick"));
	}
	@Test
	void greeterTestGreeting() {
		Greeter testName = new Greeter("Hola");
		assertEquals("Hola, Nicolaus!", testName.greet("Nicolaus"));
	}

	@Test
	void simonGreeterTestName() {
		SimonGreeter testSimon = new SimonGreeter("Hey");
		assertEquals("Simon Says, \"Hey, Gary!\"", testSimon.greet("Gary"));
	}
	
	@Test
	void simonGreeterTestGreeting() {
		SimonGreeter testSimon = new SimonGreeter("Howdy");
		assertEquals("Simon Says, \"Howdy, Larry!\"", testSimon.greet("Larry"));
	}
	
	@Test
	void LoudGreeterTestNoVolume() {
		LoudGreeter testLoud = new LoudGreeter("Hey");
		assertEquals("Hey, Gary!!", testLoud.greet("Gary"));
	}
	
	@Test
	void LoudGreeterTestWithVolume() {
		LoudGreeter testLoud = new LoudGreeter("Hi");
		testLoud.addVolume(); 
		testLoud.addVolume();
		assertEquals("Hi, Mary!!!!", testLoud.greet("Mary"));
	}
	
	@Test
	void LoudGreeterTestWithVolume2() {
		LoudGreeter testLoud = new LoudGreeter("Hi");
		testLoud.addVolume(); 
		testLoud.addVolume();
		testLoud.addVolume();
		testLoud.addVolume();
		assertEquals("Hi, Mary!!!!!!", testLoud.greet("Mary"));
	}
	
	@Test
	void HtmlGreeterTestGreeting() {
		HtmlGreeter testHtml = new HtmlGreeter("Hi");
		assertEquals("<h1>Hi, Mary!</h1>", testHtml.greet("Mary"));
	}
	
	@Test
	void HtmlGreeterTestName() {
		HtmlGreeter testHtml = new HtmlGreeter("Hi");
		assertEquals("<h1>Hi, Sherry!</h1>", testHtml.greet("Sherry"));
	}
	
	@Test
	void HtmlGreeterTestTagName() {
		HtmlGreeter testHtml = new HtmlGreeter("Hi", "div");
		assertEquals("<div>Hi, Sherry!</div>", testHtml.greet("Sherry"));
	}
	
	@Test
	void HtmlGreeterTestContructorTagName() {
		HtmlGreeter testHtml = new HtmlGreeter("Hi");
		String generateGreeting = testHtml.greet("Larry");
		String actual = generateGreeting.substring(1,3);
		assertEquals("h1", actual);
	}
}
