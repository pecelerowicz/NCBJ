import org.junit.Assert;
import org.junit.Test;

public class TreeProblemRecursiveTest {

    Solution solution = new Solution();

    @Test
    public void treeTest1() {
        Tree t1 = new Tree();
        Tree t2 = new Tree();
        Tree t3 = new Tree();
        Tree t4 = new Tree();
        Tree t5 = new Tree();
        Tree t6 = new Tree();

        t1.l = t2;
        t1.r = t3;
        t3.l = t4;
        t4.l = t5;
        t4.r = t6;

        Assert.assertEquals(2, solution.solution(t1));
    }

    @Test
    public void treeTest2() {
        Tree t1 = new Tree();
        Tree t2 = new Tree();
        Tree t3 = new Tree();
        Tree t4 = new Tree();
        Tree t5 = new Tree();
        Tree t6 = new Tree();

        t1.l = t2;
        t2.l = t3;
        t3.l = t4;
        t4.l = t5;
        t5.l = t6;

        Assert.assertEquals(5, solution.solution(t1));
    }

    @Test
    public void treeTest3() {
        Tree t1 = new Tree();
        Tree t2 = new Tree();
        Tree t3 = new Tree();
        Tree t4 = new Tree();
        Tree t5 = new Tree();
        Tree t6 = new Tree();

        t1.l = t2;
        t1.r = t3;
        t2.l = t4;
        t2.r = t5;
        t3.l = t6;

        Assert.assertEquals(2, solution.solution(t1));
    }

    @Test
    public void treeTest4() {
        Tree t1 = new Tree();
        Tree t2 = new Tree();
        Tree t3 = new Tree();
        Tree t4 = new Tree();
        Tree t5 = new Tree();
        Tree t6 = new Tree();

        t1.l = t2;
        t2.r = t3;
        t3.r = t4;
        t4.r = t5;
        t5.l = t6;

        Assert.assertEquals(3, solution.solution(t1));
    }

}
