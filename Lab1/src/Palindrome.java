public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + "\t" + isPalindrome(s));
        }
    }

    public static String reserveString(String s) {
        String str = new String();
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        return str;
    }

    public static boolean isPalindrome(String s) {
        String reserved = reserveString(s);
        return s.equals(reserved);
    }
}