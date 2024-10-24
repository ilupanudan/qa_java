
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
    private final boolean lionHasMane;

    public TestLionSex(String lionSex, boolean lionHasMane) {
        this.lionSex = lionSex;
        this.lionHasMane = lionHasMane;
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
        assertTrue(lion.doesHaveMane() == lionHasMane);

        }
    }
