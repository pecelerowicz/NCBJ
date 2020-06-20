public class Brackets {
    public static void main(String[] args) {
        String s1 = "(a(c)";
        String s2 = ")b";
        String s3 = "(b(s))";

        System.out.println(isCorrect(s1));
        System.out.println(isCorrect(s2));
        System.out.println(isCorrect(s3));
    }


    public static boolean isCorrect(String s) {

        int opened = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                opened++;
            } else if(s.charAt(i) == ')') {
                opened--;
            }
            if(opened<0) {
                return false;
            }
        }
        return opened==0;
    }
}
