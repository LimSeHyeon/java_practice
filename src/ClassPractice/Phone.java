package ClassPractice;

public abstract class Phone {
    private String user;

    public Phone(String user) {
        this.user = user;
    }

    abstract void printLogo();
    abstract void buy();
    abstract void turnOn();

    public String getUser() {
        return user;
    }
}