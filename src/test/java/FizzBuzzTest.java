import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private int number;
    private Object expectedResult;

    public FizzBuzzTest(int number,Object expectedResult){
        this.expectedResult = expectedResult;
        this.number = number;
    }

    @Parameterized.Parameters
    public static Collection prepareData(){
        return Arrays.asList(new Object[][]{
                {1,1},
                {3,"Fizz"},
                {5,"Buzz"},
                {15,"FizzBuzz"}
        });
    }
    @Test
    public void test(){
        assertEquals(expectedResult, FizzBuzz.getValue(number));
    }
}