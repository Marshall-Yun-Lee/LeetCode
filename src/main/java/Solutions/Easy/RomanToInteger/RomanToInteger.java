package Solutions.Easy.RomanToInteger;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String input) {
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);

        char[] list = input.toCharArray();
        int out = 0;
        // count backward, and + or - based on it's right char
        for (int i = list.length - 1; i >= 0; i--) {
            char curr = list[i];
            if (i != list.length - 1) {
                char rightChar = list[i + 1];
                if (       curr == 'I' && rightChar == 'V' || curr == 'I' && rightChar == 'X'
                        || curr == 'X' && rightChar == 'L' || curr == 'X' && rightChar == 'C'
                        || curr == 'C' && rightChar == 'D' || curr == 'C' && rightChar == 'M') {
                    out -= table.get(curr);
                } else {
                    out += table.get(curr);
                }
            } else {
                out += table.get(curr);
            }
        }
        return out;
    }
    // OR
    public int romanToIntSimple(String input) {
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);

        char[] list = input.toCharArray();
        int out = 0;
        // count backward, and + or - based on it's right char
        for (int i = list.length - 1; i >= 0; i--) {
            char curr = list[i];
            if (i != list.length - 1) {
                char rightChar = list[i + 1];
                if (table.get(curr) < table.get(rightChar)) {
                    out -= table.get(curr);
                } else {
                    out += table.get(curr);
                }
            } else {
                out += table.get(curr);
            }
        }
        return out;
    }

}
