import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {
    @Mock
    private Feline feline;
    private Lion lion;


@Test
    public void testLionDoesHasMane() {
        int expected = 1;
        int actual = feline.getKittens();
        System.out.println("Ожидалось: " + expected);
        System.out.println("Получено: " + actual);
        assertEquals(expected, actual);
    }
}
