package MVCPractice;

import java.util.ArrayList;

public class CalculateService {
    public int add(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
