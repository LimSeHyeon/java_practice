package MVCPractice;

import java.util.ArrayList;

public class Controller {
    public void calculate() {
        CalculateService calculateService = new CalculateService();
        CalculateView calculateView = new CalculateView();

        ArrayList<Integer> arr = calculateView.input();
        int value = calculateService.add(arr);
        calculateView.output(value);

    }

}
