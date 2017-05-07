#include <iostream>
#include <string>
#include <cctype>
using namespace std;

#define MARGIN "     "

string job;
string product;
string outfit;
string outfitadjective;
string name;
string drink;
string drinksize;
bool gamewon;

char ask(string question){
	string answer;
	cout << question << " ";
	getline(cin, answer);
	return toupper(answer[0]);
}

string ask(string question, bool shortanswer){
	string answer;
	cout << question << " ";
	getline(cin, answer);
	return answer;
}

void splashscreen(){
	cout << " #####  ####   ####  ######  ####  #    # #####  #### #####" << endl;
	cout << "#      #    # #      #      #    # #    # #     #       #  " << endl;
	cout << "#      ###### #  ### ####   #  # # #    # ####   ###    #  " << endl;
	cout << "#      #    # #    # #      #   ## #    # #         #   #  " << endl;
	cout << " ##### #    #  ####  ######  #####  ####  ##### ####    #  " << endl;
	cout << "..........................................................." << endl;
	cout << "CageQuest 2K17 by Alex Vermillion                          " << endl;
	cout << endl << endl;
}

int newgame(){
	char startchoice = ask("Are you ready to start a new game? [y/n]");
	cout << endl;
	if (startchoice == 'Y'){
		splashscreen();
		return 0;
	}
	if (startchoice == 'N'){
		cout << "You probably shouldn't have started up the game then moron!" << endl;
		cout << endl;
		cout << "G O O D   B Y E" << endl;
		return 1;
	}
	else {
		cout << "Hmm..." << endl;
		cout << "I don't have any idea what you are trying to type!" << endl;
		cout << "." << "." << "." << endl;
		cout << "No, really!" << endl;
		cout << "I'm not magic! I'm not an A.I.! I don't have a dictionary programmed in!" << endl;
		cout << "I just take the first character of your response and check if it is yes or no." << endl;
		cout << "You really should be more careful in the future." << endl;
	}
}

int tutorial(){
	char tutorialchoice;
	tutorialchoice = ask("Would you like to view the tutorial? [y/n]");
	if (tutorialchoice == 'N'){
		return 0;
	}
	cout << "Hi!" << endl << "I'm the tutorial guide. I'll teach you how to navigate CageQuest." << endl;
	cout << "CageQuest is a text-based RPG adventure, or a tbRPGa. Allow me to explain." << endl;
	cout << "All you are going to see here is text. You'll get some stuff to read, and then you'll type back" << endl;
	cout << "I'll give you some choices in brackets at the end, and you will type back ONE CHARACTER unless told otherwise." << endl;
	cout << "Here is what the choices look like [a/b/c]" << endl;
	cout << "If you see a [y/n], you are being asked a yes or no question." << endl;
	cout << "That's all I've got for you!" << endl;
	char tutorialexitchoice;
	tutorialexitchoice = ask("Are you ready to exit the tutorial? [y/n]");
	cout << endl;
	if (tutorialexitchoice == 'Y'){
		return 1;
	}
	else {
		return tutorial();
	}
}

int morning(){
    cout << "BEEP BEEP BEEP BEEP BEEP BEEP" << endl;
    cout << "It's your alarm clock. You look over at it and read the time. It's 7:00." << endl;
    cout << "You have to go to work. You can't quite remember your job." << endl;
    char jobchoice;
    jobchoice = ask("Do you work as a sandwich maker, a burrito crafter, or as a gyro artist? [s/b/g]");
    if (jobchoice == 'S'){
		job = "sandwich maker";
		product = "sandwich";
	}
    if (jobchoice == 'B'){
		job = "burrito crafter";
		product = "burrito";
	}
    if (jobchoice == 'G'){
		job = "gyro artist";
		product = "gyro";
	}
    if ((jobchoice != 'S') and (jobchoice != 'B') and (jobchoice != 'G')) {
		job = "person who is unable to correctly type single character responses in text adventure games";
		product = "mistake";
	}
    cout << "Now you remember! You love your job as the top " << job << " in all of New York City." << endl;
    cout << "You receive $10,000 US for every " << product << " that you make." << endl;
    cout << "Anyway, it's time to get to work. You step out of bed, fully dressed." << endl;
    outfit = ask("What are you wearing? [free response]",1);
    cout << "But this isn't just any " << outfit << ", this one is special." << endl;
    outfitadjective = ask("What adjective would describe this outfit? [free response]",1);
    name = ask("Last but not least, what is your name? [free response]",1);
    cout << "To recap: You are " << name << ", NYC's most prestigious " << job << " and today you are wearing a(n) " << outfitadjective << " " << outfit <<endl;
    char exitmorningchoice;
    exitmorningchoice = ask("Is that all correct? [y/n]");
    if (exitmorningchoice == 'Y'){
		return 0;
    }
    else {
		cout << "Here we go again..." << endl;
		return morning();
    }
}

int drinkaquisition(){
	cout << "You open your fridge and see you have some milk. On the counter is your coffee maker and some teabags." << endl;
	cout << "Mmmm. So many choices. What should you take to drink on the way to work?" << endl;
	char drinkchoice;
	drinkchoice = ask("Will you drink milk, coffee, or tea? [m/c/t]");
	if (drinkchoice == 'M'){
		drink = "milk";
		drinksize = "glass";
	}
	if (drinkchoice == 'C'){
		drink = "coffee";
		drinksize = "mug";
	}
	if (drinkchoice == 'T'){
		drink = "tea";
		drinksize = "cup";
	}
	if ((drinkchoice != 'M') and (drinkchoice != 'C') and (drinkchoice != 'T')){
		drink = "urine";
		drinksize = "keg";
	}
	cout << "Yum! Your favorite! You make up a " << drinksize << " of " << drink << " and get on your way." << endl;
}

int work(){
	cout << "You go to work and make a million dollars. When you get back to your vehicle, there is a note. The note reads:" << endl;
	cout << endl;
	cout << MARGIN << "Dear " << name << "," << endl;
	cout << MARGIN << "     I've been watching you for some time now, and I think you are a really cool person. Let's go on a date." << endl;
	cout << MARGIN << "Meet me at the restaurant in town that serves your favorite beverages at 18:00 sharp. You don't need to dress up," << endl;
	cout << MARGIN << "just come in your work clothes." << endl;
	cout << MARGIN << "Love," << endl;
	cout << MARGIN << "Your Secret Admirer, NKC" << endl;
	cout << endl;
}

int meetingtheman(){
	cout << "Glancing down at your watch you realize it is already 17:30! You only have 30 minutes to make it to the " << drink << " shop!" << endl;
	cout << "You decide to ignore the fact that this person is more of a stalker than a secret admirer, and you rush to the " << drink << " shop." << endl;
	cout << "When you get there, it is 18:04. 'Wow, good first impression " << name << "', you sarcastically think to yourself." << endl;
	cout << "You look around for a table occupied by a person who looks like they are watching for their date." << endl;
	cout << "While searching, you spot a celebrity." << endl;
	cout << MARGIN << "\"Excuse me, Mr. Nicolas Cage, may I have your autograph?\" you find yourself asking." << endl;
	cout << MARGIN << "\"Ah, " << name << "! Sit down, sit down. Oh, you seem surprised. Yes, I am the one who invited you here,\" he responds." << endl;
	cout << "You feel your heart race. Nicolas Cage, your favorite actor of all time has invited you on a date. You can't believe it." << endl;
	cout << "Nicolas turns to you. \"I ordered you two " << drinksize << "s of " << drink << ", your favorite,\" he offers. I hope you like it.\"" << endl;
	cout << "Eagerly, you take a sip. \"Mmmmm,\" you say. \"It's delicious!\"" << endl;
	cout << "\"Thank you, I ordered it myself,\" he says, erupting into laughter at his own joke. \"Ooh, that's a good one!\" he finishes." << endl;
}

int date(){
	cout << "\"Anyway,\" he begins. \"I quite like your " << outfit << ", " << name << "; it's quite " << outfitadjective << ".\"" << endl;
	cout << "He orders you both meals that cost more than your lifetime salary. You enjoy yours very much." << endl;
	cout << "When it comes time to pay, he smiles at the waitstaff and gives them more money than you thought was in circulation." << endl;
	cout << "Nic offers to drive you home. He drives your car home using his mind. Soon, you arrive at your doorstep. You look at him." << endl;
	cout << "\"Well,\" you begin. \"This is my stop,\" you say timidly." << endl;
	cout << "Nicolas Cage looks at you. \"I know.\" he says." << endl;
	if ((product == "mistake") or (drink == "urine")){
		cout << "\"I should have told you. I'm a big fan of text adventure games that star myself as the main character\" he says." << endl;
		cout << "\"And I don't think I can be with someone who is too dumb to input valid options when prompted.\"" << endl;
		cout << "Nicolas Cage punches you in the stomach." << endl;
		cout << "He throws you out of his car, and drives away over your car. Your car is crushed to pieces." << endl;
		cout << "As he leaves, he throws a match that lights your house on fire." << endl;
		cout << "As he fades into the distance, he shouts to you:" << endl;
		cout << "\"Next time you play this game, try not to do so poorly!\" he yells." << endl;
		cout << "Game over." << endl;
		cout << "You lost! Ahaha what a loser!" << endl;
		gamewon = false;
	}
	else {
		cout << "Nicolas Cage pulls out a wedding ring." << endl;
		cout << "\"Will you be my National Treasure?\" he asks." << endl;
		cout << "You say yes. Obviously. You guys get married, and the pope does the ceremony." << endl;
		cout << "Every celebrity ever is there, even the ones who are dead and also the ones from the future." << endl;
		cout << "Nicolas Cage tells you he loves you, and you guys live forever in his mansion that is heaven because he is God." << endl;
		cout << "Game over." << endl;
		cout << "You win! Woohoo what a winner!" << endl;
		gamewon = true;
	}

}

int main()
{
	if (newgame() != 0){ return 1;}
	tutorial();
	morning();
	drinkaquisition();
	work();
	meetingtheman();
	date();
	return gamewon;
}
