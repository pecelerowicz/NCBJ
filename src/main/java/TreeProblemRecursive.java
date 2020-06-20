public class TreeProblemRecursive {

    private int max = 0;

    public int solution(Tree t) {
        traverse(t, 0, 0);
        return max;
    }

    private void traverse(Tree t, int accumLeft, int accumRight) {

        if(t != null) {
            if(accumLeft==0 && accumRight==0) {
                traverse(t.l, 1, 0);
                traverse(t.r, 0, 1);
            } else if(accumRight==0) { // accumLeft != 0
                traverse(t.l, accumLeft+1, 0);
                traverse(t.r, 0, 1);
                max = Math.max(max, accumLeft);
            } else { // accumRight != 0
                traverse(t.l, 1, 0);
                traverse(t.r, 0, accumRight+1);
                max = Math.max(max, accumRight);
            }

        }
    }
}

class Tree {
    public int x;
    public Tree l;
    public Tree r;
}
