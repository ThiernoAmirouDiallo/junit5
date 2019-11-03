import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void lengthBasic(){
        int actualLength = "ABCD".length();
        int expectedLength=4;

        assertEquals(expectedLength,actualLength);

        //fail("Not yet implemented");
    }

    @Test
    void toUpperCaseBasic()
    {
        String str = "abcd";
        String result =str.toUpperCase();
        assertEquals("ABCD",result);
        assertNotNull(result);
        //assertNull(result);
    }

    @Test
    void assertBooleans(){
        assertFalse("abcdefgh".contains("amir"));
    }

    @Test
    void arrayEquals() {
        String str = "montreal quebec ottawa";
        String[] actualResult = str.split(" ");
        String[] expectedResult = {"montreal", "quebec", "ottawa"};

        assertArrayEquals(expectedResult,actualResult);
    }

}
