package homework6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ComparisonOfListsTest02 {
    private ListOfNumbers listOfNumbers;
    private ComparisonOfLists comparisonOfLists;

    @BeforeEach
    void setup(){
        listOfNumbers =new ListOfNumbers(3,9,10);
        AverageValueOfList averageValueOfList = new AverageValueOfList();
        comparisonOfLists = new ComparisonOfLists(averageValueOfList);
    }

    @Test
    void testCompareLists(){
        List<Integer> firstList = listOfNumbers.generateList();
        listOfNumbers.setMin(10);
        listOfNumbers.setMax(20);
        List<Integer> secondList = listOfNumbers.generateList();
        assertThat(comparisonOfLists.compare(firstList,secondList)).isLessThan(0);
    }

    @Test
    void testThanSizeIsDifferent(){
        List<Integer> firstList = listOfNumbers.generateList();
        listOfNumbers.setSize(5);
        List<Integer> secondList = listOfNumbers.generateList();
        assertThat(comparisonOfLists.compare(firstList,secondList)).isEqualTo(0);
    }
}