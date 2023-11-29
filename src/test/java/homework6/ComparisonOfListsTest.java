package homework6;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;

class ComparisonOfListsTest {
    @Test
    void testCompare(){
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        AverageValueOfList averageValueOfList = mock(AverageValueOfList.class);
        when(averageValueOfList.calculateAverageValue(firstList)).thenReturn(3.0);
        when(averageValueOfList.calculateAverageValue(secondList)).thenReturn(8.0);

        ComparisonOfLists comparisonOfLists = new ComparisonOfLists(averageValueOfList);
        assertThat(comparisonOfLists.compare(firstList,secondList)).isLessThan(0);
        assertThat(comparisonOfLists.compare(secondList,firstList)).isGreaterThan(0);
        verify(averageValueOfList,times(2)).calculateAverageValue(firstList);
        verify(averageValueOfList,times(2)).calculateAverageValue(secondList);

    }

}