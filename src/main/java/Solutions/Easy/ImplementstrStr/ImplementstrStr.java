package Solutions.Easy.ImplementstrStr;

public class ImplementstrStr {

    /**
     * pure iteration + condition version
     */
    public int strStr(String haystack, String needle) {
        if (haystack.equals("")|| needle.length() > haystack.length()) {
            return -1;
        }

        int counter = 0;
        int needleCounter = 0;
        for (int i = 0; i < haystack.length() - 1; i++) {
            if (haystack.charAt(i) == needle.charAt(needleCounter)) {
                if (needle.length() == 1) {
                    return counter;
                }
                needleCounter++;
            } else {
                counter++;
                needleCounter = 0;
            }
        }
        if (counter >= haystack.length() - 1 && needleCounter == 0) {
            if (haystack.charAt(haystack.length() - 1) != needle.charAt(needleCounter)) {
                return -1;
            }
        }
        return counter;
    }

    /**
     * with String util
     */
    public int strStr1(String haystack, String needle) {
        if (haystack.equals("")) {
            return -1;
        }

        int counter = 0;
        if (haystack.contains(needle)) {
            counter = haystack.indexOf(needle);
            return counter;
        }
        else {
            return -1;
        }
    }
}