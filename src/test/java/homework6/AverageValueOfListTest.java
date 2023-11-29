package homework6;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class AverageValueOfListTest {
    @Test
    void testCalculateAverageValue(){
        AverageValueOfList averageValueOfList = new AverageValueOfList();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        assertThat(averageValueOfList.calculateAverageValue(list)).isEqualTo(3);
    }
}