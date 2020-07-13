package junit;

import junit.framework.TestCase;
import pass.BitwiseOr;

public class BitwiseOrTest extends TestCase {
    private BitwiseOr bitwiseOr;

    protected void setUp() throws Exception {
        super.setUp();
        bitwiseOr = new BitwiseOr();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testBitwiseOr() {
        this.assertEquals(bitwiseOr.or(42, 5), 47);
        this.assertEquals(bitwiseOr.or(5, 42), 47);
        this.assertEquals(bitwiseOr.or(128, 3), 131);
    }
}