package LeetCode;

import java.util.ArrayList;

public class No_3_LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		int begin = 0;
		int end = 0;
		int max_value = 0;
		ArrayList<String> subString = new ArrayList<String>();
		String[] sSplit = s.split("");
		
		for(int i = 0; i < s.length(); i++) {
			if(subString.contains(sSplit[i])){
				int num = subString.indexOf(sSplit[i]);
				for(int j = 0; j<= num; j++){
					subString.remove(0);
				}
				begin += num + 1;
			}
			subString.add(sSplit[i]);
			end ++;
			max_value = ((end - begin) > max_value) ? (end - begin) : max_value ;
		}
		
		return max_value;
    }
	public static void main(String[] args) {
		String s= "pwwkew";
		System.out.printf("%d",lengthOfLongestSubstring(s));
	}
}
