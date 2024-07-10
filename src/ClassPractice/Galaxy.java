package ClassPractice;

import javax.swing.*;

public class Galaxy extends Phone {
    public Galaxy (String user) {
        super(user);
    }

    public void printLogo() {
        System.out.println("*** 폰 켜지는 중 ***");
    }

    public void buy() {
        System.out.println(getUser() + "님이 삼송폰을 구매했습니다.");
    }

    public void turnOn() {
        System.out.println(getUser() + "님이 삼송폰을 켰습니다.");
        printLogo();
    }
}