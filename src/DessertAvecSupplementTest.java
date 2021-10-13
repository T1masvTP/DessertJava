import org.junit.*;
import static org.junit.Assert.*;

public class DessertAvecSupplementTest {

    Dessert d1;
    Dessert d2;
    Dessert d3;
    Dessert d4;

    @Before
    public void setUp() throws Exception {
        this.d1 = new Crepe();
        this.d2 = new Chantilly(d1);
        this.d3 = new Chocolat(d2);
        this.d4 = new Chocolat(d3);

    }

    @Test
    public void calculPrixTest(){
        assertEquals(1,d1.calculPrix(),1);
        assertEquals(1.80,d2.calculPrix(),1);
        assertEquals(2.30,d3.calculPrix(),1);
        assertEquals(2.80,d4.calculPrix(),1);
    }
}