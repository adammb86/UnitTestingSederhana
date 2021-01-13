import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathCobaTest {

    @Test
    void tambahBilTest() {
        MathCoba mathCoba = new MathCoba();
        mathCoba.a=10;
        mathCoba.b =20;
        Assertions.assertEquals(30,mathCoba.tambahBil());
    }
}