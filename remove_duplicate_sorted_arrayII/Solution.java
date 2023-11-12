
class Solution {
    public static void main(String[] args) {
        int[] numsArr = { 1, 1, 1, 2, 2, 3 };
        int[] numsArr2 = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int a = removeDuplicateElements(numsArr);
        int b = removeDuplicateElements(numsArr2);
        System.out.println(a);
        System.out.println(b);
    }

    private static int removeDuplicateElements(int[] nums) {

        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }

        }

        return index;

    }
}
