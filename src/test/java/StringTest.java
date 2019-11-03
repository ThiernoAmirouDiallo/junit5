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
        boolean result = "abcdefgh".contains("amir");

        assertEquals(false,result);
        assertFalse(result);

    }

}
