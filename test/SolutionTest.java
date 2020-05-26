import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructSolutionTest1(){
        String input = "1
                        3";
        String expected = "3";
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void contructSolutionTest2(){
        String input = "-1
                        2";
        String expected = "java.lang.Exception: Breadth and height must be positive";
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }
}
