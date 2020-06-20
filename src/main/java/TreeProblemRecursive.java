public class TreeProblemRecursive {
    public static void main(String[] args) {
    }
}


class Solution {

    private int max = 0;

    public int solution(Tree t) {
        traverse(t, 0, 0);
        return max;
    }

    private void traverse(Tree t, int accumLeft, int accumRight) {

        if(t != null) {
            //System.out.println("l: " + accumLeft + ", r: " + accumRight);
            if(accumLeft==0 && accumRight==0) {
                traverse(t.l, 1, 0);
                traverse(t.r, 0, 1);
                max = Math.max(max, 1);
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
