public class Brackets {

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
