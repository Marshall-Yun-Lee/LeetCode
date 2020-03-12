package Solutions.Easy.CountandSay;

import util.Logger;

public class CountandSay {
    Logger log = Logger.getInstance();

    public String countAndSay(int n) {
        if (n == 0) {
            return "";
        }

        return countAndSay(0);
    }
}