package junit;

import junit.framework.TestCase;
import pass.ShiftRight;


public class ShiftRightTest extends TestCase {
    private ShiftRight rightShift;
    
    protected void setUp() throws Exception {
        super.setUp();
        rightShift = new ShiftRight();
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testRightShift() {
        this.assertEquals(rightShift.rightShift(19, 2), 4);
        // this.assertEquals(remainder.remainder(42, 1), 0);
        // this.assertEquals(remainder.remainder(128, 3), 2);
    }
}