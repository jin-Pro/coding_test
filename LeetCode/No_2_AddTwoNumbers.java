package leatCode;

public class No_2_AddTwoNumbers {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       if((l1 == null) &&(l2 == null)) {
	    	   return null;
	       }
	       
	       ListNode newNode = new ListNode();
	       
	       if(l1 == null) {
	    	   newNode = addAlone(l2);
	    	   return newNode;
	       }
	       
	       if(l2 == null) {
	    	   newNode = addAlone(l1);
	    	   return newNode;
	       }
	       newNode.val = l1.val + l2.val;
	       
	       if(newNode.val >= 10){
	           newNode.val -= 10;
	           
	           if(l1.next == null) {
	        	   l1.next = new ListNode();
	           }
	           l1.next.val += 1;
	       }
	       
	       newNode.next = addTwoNumbers(l1.next,l2.next);
	       return newNode;
	   }
	public static ListNode addAlone(ListNode alone) {
		if(alone == null) {
			return null;
		}
		
		ListNode newNode = new ListNode();
		
		newNode.val = alone.val;
		
		if(newNode.val >= 10){
	           newNode.val -= 10;
	           
	           if(alone.next == null) {
	        	   alone.next = new ListNode();
	           }
	           alone.next.val += 1;
	       }
		
		newNode.next = addAlone(alone.next);
		
		return newNode;
	}