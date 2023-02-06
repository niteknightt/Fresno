package niteknightt.cities.fresno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFresnoInfo {
    @Test
    public void testGetSomeInfo() {
        FresnoInfo fresnoInfo = new FresnoInfo();
        String info = fresnoInfo.getSomeInfo();
        Assertions.assertEquals("Fresno is a city in California", info);
    }
}
