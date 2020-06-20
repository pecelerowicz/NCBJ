import org.junit.Assert;
import org.junit.Test;

public class SemiEquilibriumProblemTest {

    SemiEquilibriumProblem semiEquilibrium = new SemiEquilibriumProblem();

    @Test
    public void setSemiEquilibriumTest1() {
        int[] array = {1,2,5,2,1};
        Assert.assertEquals(2, semiEquilibrium.semiIndex(array));
    }

    @Test
    public void setSemiEquilibriumTest2() {
        int[] array = {1};
        Assert.assertEquals(0, semiEquilibrium.semiIndex(array));
    }

    @Test
    public void setSemiEquilibriumTest3() {
        int[] array = {1,1};
        Assert.assertEquals(1, semiEquilibrium.semiIndex(array));
    }

    @Test
    public void setSemiEquilibriumTest4() {
        int[] array = {1,1,1};
        Assert.assertEquals(1, semiEquilibrium.semiIndex(array));
    }

    @Test
    public void setSemiEquilibriumTest5() {
        int[] array = {0,0,0,1};
        Assert.assertEquals(3, semiEquilibrium.semiIndex(array));
    }

    @Test
    public void setSemiEquilibriumTest6() {
        int[] array = {0,0,0,0};
        Assert.assertEquals(-1, semiEquilibrium.semiIndex(array));
    }

}
