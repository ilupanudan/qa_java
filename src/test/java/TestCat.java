import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void initCat() {
        cat = new Cat(feline);
    }

    @Test
    public void testCatGetSoundTest() {
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatGetFoodTest() throws Exception {
        List<String> expected = List.of("Животные","Птицы","Рыба");
        Mockito.when(cat.getFood()).thenReturn(expected);
        List<String> actual = cat.getFood();
        Assert.assertEquals(expected, actual);
    }
}