package test.jia.lc.easy.sort;

//  Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class MergeTwoSortedLinkList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		int s1=getListSize(l1);
		int s2=getListSize(l2);
		int i1=0;
		int i2=0;
		int index=0;
		ListNode result = null;
		while(i1<=s1 && i2<=s2) {
			if(l1.val <= l2.val) {
				result.val=l1.val;
				result=result.next;
				i1++;
			}else {
				i2++;
				result.val=l2.val;
			}
		}
		
		while(11>i2) {
			
		}
			
		return null;//TBD
	}

	private int getListSize(ListNode l1) {
		
		if (l1 == null) return 0;
		int i=0;
		
		while(l1.next != null) {
			i++;
			l1=l1.next;
		}
		return i+1;
	}
}
