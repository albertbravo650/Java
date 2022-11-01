import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String nameGreeting = String.format("Hello, %s. Lovely to see you.", name);
        return nameGreeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String dateMessage = ("It is currently " + date + ".");
        return dateMessage;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String response = "";
        if(conversation.indexOf("Alexis") != -1) {
            response = "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(conversation.indexOf("Alfred") != -1) {
            response = "At your service. As you wish, naturally.";
        }
        else {
            response = "Right. And with that I shall retire.";
        }
        return response;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

