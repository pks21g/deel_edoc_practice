class Solution {
    public static void main(String[] args) {
        String IP = "255.255.1.12";
        String replace = defragIPaddr(IP);
        System.out.println(replace);
    }

    private static String defragIPaddr(String address) {

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                string.append(address.charAt(i));
            } else {
                string.append("[.]");
            }
        }

        return string.toString();
    }

}