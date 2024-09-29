import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Week2.example_exersice.Aditional.Elf;

public class ElfTest {

    private Elf elf;

    @BeforeEach
    public void setUp() {
        elf = new Elf(100, 50, 3, 10);
    }

    @Test
    public void testGetSpeed() {
        assertEquals(10, elf.getSpeed());
    }

    @Test
    public void testSetSpeed() {
        elf.setSpeed(20);
        assertEquals(20, elf.getSpeed());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, elf.getHealth());
    }

    @Test
    public void testSetHealth() {
        elf.setHealth(80);
        assertEquals(80, elf.getHealth());
    }

    @Test
    public void testGetStrength() {
        assertEquals(50, elf.getStrength());
    }

    @Test
    public void testSetStrength() {
        elf.setStrength(60);
        assertEquals(60, elf.getStrength());
    }

    @Test
    public void testGetLives() {
        assertEquals(3, elf.getLives());
    }

    @Test
    public void testSetLives() {
        elf.setLives(4);
        assertEquals(4, elf.getLives());
    }
}