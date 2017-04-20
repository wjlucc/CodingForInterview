package code;

import java.util.Stack;

//反转链表，将每两个之间的指针置换下方向,head 标记还未处理的链表头部，result 标记已经处理了的链表头部。
public class Test {
	public void test(){
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.add(4);
		stack1.pop();
		System.out.println();
	}
	
	
	
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
	public int Fibonacci(int n) {
		if(n <= 0)
            return 0;
        else if(n == 1 || n == 2)
            return n;
        else{
            int first = 1,second = 2,third = 0;
            for(int i = 3;i <= n;i++){
                third = first + second;
                first = second;
                second = third;                
            }
            return third;
        }
    }
}
