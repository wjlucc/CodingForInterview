package code;

//反转链表，将每两个之间的指针置换下方向,head 标记还未处理的链表头部，result 标记已经处理了的链表头部。
public class OtherSolution1 {
	
	public ListNode ReverseList(ListNode head) {
		ListNode result = null;
		ListNode temp = null;
		
		while(head != null){
			temp = head.next;
			head.next = result;
			result = head;
			head = temp;
		}
		return result;
  }
}
