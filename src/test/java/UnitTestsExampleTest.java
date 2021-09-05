import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTestsExampleTest {

    @Test
    void addition() {
        UnitTestsExample unit=new UnitTestsExample();

        assertEquals(6,unit.addition(2,4));
    }

    @Test
    void concationateString() {

        UnitTestsExample unit=new UnitTestsExample();

        assertEquals("allanngetich",unit.concationateString("allan","ngetich"));
    }
}