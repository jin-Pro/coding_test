package LeetCode;

import java.util.Arrays;

public class No_4_MedianofTwoSortedArrays {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        double answer = 0 ;
	        
	        int firstLength = nums1.length;
	        int secondLength = nums2.length;
	        
	        int length = firstLength + secondLength;
	        
	        int[] nums3 = new int[length];
	        
	        System.arraycopy(nums1, 0, nums3, 0, firstLength);  
	        System.arraycopy(nums2, 0, nums3, firstLength, secondLength);  
	        
	        Arrays.sort(nums3);
	        
	        int middleIndex = nums3.length / 2;
	        
	        answer = (nums3.length % 2 == 0) ? 
	        		((double)(nums3[middleIndex-1] + nums3[middleIndex])) / 2 :
	        			((double)nums3[middleIndex]);
	        		
	        return answer;
	 }
}
