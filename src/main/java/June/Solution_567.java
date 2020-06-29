package June;

import java.util.Arrays;

/**
 * @Author: zhangdanjin
 * @Date: 2020/6/28 17:03
 */
public class Solution_567 {

    public boolean checkInclusion(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }

        char[] char1 = s1.toCharArray();
        int[] str1 = getArray(char1);

        int start = 0;
        int end = char1.length;
        while (end - 1 < s2.length()) {
            char[] char2 = s2.substring(start, end).toCharArray();
            int[] str2 = getArray(char2);
            if (Arrays.equals(str1, str2)) {
                return true;
            }
            start++;
            end++;
        }
        return false;
    }

    public int[] getArray(char[] var1) {
        // 初始化一个字符串ascii码， a对应97 z对应122
        int[] array = new int[26];
        for (int i = 0; i < var1.length; i++) {
            int index = (byte) var1[i] - 97;
            array[index]++;
        }
        return array;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidpatoo";
        Solution_567 solution_567 = new Solution_567();
        boolean flag = solution_567.checkInclusion(s1, s2);
        System.out.println(flag);
    }
}
