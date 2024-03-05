import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrTest {
    private final String gender;
    private final boolean hasMane;

    public LionParametrTest(String gender, boolean hasMane) {
        this.gender = gender;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] LionGender() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionGenderTest() throws Exception {
        Lion lion = new Lion(gender, new Feline());
        assertEquals(hasMane, lion.doesHaveMane());
    }


}
