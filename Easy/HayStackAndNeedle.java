package Easy;

public class HayStackAndNeedle {
    public static void main(String[] args) {
        System.out.println(strStr("aaaaa", "bba"));
    }

    static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        } else if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); ++i) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}