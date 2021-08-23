package Easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        var list = new String[] { "abcd", "abc", "ab" };
        var op = horiPre(list);
        System.out.println(op);
    }

    static String horiPre(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    static String prefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        int min = Integer.MAX_VALUE;
        String minWord = "";

        for (String ele : strs) {
            if (ele.length() < min) {
                min = ele.length();
                minWord = ele;
            }
        }

        String res = minWord.substring(0);
        boolean flag = false;
        for (int i = 0; i < min; i++) {
            Character pre = minWord.charAt(i);
            for (String ele : strs) {
                if (ele.charAt(i) != pre) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                res = minWord.substring(0, i);
                break;
            }
        }
        return res;
    }

}
