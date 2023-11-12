
class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 5;

        swapElements(arr, 0, arr.length - 1);
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();

        swapElements(arr, 0, k - 1);
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();

        swapElements(arr, k, arr.length - 1);
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();

    }

    public static void swapElements(int[] arr, int st, int ed) {
        int temp = 0;
        while (st < ed) {
            temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }
}
