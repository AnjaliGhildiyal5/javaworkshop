class Speaker {
    //method to speak a message
    public static void speak(String message) {
        System.out.println("Speaker says: "+message);
    }
    //overloaded method to speak a message with a volume
    public static void speak(String message, int volume) {
        System.out.println("Speaker says: "+message+ "at volume "+volume);
    }

    //overloaded method to speak a message in a specific language
    public static void speak(String message,String language) {
        System.out.println("Speaker says: "+message+ "in" + language);
    }

    
}

//calling above method in main class
public class MethodOverloading{
public static void main(String[] args) {
    Speaker.speak(" hello world ");

    Speaker.speak(" hello world ",5);

    Speaker.speak(" hello world "," English");
}
}