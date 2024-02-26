import com.example.Feline;
import org.junit.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
Feline feline = new Feline();
@Test
    public void eatMeatTest() throws Exception{
    assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
}
@Test
    public void getFamilyFelineTest (){
    assertEquals("Кошачьи", feline.getFamily());
}
@Test
    public void getKittensTest(){
    assertEquals(1,feline.getKittens());
}
@Test
    public void getKittensTestWithArgument(){
    assertEquals(5, feline.getKittens(5));
}
}
