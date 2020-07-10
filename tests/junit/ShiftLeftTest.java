package junit;

import junit.framework.TestCase;
import pass.ShiftLeft;


public class ShiftLeftTest extends TestCase {
    private ShiftLeft leftshift;
    
    protected void setUp() throws Exception {
        super.setUp();
        leftshift = new ShiftLeft();
    }
    
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testShiftLeft() {
        this.assertEquals(leftshift.shiftLeft(19, 2), 76);
        // this.assertEquals(remainder.remainder(42, 1), 0);
        // this.assertEquals(remainder.remainder(128, 3), 2);
    }
}