package homework6;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ConsoleViewTest {

    @Test
    void testRun(){
        ListOfNumbers listOfNumbers = mock(ListOfNumbers.class);
        ComparisonOfLists comparisonOfLists = mock(ComparisonOfLists.class);
        ConsoleView consoleView = new ConsoleView(comparisonOfLists, listOfNumbers);
        when(listOfNumbers.generateList()).thenReturn(Arrays.asList(1,2,3,4,5));
        when(comparisonOfLists.compare(listOfNumbers.generateList(),listOfNumbers.generateList())).thenReturn(1);
        assertThat(consoleView.run()).isEqualTo("Первый список имеет большее среднее значение");
        when(comparisonOfLists.compare(listOfNumbers.generateList(),listOfNumbers.generateList())).thenReturn(0);
        assertThat(consoleView.run()).isEqualTo("Средние значения равны");
        when(comparisonOfLists.compare(listOfNumbers.generateList(),listOfNumbers.generateList())).thenReturn(-1);
        assertThat(consoleView.run()).isEqualTo("Второй список имеет большее среднее значение");
    }

}