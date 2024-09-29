import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Week2.example_exersice.Aditional.Elf;
import com.example.Week2.example_exersice.Aditional.Wizard;

public class WizardTest {

    private Wizard wizard;

    @BeforeEach
    public void setUp() {
        wizard = new Wizard(100, 50, 3, "Fireball");
    }

    @Test
    public void testGetSpell() {
        assertEquals("Fireball", wizard.getSpell());
    }

    @Test
    public void testSetSpell() {
        wizard.setSpell("Ice Blast");
        assertEquals("Ice Blast", wizard.getSpell());
    }

    @Test
    public void testConvertToElf() {
        Elf elf = wizard.convertToElf();
        assertNotNull(elf);
        assertEquals(wizard.getHealth(), elf.getHealth());
        assertEquals(wizard.getStrength(), elf.getStrength());
        assertEquals(wizard.getLives(), elf.getLives());
        assertEquals(0, elf.getSpeed()); // Assuming default speed is 0
    }
}
