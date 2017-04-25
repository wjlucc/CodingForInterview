package code;

// 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
// 普通思路和递归思路，普通思路要注意情况要分清

public class Solution16 {
	public ListNode Merge(ListNode list1,ListNode list2) {
        
		ListNode result = null,tail = null, temp = null;
		
		if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
		
		if(list1 != null && list2 != null){
			if(list1.val <= list2.val){
				result = list1;
				list1 = list1.next;				
			}else{
				result = list2;
				list2 = list2.next;
			}
			
			result.next = null;
			tail = result;
		}
		while(list1 != null && list2 != null){
			if(list1.val <= list2.val){
				temp = list1;
				list1 = list1.next;
				
			}else{
				temp = list2;
				list2 = list2.next;
			}
			temp.next = null;
			tail.next= temp;
			tail = temp;
			
		}
		if(list1 == null){
			tail.next=list2;
		}
		else if(list2 == null){
			tail.next = list1;
		}
			
		
				
		return result;
    }
	public void printList(ListNode list){
		while(list != null){
			System.out.print(list.val);
			list = list.next;
		}
		System.out.println();
			
	}
	
	// 递归版本的更加简洁明了
	public ListNode Merge2(ListNode list1,ListNode list2){
		if(list1 == null){
			return list2;
		}
		else if(list2 == null){
			return list1;
		}
		else{
			if(list1.val <= list2.val){
				list1.next = Merge2(list1.next,list2);
				return list1;
			}else{
				list2.next = Merge2(list1,list2.next);
				return list2;
			}
		}
				
	}
	
	
}
