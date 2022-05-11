import java.util.ArrayList;
import java.util.List;
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
		
		//extended challenge 1:
		System.out.println("Which type of HTML tag would you like to use?:");
		String userHtml = scnr.next();
		HtmlGreeter newHtmlChoice = new HtmlGreeter(userGreeting, userHtml);
		System.out.println(newHtmlChoice.greet(userName));
		
		//extended challenge 2:
		List<Greeter> greeterList = new ArrayList<>();
		greeterList.add(newGreeting);
		greeterList.add(newLoud);
		greeterList.add(newSimon);
		greeterList.add(newHtml);
		greeterList.add(newHtmlChoice);
		for (Greeter b: greeterList) {
			System.out.println(b.greet(userName));
		}
		
		scnr.close();
				
		
	}
	


}
