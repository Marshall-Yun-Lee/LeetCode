class mainRun {
    public static void main(String[] args) {
        int[] input = {1, 2, 5};
        System.out.println(coinChange(input, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        if (coins == null || amount < 0) {
            return -1;
        }

        int count = 0;
        int pointer = coins.length - 1;
        while (amount > coins[0] && pointer >= 0) {
            if (amount > coins[pointer]) {
                amount -= coins[pointer];
            } else {
                pointer--;
            }
        }

        if (amount == 0) {
            return count;
        } else {
            return -1;
        }
    }
}
