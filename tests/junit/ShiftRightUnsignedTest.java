package junit;

import junit.framework.TestCase;
import pass.ShiftRightUnsigned;


public class ShiftRightUnsignedTest extends TestCase {
    private ShiftRightUnsigned rightShiftLogical;
    
    protected void setUp() throws Exception {
        super.setUp();
        rightShiftLogical = new ShiftRightUnsigned();
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testShiftLeft() {
        this.assertEquals(rightShiftLogical.shiftRightUnsigned(19, 2), 4);
        this.assertEquals(rightShiftLogical.shiftRightUnsigned(42, 3), 5);
        // this.assertEquals(remainder.remainder(128, 3), 2);
    }
}