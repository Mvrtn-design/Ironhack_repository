import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Week2.example_exersice.Aditional.Elf;
import com.example.Week2.example_exersice.Aditional.Warrior;

public class WarriorTest {

    private Warrior warrior;

    @BeforeEach
    public void setUp() {
        warrior = new Warrior(100, 50, 3, 75);
    }

    @Test
    public void testWarriorInitialization() {
        assertNotNull(warrior);
        assertEquals(100, warrior.getHealth());
        assertEquals(50, warrior.getStrength());
        assertEquals(3, warrior.getLives());
        assertEquals(75, warrior.getForce());
    }

    @Test
    public void testGetForce() {
        assertEquals(75, warrior.getForce());
    }

    @Test
    public void testSetForce() {
        warrior.setForce(80);
        assertEquals(80, warrior.getForce());
    }

    @Test
    public void testConvertToElf() {
        Elf elf = warrior.convertToElf();
        assertNotNull(elf);
        assertEquals(100, elf.getHealth());
        assertEquals(50, elf.getStrength());
        assertEquals(3, elf.getLives());
        assertEquals(75, elf.getForce());
    }
}
