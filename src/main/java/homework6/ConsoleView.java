package homework6;

import java.util.List;

public class ConsoleView {
    private ComparisonOfLists comparisonOfLists;
    private ListOfNumbers listOfNumbers;

    public ConsoleView(ComparisonOfLists comparisonOfLists, ListOfNumbers listOfNumbers) {
        this.comparisonOfLists = comparisonOfLists;
        this.listOfNumbers = listOfNumbers;

    }

    public String run() {
        List<Integer> firstList = listOfNumbers.generateList();
        //System.out.println(firstList.toString());
        List<Integer> secondList = listOfNumbers.generateList();
        //System.out.println(secondList.toString());
        int compareValue = comparisonOfLists.compare(firstList, secondList);
        String result = null;
        if (compareValue > 0) {
            result = "Первый список имеет большее среднее значение";
        }
        if (compareValue < 0) {
            result = "Второй список имеет большее среднее значение";
        }
        if (compareValue == 0) {
            result = "Средние значения равны";
        }
        //System.out.println(result);
        return result;
    }
}

