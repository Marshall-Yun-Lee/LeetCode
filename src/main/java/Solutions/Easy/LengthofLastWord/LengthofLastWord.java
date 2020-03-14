package Solutions.Easy.LengthofLastWord;

public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        int counter = 0;
        if (s.equals("")) {
            return counter;
        }
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) != ' ') {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }
}

