package homework6;

import java.util.List;

public class AverageValueOfList {
    public double calculateAverageValue(List<Integer> list){
        int sum = 0;
        for (int number: list) {
            sum+= number;
        }
        double averageValue = sum/list.size();
        return averageValue;
    }
}
