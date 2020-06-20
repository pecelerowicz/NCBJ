import java.util.LinkedList;
import java.util.List;


class TreeProblemIterative {
    public static int solution(Tree t) {
        List<Tree> levelTrees = new LinkedList<>();
        List<Integer> lengthLeft = new LinkedList<>();
        List<Integer> lengthRight = new LinkedList<>();
        levelTrees.add(t);
        lengthLeft.add(0);
        lengthRight.add(0);

        List<Tree> nextLevelTrees = new LinkedList<>();
        List<Integer> nextLengthLeft = new LinkedList<>();
        List<Integer> nextLengthRight = new LinkedList<>();

        int maxLength = 0;

        while(levelTrees.size() != 0) {
            for(int i=0; i<levelTrees.size(); i++) {
                if(levelTrees.get(i).l != null) {
                    nextLevelTrees.add(levelTrees.get(i).l);
                    nextLengthLeft.add(lengthLeft.get(i)+1);
                    nextLengthRight.add(0);
                    maxLength = Math.max(maxLength, lengthLeft.get(i)+1);
                }
                if(levelTrees.get(i).r != null) {
                    nextLevelTrees.add(levelTrees.get(i).r);
                    nextLengthRight.add(lengthRight.get(i)+1);
                    nextLengthLeft.add(0);
                    maxLength = Math.max(maxLength, lengthRight.get(i)+1);
                }
            }
            levelTrees = nextLevelTrees;
            lengthLeft = nextLengthLeft;
            lengthRight = nextLengthRight;
            nextLevelTrees = new LinkedList<>();
            nextLengthLeft = new LinkedList<>();
            nextLengthRight = new LinkedList<>();
        }
        return maxLength;
    }
}