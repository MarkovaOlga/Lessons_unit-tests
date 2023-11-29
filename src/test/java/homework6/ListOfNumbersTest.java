package homework6;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class ListOfNumbersTest {

    @Test
    void testGenerateList(){
        ListOfNumbers listOfNumbers = new ListOfNumbers(4,0,20);
        List<Integer> list = listOfNumbers.generateList();
        assertThat(list.size()).isEqualTo(4);
    }

}