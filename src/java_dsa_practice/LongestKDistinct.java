package java_dsa_practice;

import java.util.HashMap;

public class LongestKDistinct {

    public static int longestKDistinct(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // If more than K distinct → shrink window
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            // When exactly K distinct
            if (map.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String s = "aaabbcccd";
        int k = 2;

        System.out.println("Longest substring with exactly " 
                            + k + " distinct chars = " 
                            + longestKDistinct(s, k));
    }
}
