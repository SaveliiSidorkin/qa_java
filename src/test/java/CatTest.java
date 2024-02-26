import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {
    Cat cat = new Cat(new Feline());

    @Test
    public void getSoundTest() {
        String sound = cat.getSound();
        assertEquals("Мяу", sound);
    }

    @Test
    public void getCatFoodTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
