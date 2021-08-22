package Easy;

public class Palindrome {
    public static void main(String[] args) {
        var op = isPalindrome(121);
        System.out.println(op);
    }

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int rev = 0;
        int copy = x;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            rev = rev * 10 + pop;
        }

        return (rev == copy);
    }
}
