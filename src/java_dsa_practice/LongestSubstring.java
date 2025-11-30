//Given a string, find the length of the longest substring without repeating characters.

package java_dsa_practice;

import java.util.HashSet;

public class LongestSubstring {
	 public static int lengthOfLongestSubstring(String s) {
	        int left = 0, max = 0;
	        HashSet<Character> set = new HashSet<>();

	        for (int right = 0; right < s.length(); right++) {
	            char ch = s.charAt(right);

	            while (set.contains(ch)) {
	                set.remove(s.charAt(left));
	                left++;
	            }

	            set.add(ch);
	            max = Math.max(max, right - left + 1);
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        System.out.println(lengthOfLongestSubstring("pwwkew")); // 3
	    }

}
