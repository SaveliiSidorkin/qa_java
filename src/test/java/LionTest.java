import com.example.Feline;
import com.example.Lion;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String gender = "Самец";
    private final String unknownGender = "Львица";
    private final String textException = "Используйте допустимые значения пола животного - самец или самка";
    Lion lion;
    @Mock
    Feline feline;

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

        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion(unknownGender, feline));
        Assert.assertEquals(textException, exception.getMessage());
    }
}
