package homework6;

import java.util.List;

public class ComparisonOfLists {
    private AverageValueOfList averageValueOfList;

    public ComparisonOfLists(AverageValueOfList averageValueOfList) {
        this.averageValueOfList = averageValueOfList;
    }
    public int compare(List<Integer> firstList, List<Integer> secondList){
        double firstListAverageValue=averageValueOfList.calculateAverageValue(firstList);
        double secondListAverageValue=averageValueOfList.calculateAverageValue(secondList);
        return Double.compare(firstListAverageValue,secondListAverageValue);
    }
}
