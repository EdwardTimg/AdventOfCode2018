import org.junit.Assert;
import org.junit.Test;

public class DayFiveTests {
    DayFive dayFive = new DayFive();
    @Test
    public void removePolymer(){
        Assert.assertTrue(dayFive.removePolymer("dabAcCaCBAcCcaDA")== 10);
    }

    @Test
    public void getShortestPolymer(){
        Assert.assertTrue(dayFive.getShortestPolymer("dabAcCaCBAcCcaDA")== 4);
    }


}
