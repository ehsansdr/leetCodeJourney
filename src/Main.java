import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //https://leetcode.com/problems/palindrome-number/description/

        System.out.println(romanToInt("CIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        // in "IV" case becuase I is lower than the V and V is next of that
        // so "I" turn to negative becuase of upper role and "I" is equal -1 ,not 1 and "V" is 5 so we sum them and get 4
        // in loop we obey this role in kind of
        // in CIV ,we do not minus "V" of "I" we minus that from "C"
        // "C" = 100 , "I" = -1  becuse the next letter is greater it turns to negative
        // "V" = 5 and sum of them is 100 + (-1) + 5 = 104


        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 &&
                    m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }

        return ans;    }


}