import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringTest {

    @BeforeAll
    static void beforAll() {
        System.out.println("Initializing DB connetion");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Closing DB connetion");
    }

    @BeforeEach
        //Befor in JUnit 4
    void beforEach(TestInfo info) {
        System.out.println("Initializing test data for : " + info.getDisplayName());
    }

    @AfterEach
        //After in JUnit4
    void AfterEach(TestInfo info) {
        System.out.println("Cleaning test data for : " + info.getDisplayName());
    }

    @Test
    void lengthBasic() {
        int actualLength = "ABCD".length();
        int expectedLength = 4;

        assertEquals(expectedLength, actualLength);

        //fail("Not yet implemented");
    }

    @Test
    void toUpperCaseBasic() {
        String str = "abcd";
        String result = str.toUpperCase();
        assertEquals("ABCD", result);
        assertNotNull(result);
        //assertNull(result);
    }

    @Test
    void assertBooleans() {
        assertFalse("abcdefgh".contains("amir"));
    }

    @Test
    void arrayEquals() {
        String str = "montreal quebec ottawa";
        String[] actualResult = str.split(" ");
        String[] expectedResult = {"montreal", "quebec", "ottawa"};

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("When length is null, throw an exception")
    void lengthException() {
        String str = null;

        assertThrows(NullPointerException.class, () -> {
            str.length();
        });
    }

    @Test
    void lengthGreaterThanZero() {
        assertTrue("ABC".length() > 0);
        assertTrue("AB".length() > 0);
        assertTrue("A".length() > 0);
        assertTrue("ABCD".length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABC", "AB", "A", "ABCDE"})
    void lengthGreaterThanZeroParameterized(String src) {
        assertTrue(src.length() > 0);
    }
}
