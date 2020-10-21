package cn.xpbootcamp.locker;

import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;

import java.math.BigDecimal;
import java.util.Calendar;

import static junit.framework.TestCase.assertEquals;

public class DemoTest {
    public void testDisplayCurrentTime_exception()
            throws Exception {
        // Fixture setup
        //   Define and instantiate Test Stub
        TimeProvider testStub = new TimeProvider()
        { // Anonymous inner Test Stub
            public Calendar getTime() throws TimeProviderEx {
                throw new TimeProviderEx("Sample");
            } };
        //
        TimeDisplay sut = new TimeDisplay();
        sut.setTimeProvider(testStub);
        // Exercise SUT
        String result = sut.getCurrentTimeAsHtmlFragment();
        // Verify direct output
        String expectedTimeString =
                "<span class=\"error\">Invalid Time</span>";
        assertEquals("Exception", expectedTimeString, result);
    }
}
