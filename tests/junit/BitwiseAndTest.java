package junit;

import junit.framework.TestCase;
import pass.BitwiseAnd;

public class BitwiseAndTest extends TestCase {
    private BitwiseAnd bitwiseAnd;

    protected void setUp() throws Exception {
        super.setUp();
        bitwiseAnd = new BitwiseAnd();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testBitwiseAnd() {
        this.assertEquals(bitwiseAnd.and(42, 5), 0);
        this.assertEquals(bitwiseAnd.and(5, 42), 0);
        this.assertEquals(bitwiseAnd.and(128, 3), 0);
        this.assertEquals(bitwiseAnd.and(128, 128), 128);
    }
}