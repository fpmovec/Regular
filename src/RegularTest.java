import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class RegularTest {

    @Test
    public void regularMatchTestOne() throws IOException {
         String testString = "123456";
         boolean expected = true;
         boolean actual = Regular.RegularMatch(testString);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void regularMatchTestTwo() throws IOException {
        String testString = "1.1.7E08";
        boolean expected = false;
        boolean actual = Regular.RegularMatch(testString);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void regularMatchTestThree() throws IOException {
        String testString = "!»№;%?*";
        boolean expected = false;
        boolean actual = Regular.RegularMatch(testString);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void regularMatchTestFour() throws IOException {
        String testString = "1.17E08";
        boolean expected = true;
        boolean actual = Regular.RegularMatch(testString);
        Assert.assertEquals(expected, actual);
    }
}