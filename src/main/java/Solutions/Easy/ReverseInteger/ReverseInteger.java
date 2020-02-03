package Solutions.Easy.ReverseInteger;

import util.Logger;

public class ReverseInteger {
    private Logger log = Logger.getInstance();

    // number % (10^x) returns x digits from the right
    // number % 1 always returns 0 since there is nothing left after dividing with 1. xd
    public int reverse(int input) {
        int out = 0;
        int num = input;

        while (num != 0) {
            int temp = num % 10;
            num /= 10;

            // out will be multiplied by 10 -> out shouldn't be greater than Integer.MAX_VALUE / 10.
            if (out > Integer.MAX_VALUE / 10 || out < Integer.MIN_VALUE / 10) {
                return 0;
            }
            // if out is exactly MAX or MIN, temp should be 0 (no opposing sign possible)
            if (out == Integer.MAX_VALUE / 10 && temp != 0) {
                return 0;
            }
            if (out == Integer.MIN_VALUE / 10 && temp != 0) {
                return 0;
            }

            out *= 10;
            out += temp;
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE / 10);
        System.out.println(Integer.MIN_VALUE / 10);
    }
}