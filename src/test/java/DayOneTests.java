import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayOneTests {
    DayOne dayOne = new DayOne();
    @Test
    public void finalFrequency(){
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(+1, -2, +3, +1));
        Assert.assertTrue(dayOne.finalFrequency(list)==3);
    }

    @Test
    public void frecquencyThatOccursTwice(){
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(+1, -2, +3, +1));
        Assert.assertTrue(dayOne.frecquencyThatOccursTwice(list)==2);
    }
}
