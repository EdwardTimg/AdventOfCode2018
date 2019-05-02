import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayThreeTests {
    DayThree dayThree = new DayThree();
    @Test
    public void numberOfOverlaps(){
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("#1 @ 1,3: 4x4", "#2 @ 3,1: 4x4" , "#3 @ 5,5: 2x2"));
        Assert.assertTrue(dayThree.numberOfOverlaps(list)== 4);
    }
}
