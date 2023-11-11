class Solution {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
        System.out.println(numJewelsInStones("mMnpfsdafaa", "ahndgfkhmbM"));

    }

    public static int numJewelsInStones(String jewels, String stones) {
        int jewelCount = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(String.valueOf(stones.charAt(i)))) {
                jewelCount++;

            }
        }

        return jewelCount;
    }
}
