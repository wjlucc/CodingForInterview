package code;

import java.util.ArrayList;

//输入一个链表，输出该链表中倒数第k个结点。

// 思路：用一个ArrayList保存遍历链表后的结点序列，返回指定位置元素。
// 思路2：用两个指针，间隔k-1步，第二个指针指到终点时，第一个指针的位置就是倒数第k个元素。

public class Solution10 {
	public ListNode FindKthToTail(ListNode head,int k) {
		ArrayList<ListNode> a = new ArrayList<ListNode>();
		while(head != null){
			a.add(head);
			head = head.next;
		}
		int index = a.size()-k;
		if(index >= 0 && index < a.size())
			return a.get(index);
		else
			return null;		
    }
	
	// 思路2：用两个指针，间隔k-1步，第二个指针指到终点时，第一个指针的位置就是倒数第k个元素。
	public ListNode FindKthToTail2(ListNode head,int k) {
		ListNode l1 = head;
		ListNode l2 = head;
        int i =0;
		for(i = 0;i < k && l2 != null;i++){
			l2 = l2.next;
		}
		if(l2 == null && i < k){
			return null;
		}
		while(l2 != null){
			l2 = l2.next;
			l1 = l1.next;
		}
		return l1;
	}
}
