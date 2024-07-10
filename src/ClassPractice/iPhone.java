package ClassPractice;

import javax.swing.*;

public class iPhone extends Phone {
    public iPhone (String user) {
        super(user);
    }

    public void printLogo() {
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }

    public void buy() {
        System.out.println(getUser() + "님이 애플폰을 구매했습니다.");
    }

    public void turnOn() {
        System.out.println(getUser() + "님이 애플폰을 켰습니다.");
        printLogo();
    }
}