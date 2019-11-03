import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void test(){
        int actualLength = "ABCD".length();
        int expectedLength=4;

        assertEquals(expectedLength,actualLength);

        //fail("Not yet implemented");
    }


}
