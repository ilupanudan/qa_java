import com.example.Feline;
import com.example.Lion;
import org.junit.Test;


public class TestLionSexException {
    Feline feline;

    @Test(expected = Exception.class)
    public void testLionException() throws Exception{
        Lion lion = new Lion("Вертолет", feline);


    }
}
