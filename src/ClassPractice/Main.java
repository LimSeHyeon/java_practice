package ClassPractice;

public class Main {
    public static void main(String[] args) {
        iPhone iphone15 = new iPhone("잡스");
        iphone15.buy();
        iphone15.turnOn();
        System.out.println();
        Galaxy galaxy24 = new Galaxy("재용");
        galaxy24.buy();
        galaxy24.turnOn();
    }
}