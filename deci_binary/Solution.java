class Solution {
    public static void main(String[] args) {

        String test1 = "27346209830709182346";
        String test2 = "82734";
        String test3 = "32";

        System.out.println(minPartitions(test1));
        System.out.println(minPartitions(test2));
        System.out.println(minPartitions(test3));
    }

    private static int minPartitions(String input) {

        char[] ch = input.toCharArray();
        char flag = '0';

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] > flag) {
                flag = ch[i];
            }
        }

        int result = Character.getNumericValue(flag);

        return result;
    }
}