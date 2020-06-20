import org.junit.Assert;
import org.junit.Test;

public class BracketsProblemTest {

    @Test
    public void bracketsTest() {
        Assert.assertFalse(BracketsProblem.isCorrect("(a(c)"));
        Assert.assertFalse(BracketsProblem.isCorrect(")b"));
        Assert.assertTrue(BracketsProblem.isCorrect("(b(s))"));
        Assert.assertTrue(BracketsProblem.isCorrect("(((())())())"));
        Assert.assertFalse(BracketsProblem.isCorrect("((((())())())"));
        Assert.assertTrue(BracketsProblem.isCorrect("(a(s(d(f)f)f(f)f)f(f)f)"));
        Assert.assertTrue(BracketsProblem.isCorrect("()"));
        Assert.assertFalse(BracketsProblem.isCorrect(")("));
        Assert.assertTrue(BracketsProblem.isCorrect("((()))"));
        Assert.assertFalse(BracketsProblem.isCorrect("((())"));
    }
}
