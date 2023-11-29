package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOfNumbers {
    private Random rnd = new Random();
    private int size;
    private int min;
    private int max;
    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public ListOfNumbers(int size, int min, int max) {
        this.size = size;
        this.min = min;
        this.max = max;
    }
    public List<Integer> generateList(){
        List list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(min, max));
        }
        return list;
    }
}
