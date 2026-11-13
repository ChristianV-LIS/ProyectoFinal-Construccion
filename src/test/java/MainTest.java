import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void sumarDosPositivos() {
        assertEquals(5, Main.sumar(2, 3));
    }

    @Test
    void sumarConNegativos() {
        assertEquals(-1, Main.sumar(2, -3));
        assertEquals(-5, Main.sumar(-2, -3));
    }

    @Test
    void sumarConCero() {
        assertEquals(7, Main.sumar(7, 0));
        assertEquals(0, Main.sumar(0, 0));
    }
}
