public class SemiEquilibriumProblem {

    public int semiIndex(int[] array) {
        int sum = sum(array);
        if(sum == 0)
            return -1;
        int halfSum = sum/2 + 1; // minimal value that needs to be reached to fulfill the condition
        int i=0;
        int partialSum = 0;
        while(partialSum<halfSum) {
            partialSum += array[i];
            i++;
        }
        return i-1;
    }


    private int sum(int[] array) {
        int tempSum = 0;
        for(int i=0; i<array.length; i++) {
            tempSum += array[i];
        }
        return tempSum;
    }
}
