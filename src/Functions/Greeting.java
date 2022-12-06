package Functions;

public class Greeting {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        String naam = "Shivanand";
        String personalized = myGreet(naam);
        System.out.println(personalized);


    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }

}
