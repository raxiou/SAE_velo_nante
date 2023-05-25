import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
public class TestCompteur {
   private Compteur c;
    @Before
    public void setUp() {
        c = new Compteur(665, "Bonduelle vers Nord", 1, 47.21160939094489, -1.5432599939033043, "null");
    }

    @Test
    public void testGetIdCompteur() {
        assertEquals(665, c.getIdCompteur());
    }

    public static void main(String[] args) {
        JUnitCore.main(TestCompteur.class.getName());
    }
}
