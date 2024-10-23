
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void initLion() {
        lion = new Lion(feline);
    }

    @Test
    public void testLionGetFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        List<String> actual = feline.getFood("Хищник");
        System.out.println("Ожидалось: " + expected);
        System.out.println("Получено: " + actual);
        assertEquals(expected, lion.getFood());
    }

    @Test
    public void testLionGetKittens() throws Exception {

        int expected = 1;
        Mockito.when(feline.getKittens()).thenReturn(expected);
        int actual = lion.getKittens();
        System.out.println("Ожидалось: " + expected);
        System.out.println("Получено: " + actual);

        assertEquals(expected, actual);
    }
    }


