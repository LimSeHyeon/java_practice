package MVCPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculateView {
    public ArrayList<Integer> input() {
        ArrayList<Integer> arr = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수 입력 : ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        arr.add(int1);
        arr.add(int2);
        return arr;
    }

    public void output(int result) {
        System.out.println("Result : " + result);
    }
}