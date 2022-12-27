import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFresnoMain {
    @Test
    public void TestCountLetters() {
        String text = "abcdefghijkl";
        int numLetters = text.length();
        int testValue = FresnoMain.countLetters(text);
        Assertions.assertEquals(numLetters, testValue);
    }
}
