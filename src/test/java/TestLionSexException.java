import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestLionException {
    Feline feline;






    @Test(expected = Exception.class)
    public void testLionException() throws Exception{
        Lion lion = new Lion("Вертолет", feline);
        //Exception exception = assertThrows(RuntimeException.class, () -> new Lion("Вертолёт", feline));
        //assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());


    }
}
