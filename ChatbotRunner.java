import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Akamai Wong, Donna Prince, Yoga Kanneboina
 * @version November 2019
 */
public class ChatbotRunner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Chatbot maggie = new Chatbot();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
