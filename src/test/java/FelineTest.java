import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyFelineTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        final int BASIC_KITTENS = 1;
        assertEquals(BASIC_KITTENS, feline.getKittens());
    }

    @Test
    public void getKittensTestWithArgument() {
        int actualKittensCount = 5;
        int expectedKittensCount = feline.getKittens(actualKittensCount);
        assertEquals(actualKittensCount, expectedKittensCount);
    }
}
