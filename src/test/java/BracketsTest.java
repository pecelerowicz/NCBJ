import org.junit.Assert;
import org.junit.Test;

public class BracketsTest {

    @Test
    public void bracketsTest() {
        Assert.assertFalse(Brackets.isCorrect("(a(c)"));
        Assert.assertFalse(Brackets.isCorrect(")b"));
        Assert.assertTrue(Brackets.isCorrect("(b(s))"));
        Assert.assertTrue(Brackets.isCorrect("(((())())())"));
        Assert.assertFalse(Brackets.isCorrect("((((())())())"));
        Assert.assertTrue(Brackets.isCorrect("(a(s(d(f)f)f(f)f)f(f)f)"));
        Assert.assertTrue(Brackets.isCorrect("()"));
        Assert.assertFalse(Brackets.isCorrect(")("));
        Assert.assertTrue(Brackets.isCorrect("((()))"));
        Assert.assertFalse(Brackets.isCorrect("((())"));
    }
}