class Solution {
    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        String[] operations2 = { "X++", "++X", "--X", "X--" };
        String[] operations3 = { "++X", "++X", "X++" };

        int result1 = finalValueAfterOperations(operations);
        int result2 = finalValueAfterOperations(operations2);
        int result3 = finalValueAfterOperations(operations3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static int finalValueAfterOperations(String[] operations) {

        int track = 0;
        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                track += -1;

            } else {
                track += 1;

            }

        }
        return track;
    }
}
