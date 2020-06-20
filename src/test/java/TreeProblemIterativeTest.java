import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeProblemIterativeTest {

    private TreeProblemIterative solution = new TreeProblemIterative();

    private Tree t1;
    private Tree t2;
    private Tree t3;
    private Tree t4;
    private Tree t5;
    private Tree t6;

    @Before
    public void beforeEachTestMethod() {
        t1 = new Tree();
        t2 = new Tree();
        t3 = new Tree();
        t4 = new Tree();
        t5 = new Tree();
        t6 = new Tree();
    }

    @Test
    public void treeTest1() {

        t1.l = t2;
        t1.r = t3;
        t3.l = t4;
        t4.l = t5;
        t4.r = t6;

        Assert.assertEquals(2, solution.solution(t1));
    }

    @Test
    public void treeTest2() {

        t1.l = t2;
        t2.l = t3;
        t3.l = t4;
        t4.l = t5;
        t5.l = t6;

        Assert.assertEquals(5, solution.solution(t1));
    }

    @Test
    public void treeTest3() {

        t1.l = t2;
        t1.r = t3;
        t2.l = t4;
        t2.r = t5;
        t3.l = t6;

        Assert.assertEquals(2, solution.solution(t1));
    }

    @Test
    public void treeTest4() {

        t1.l = t2;
        t2.r = t3;
        t3.r = t4;
        t4.r = t5;
        t5.l = t6;

        Assert.assertEquals(3, solution.solution(t1));
    }

    @Test
    public void treeTest5() {
        Assert.assertEquals(0, solution.solution(t1));
    }

    @Test
    public void treeTest6() {
        Assert.assertEquals(0, solution.solution(null));
    }

    @Test
    public void treeTest7() {
        t1.l = t2;
        Assert.assertEquals(1, solution.solution(t1));
    }

    @Test
    public void treeTest8() {
        t1.l = t2;
        t1.r = t3;
        t3.l = t4;
        Assert.assertEquals(1, solution.solution(t1));
    }

    @Test
    public void treeTest9() {
        t1.l = t2;
        t1.r = t3;
        t2.l = t4;
        Assert.assertEquals(2, solution.solution(t1));
    }

}
