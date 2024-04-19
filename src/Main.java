import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // https://leetcode.com/problems/longest-common-prefix/

        String[] strs = new  String[]{"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);              // this help us to have better solution idea
        String element1 = strs[0];      // becuase it is sorted we get first element
        String element2 = strs[strs.length-1];    // and last element
        int length = 0;                 //we use this becuase it is sorted

        while(length < element1.length() && length < element2.length()){
            if(element1.charAt(length) == element2.charAt(length)){
                length++;
            } else {
                break;
            }
        }

        return element1.substring(0, length);
    }
}