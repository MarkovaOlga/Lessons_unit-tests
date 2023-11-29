package homework6;

public class Main {
    public static void main(String[] args) {
        ComparisonOfLists comparisonOfLists = new ComparisonOfLists(new AverageValueOfList());
        ListOfNumbers listOfNumbers = new ListOfNumbers(3, 0, 10);
        ConsoleView consoleView = new ConsoleView(comparisonOfLists, listOfNumbers);
        consoleView.run();
    }
}
