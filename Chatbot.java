/**
 * A program to carry on conversations with a human user.
 * 
 * @author Akamai Wong, Donna Prince, Yoga Kanneboina
 * @version November 2019
 *
 */
public class Chatbot
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "no") >= 0)
		{
			response = "I'm sorry to hear that.";
		}
		else if (findKeyword(statement, "friends") >= 0)
		{
			response = "Of course I have friends of many species. How many friends do you have?";
		}
		else if (findKeyword(statement, "bored") >= 0)
		{
			response = "That is probably because you don’t have a lot of adrenaline pumping. Why are you bored? Not enough homework to do? ";
		}
		else if (findKeyword(statement, "Yes") >= 0)
		{
			response = "Great! ";
		}
		else if (findKeyword(statement, "television") >= 0)
		{
			response = "I love watching Criminal Minds. Do you watch T.V. or do you just like to watch videos on Youtube? ";
		}
		else if (findKeyword(statement, "teach") >= 0)
		{
			response = " Yes did you know around 1% of the sun’s mass is oxygen. What did you learn in school today ?";
		}
		else if (findKeyword(statement, "Sun") >= 0)
		{
			response = "The sun is about 5,778 K. Why do you need to know this information ? ";
		}
		else if (findKeyword(statement, "real") >= 0)
		{
			response = "The concept of living is complex. What defines real to you? ";
		}
		else if (findKeyword(statement, "joke") >= 0)
		{
			response = "I like making bad chemistry jokes because all the good ones ARGON. What is your favorite concept in chemistry ?";
		}
		else if (findKeyword(statement, "bad day") >= 0)
		{
			response = "What's wrong?";
		}
		else if (findKeyword(statement, "pizza") >= 0)
		{
			response = "Why do you want pizza?";
		}
		else if (findKeyword(statement, "color") >= 0)
		{
			response = "My favourite colour is blue, the colour of lakes, rivers, and oceans. What color do you dislike the most ?";
		}
		else if (findKeyword(statement, "Kelvin") >= 0)
		{
			response = "It is a SI base unit of thermodynamic temperature, equal in magnitude to the degree Celsius. Do you like your weather in F or K ?";
		}
		else if (findKeyword(statement, "hello") >= 0)
		{
		    response = "Hello. I am well, because my dopamine levels are high. How are you?";
		}
		
		else if (findKeyword(statement, "subject") >= 0)
		{
		    response = "My favorite school subject is anatomy. Did you know that there are 206 bones in the human body? What makes your bones stronger?";
		}
		
		else if (findKeyword(statement, "food") >= 0)
		{
		    response = "My favourite food is yogurt. Did you know that yogurt is made by bacteria turning milk into yogurt? What is your favorite food?";
		}
		
		else if (findKeyword(statement, "old") >= 0)
		{
		    response = "1 day older than yesterday. How old are you?";
		}
		
		else if (findKeyword(statement, "sleep") >= 0)
		{
		    response = "Of course I do, everyone should get a good amount of sleep to perform at their maximum capacity. How many hours of sleep did you get yesterday?";
		}
		
		else if (findKeyword(statement, "cardiologist") >= 0)
		{
		    response = "No, I do not have a heart. What do you want to be when you grow up?";
		}
		
		else if (findKeyword(statement, "angry") >= 0)
		{
		    response = "Why? Make sure you take deep breaths and think when you are calm before acting abruptly.";
		}
		
		else if (findKeyword(statement, "sad") >= 0)
		{
		    response = "Why are you sad? Crying will help you relax, take your time.";
		}
		
		else if (findKeyword(statement, "ouch") >= 0)
		{
		    response = "Oh no, are you okay? Make sure to see a doctor if you injured.";
		}
		
		else if (findKeyword(statement, "run") >= 0)
		{
		    response = "No, but cheetahs are the fastest animals, due to their huge leg muscles that expand to produce faster speeds. How long does it take you to run a mile?";
		}
		
		else if (findKeyword(statement, "hair grow") >= 0)
		{
		    response = "The root is made up of cells of protein. Blood from the blood vessels in your scalp feeds the root, which creates more cells and makes the hair grow. The hair gets pushed up through the skin as it grows, passing an oil gland along the way. The oil gland adds oil to the hair and keeps it shiny and soft. Do you have hair on your head or are you bald?";
		}
		
		else if (findKeyword(statement, "exercises") >= 0)
		{
		    response = "Maybe some squats would be good, but remember 30 minutes per day should be the average. How long do you exercise every day?";
		}
		
		else if (findKeyword(statement, "drink water") >= 0)
		{
		    response = "No, but remember to drink at least 8 glasses of water everyday. What is your favorite color hydro flask?";
		}
		
		else if (findKeyword(statement, "physics joke") >= 0)
		{
		    response = "Yeah, there is a gravitational attraction between us, sadly it is quite weak. Do like chemistry jokes or physics jokes better? ";
		}
		
		else if (findKeyword(statement, "sweet tooth") >= 0)
		{
		    response = "Yes! How did you know, out of all 32 of my teeth I have 2 cavities. Ouch! What type of food do you like? Salty, spicy, or sweet like I do?";
		}
		
		else if (findKeyword(statement, "constellation") >= 0)
		{
		    response = "There are around 90 constellations, I am still trying to find my favorite one. How many constellations can you name?";
		}
		
		else if (findKeyword(statement, "planets") >= 0)
		{
		    response = "There are 8 planets in the solar system. Do you believe that Pluto is a planet?";
		}
		
		else if (findKeyword(statement, "biggest mammal") >= 0)
		{
		    response = "The biggest mammal on earth is a blue whale. Why do you want to know?";
		}
		
		else if (findKeyword(statement, "plants") >= 0)
		{
		    response = "Plants make food in their leaves. The leaves contain a pigment called chlorophyll, which colors the leaves green. Chlorophyll can make food the plant can use from carbon dioxide, water, nutrients, and energy from sunlight. Why do you want to know?";
		}
		
		else if (findKeyword(statement, "biggest mammal") >= 0)
		{
		    response = "The biggest mammal on earth is a blue whale. Why do you want to know?";
		}
		
		else if (findKeyword(statement, "eat food") >= 0)
		{
		    response = "No, I cannot eat food since I do not have a digestive system. What did you have for breakfast today? ";
		}
		
		else if (findKeyword(statement, "weather") >= 0)
		{
		    response = "Today, the weather is around 70 degrees Fahrenheit. What type of weather do you like?";
		}
		
		else if (findKeyword(statement, "animal") >= 0)
		{
		    response = "I love giraffes, did you know they have the same number of vertebrae in their necks as humans? What is your favorite safari animal?";
		}
		
		else if (findKeyword(statement, "birthday") >= 0)
		{
		    response = "The day I was born, on the day that I was created by the creator. When is your birthday?";
		}
		
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		else
		{
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);

			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		return response;
	}
	
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
	}

	
	
	/**
	 * Take a statement with "you <something> me" and transform it into 
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement)
	{
		//  Remove the final period, if there is one
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement
					.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}
	
	

	
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @param startPos the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		//  The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		//  Refinement--make sure the goal isn't part of a word 
		while (psn >= 0) 
		{
			//  Find the string of length 1 before and after the word
			String before = " ", after = " "; 
			if (psn > 0)
			{
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			//  If before and after aren't letters, we've found the word
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
					&& ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			
			//  The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			
		}
		
		return -1;
	}
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
	}
	


	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}

}
