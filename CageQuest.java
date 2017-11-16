import java.util.Scanner;

class CageQuest
{
	static Scanner in = new Scanner(System.in);

	static String MARGIN = "     ";

	static String job;
	static String product;
	static String outfit;
	static String outfitadjective;
	static String name;
	static String drink;
	static String drinksize;
	static boolean gamewon;

	static char ask(String question)
	{
		System.out.print(question + " ");
		String answer = in.nextLine();
		return answer.toUpperCase().charAt(0);
	}

	static String shortanswerAsk(String question)
	{
		System.out.println(question + " ");
		String answer = in.nextLine();
		return answer;
	}

	static void splashscreen()
	{
		System.out.println(" #####  ####   ####  ######  ####  #    # #####  #### #####");
		System.out.println("#      #    # #      #      #    # #    # #     #       #  ");
		System.out.println("#      ###### #  ### ####   #  # # #    # ####   ###    #  ");
		System.out.println("#      #    # #    # #      #   ## #    # #         #   #  ");
		System.out.println(" ##### #    #  ####  ######  #####  ####  ##### ####    #  ");
		System.out.println("...........................................................");
		System.out.println("CageQuest 2K17 by Alex Vermillion                          ");
		System.out.print("\n\n");
		return;
	}

	static int newgame()
	{
		char startchoice = ask("Are you ready to start a new game? [y/n]");
		System.out.println();
		if (startchoice == 'Y')
		{
			splashscreen();
			return 0;
		}
		if (startchoice == 'N')
		{
			System.out.println("You probably shouldn't have started up the game then moron!");
			System.out.println();
			System.out.println("G O O D   B Y E");
			return 1;
		}
		else
		{
			System.out.println("Hmm...");
			System.out.println("I don't have any idea what you are trying to type!");
			System.out.println("...");
			System.out.println("No, really!");
			System.out.println("I'm not magic! I'm not an A.I.! I don't have a dictionary programmed in!");
			System.out.println("I just take the first character of your response and check if it is yes or no.");
			System.out.println("You really should be more careful in the future.");
			return 2;
		}
	}

	static int tutorial()
	{
		char tutorialchoice;
		tutorialchoice = ask("Would you like to view the tutorial? [y/n]");
		if (tutorialchoice == 'N')
		{
			return 0;
		}
		System.out.println("Hi!" + "I'm the tutorial guide. I'll teach you how to navigate CageQuest.");
		System.out.println("CageQuest is a text-based RPG adventure, or a tbRPGa. Allow me to explain.");
		System.out.println("All you are going to see here is text. You'll get some stuff to read, and then you'll type back");
		System.out.println("I'll give you some choices in brackets at the end, and you will type back ONE CHARACTER unless told otherwise.");
		System.out.println("Here is what the choices look like [a/b/c]");
		System.out.println("If you see a [y/n], you are being asked a yes or no question.");
		System.out.println("That's all I've got for you!");
		char tutorialexitchoice;
		tutorialexitchoice = ask("Are you ready to exit the tutorial? [y/n]");
		System.out.println();
		if (tutorialexitchoice == 'Y')
		{
			return 1;
		}
		else
		{
			return tutorial();
		}
	}

	static int morning(){
		System.out.println("BEEP BEEP BEEP BEEP BEEP BEEP");
		System.out.println("It's your alarm clock. You look over at it and read the time. It's 7:00.");
		System.out.println("You have to go to work. You can't quite remember your job.");
		char jobchoice;
		jobchoice = ask("Do you work as a sandwich maker, a burrito crafter, or as a gyro artist? [s/b/g]");
		if (jobchoice == 'S')
		{
			job = "sandwich maker";
			product = "sandwich";
		}
		if (jobchoice == 'B')
		{
			job = "burrito crafter";
			product = "burrito";
		}
		if (jobchoice == 'G')
		{
			job = "gyro artist";
			product = "gyro";
		}
		if ((jobchoice != 'S') && (jobchoice != 'B') && (jobchoice != 'G'))
		{
			job = "person who is unable to correctly type single character responses in text adventure games";
			product = "mistake";
		}
	    System.out.println("Now you remember! You love your job as the top " + job + " in all of New York City.");
	    System.out.println("You receive $10,000 US for every " + product + " that you make.");
	    System.out.println("Anyway, it's time to get to work. You step out of bed, fully dressed.");
	    outfit = shortanswerAsk("What are you wearing? [free response]");
	    System.out.println("But this isn't just any " + outfit + ", this one is special.");
	    outfitadjective = shortanswerAsk("What adjective would describe this outfit? [free response]");
	    name = shortanswerAsk("Last but not least, what is your name? [free response]");
	    System.out.println("To recap: You are " + name + ", NYC's most prestigious " + job + " and today you are wearing a(n) " + outfitadjective + " " + outfit);
	    char exitmorningchoice;
	    exitmorningchoice = ask("Is that all correct? [y/n]");
	    if (exitmorningchoice == 'Y')
	    {
			return 0;
	    }
	    else
	    {
			System.out.println("Here we go again...");
			return morning();
	    }
	}

	static void drinkaquisition()
	{
		System.out.println("You open your fridge and see you have some milk. On the counter is your coffee maker and some teabags.");
		System.out.println("Mmmm. So many choices. What should you take to drink on the way to work?");
		char drinkchoice;
		drinkchoice = ask("Will you drink milk, coffee, or tea? [m/c/t]");
		if (drinkchoice == 'M')
		{
			drink = "milk";
			drinksize = "glass";
		}
		if (drinkchoice == 'C')
		{
			drink = "coffee";
			drinksize = "mug";
		}
		if (drinkchoice == 'T')
		{
			drink = "tea";
			drinksize = "cup";
		}
		if ((drinkchoice != 'M') && (drinkchoice != 'C') && (drinkchoice != 'T'))
		{
			drink = "urine";
			drinksize = "keg";
		}
		System.out.println("Yum! Your favorite! You make up a " + drinksize + " of " + drink + " and get on your way.");
	}

	static void work()
	{
		System.out.println("You go to work and make a million dollars. When you get back to your vehicle, there is a note. The note reads:");
		System.out.println();
		System.out.println(MARGIN + "Dear " + name + ",");
		System.out.println(MARGIN + "     I've been watching you for some time now, and I think you are a really cool person. Let's go on a date.");
		System.out.println(MARGIN + "Meet me at the restaurant in town that serves your favorite beverages at 18:00 sharp. You don't need to dress up,");
		System.out.println(MARGIN + "just come in your work clothes.");
		System.out.println(MARGIN + "Love,");
		System.out.println(MARGIN + "Your Secret Admirer, NKC");
		System.out.println();
	}

	static void meetingtheman()
	{
		System.out.println("Glancing down at your watch you realize it is already 17:30! You only have 30 minutes to make it to the " + drink + " shop!");
		System.out.println("You decide to ignore the fact that this person is more of a stalker than a secret admirer, and you rush to the " + drink + " shop.");
		System.out.println("When you get there, it is 18:04. 'Wow, good first impression " + name + "', you sarcastically think to yourself.");
		System.out.println("You look around for a table occupied by a person who looks like they are watching for their date.");
		System.out.println("While searching, you spot a celebrity.");
		System.out.println(MARGIN + "\"Excuse me, Mr. Nicolas Cage, may I have your autograph?\" you find yourself asking.");
		System.out.println(MARGIN + "\"Ah, " + name + "! Sit down, sit down. Oh, you seem surprised. Yes, I am the one who invited you here,\" he responds.");
		System.out.println("You feel your heart race. Nicolas Cage, your favorite actor of all time has invited you on a date. You can't believe it.");
		System.out.println("Nicolas turns to you. \"I ordered you two " + drinksize + "s of " + drink + ", your favorite,\" he offers. I hope you like it.\"");
		System.out.println("Eagerly, you take a sip. \"Mmmmm,\" you say. \"It's delicious!\"");
		System.out.println("\"Thank you, I ordered it myself,\" he says, erupting into laughter at his own joke. \"Ooh, that's a good one!\" he finishes.");
	}

	static void date()
	{
		System.out.println("\"Anyway,\" he begins. \"I quite like your " + outfit + ", " + name + "; it's quite " + outfitadjective + ".\"");
		System.out.println("He orders you both meals that cost more than your lifetime salary. You enjoy yours very much.");
		System.out.println("When it comes time to pay, he smiles at the waitstaff and gives them more money than you thought was in circulation.");
		System.out.println("Nic offers to drive you home. He drives your car home using his mind. Soon, you arrive at your doorstep. You look at him.");
		System.out.println("\"Well,\" you begin. \"This is my stop,\" you say timidly.");
		System.out.println("Nicolas Cage looks at you. \"I know.\" he says.");
		if ((product == "mistake") || (drink == "urine"))
		{
			System.out.println("\"I should have told you. I'm a big fan of text adventure games that star myself as the main character\" he says.");
			System.out.println("\"And I don't think I can be with someone who is too dumb to input valid options when prompted.\"");
			System.out.println("Nicolas Cage punches you in the stomach.");
			System.out.println("He throws you out of his car, and drives away over your car. Your car is crushed to pieces.");
			System.out.println("As he leaves, he throws a match that lights your house on fire.");
			System.out.println("As he fades into the distance, he shouts to you:");
			System.out.println("\"Next time you play this game, try not to do so poorly!\" he yells.");
			System.out.println("Game over.");
			System.out.println("You lost! Ahaha what a loser!");
			gamewon = false;
		}
		else
		{
			System.out.println("Nicolas Cage pulls out a wedding ring.");
			System.out.println("\"Will you be my National Treasure?\" he asks.");
			System.out.println("You say yes. Obviously. You guys get married, and the pope does the ceremony.");
			System.out.println("Every celebrity ever is there, even the ones who are dead and also the ones from the future.");
			System.out.println("Nicolas Cage tells you he loves you, and you guys live forever in his mansion that is heaven because he is God.");
			System.out.println("Game over.");
			System.out.println("You win! Woohoo what a winner!");
			gamewon = true;
		}

	}

	public static void main(String args[])
	{
		if (newgame() != 0){ return;}
		tutorial();
		morning();
		drinkaquisition();
		work();
		meetingtheman();
		date();
		return;
	}
}
