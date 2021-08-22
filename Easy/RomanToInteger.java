package Easy;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        var op = romanToInt("LIXV");
        System.out.println(op);
    }

    static int romanToInt(String s) {
        var romanConv = new HashMap<Character, Integer>();

        romanConv.put('I', 1);
        romanConv.put('V', 5);
        romanConv.put('X', 10);
        romanConv.put('L', 50);
        romanConv.put('C', 100);
        romanConv.put('D', 500);
        romanConv.put('M', 1000);

        int sum = romanConv.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanConv.get(s.charAt(i)) >= romanConv.get(s.charAt(i + 1))) {
                sum += romanConv.get(s.charAt(i));
            } else {
                sum -= romanConv.get(s.charAt(i));
            }
        }

        return sum;
    }
}
