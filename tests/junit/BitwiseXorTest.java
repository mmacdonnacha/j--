package junit;

import junit.framework.TestCase;
import pass.BitwiseXor;

public class BitwiseXorTest extends TestCase {
    private BitwiseXor bitwiseXor;

    protected void setUp() throws Exception {
        super.setUp();
        bitwiseXor = new BitwiseXor();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testBitwiseOr() {
        this.assertEquals(bitwiseXor.xor(42, 5), 47);
        this.assertEquals(bitwiseXor.xor(5, 42), 47);
        this.assertEquals(bitwiseXor.xor(128, 3), 131);
        this.assertEquals(bitwiseXor.xor(128, 128), 0);
    }
}