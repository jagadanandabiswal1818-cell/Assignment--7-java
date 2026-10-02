package mypack;

public class test23{
    public void displayMessage() {
        System.out.println("Hello from the 'mypack' package!");
    }

    public static void main(String[] args) {
        Greeting obj = new Greeting();
        obj.displayMessage();
    }
}