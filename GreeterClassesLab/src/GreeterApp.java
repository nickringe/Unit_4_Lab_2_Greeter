import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a greeting: ");
		String userGreeting = scnr.nextLine();
		
		Greeter newGreeting = new Greeter(userGreeting);
		SimonGreeter newSimon = new SimonGreeter(userGreeting);
		LoudGreeter newLoud = new LoudGreeter(userGreeting);
		HtmlGreeter newHtml = new HtmlGreeter(userGreeting);

		System.out.println("Enter a name: ");
		String userName = scnr.nextLine();
		System.out.println("How much volume to add? (1-10):");
		int userVolume = scnr.nextInt();
			for (int i = 0; i < userVolume; i ++) {
				newLoud.addVolume();
			}
		System.out.println(newGreeting.greet(userName));
		System.out.println(newSimon.greet(userName));
		System.out.println(newLoud.greet(userName));
		System.out.println(newHtml.greet(userName));
		scnr.close();
		
		
		//still prints out 1 less ! than needed, I think in the original
		//greeter class
		
		
		
	
		

		
		
		
	}


}
