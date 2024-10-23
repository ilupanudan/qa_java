
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestLionSex {
Feline feline;

    private final String lionSex;

    public TestLionSex(String lionSex, boolean lionHasMane) {
        this.lionSex = lionSex;

    }

    @Parameterized.Parameters
    public static Object[][] lionSexParams() throws Exception {
        return new Object[][]{
                {"Самец", true}, {"Самка",false}
        };
    }

    @Test
    public void testLionSex() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        String actual = lionSex;
        switch (lionSex) {


            case "Самец":
                System.out.println("Ожидалось: Самец");
                System.out.println("Получено: " + actual);
                assertEquals("Самец", actual);
                assertTrue(lion.doesHaveMane());
                break;

            case "Самка":

                System.out.println("Ожидалось: Самка");
                System.out.println("Получено: " + actual);
                assertEquals("Самка", actual);
                assertFalse(lion.doesHaveMane());
                break;




        }
    }
}