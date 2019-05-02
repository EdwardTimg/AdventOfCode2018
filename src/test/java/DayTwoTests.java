import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayTwoTests {
    DayTwo dayTwo = new DayTwo();
    @Test
    public void checkSumBoxes(){
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("abcdef","bababc","abbcde","abcccd", "aabcdd","abcdee","ababab"));
        Assert.assertTrue(dayTwo.checkSumBoxes(list)==12);
    }

    @Test
    public void findSimulareString(){
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz"));
        Assert.assertEquals("fgij", dayTwo.findSimulareString(list));
    }
}
