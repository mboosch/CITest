import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCITest {

    @Test
    void addition() {

        //GIVEN
        int a = 4;
        int b = 2;

        //WHEN
        int actual = TestCI.addition(a, b);

        //THEN
        int expected = 6;
        assertEquals(expected, actual);
    }

}