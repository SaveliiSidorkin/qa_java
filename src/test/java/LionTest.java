import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String gender = "Самец";
    private Lion lion;
    @Mock
    private Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        lion = new Lion(gender, feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getLionFoodTest() throws Exception {
        lion = new Lion(gender, feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void lionExceptionTest() {
        final String unknownGender = "Львица";
        String textException = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion(unknownGender, feline));
        Assert.assertEquals(textException, exception.getMessage());
    }
}
