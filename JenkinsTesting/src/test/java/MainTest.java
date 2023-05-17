import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void liczTest() {
    Main main = new Main();
    assertEquals(10, main.licz(5,5));
    }
}