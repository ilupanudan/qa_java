import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
    @Spy
    private Feline feline;

    @Test

    public void testFelineEatMeat() throws Exception{
        List<String> expected = List.of("Животные","Птицы","Рыба");
        List<String> actual = feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        assertEquals(expected, actual);
    }

    @Test

    public void testFelineGetFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();

        assertEquals(expected, actual);
    }

    @Test

    public void testFelineGetKittens() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }



    @Test
    public void testFelineKittensCount() throws Exception {
        int expected = 3;
        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(expected);
        int actual = feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        assertEquals(expected, actual);
    }



}
