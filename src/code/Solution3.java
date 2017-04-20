package code;
//输入一个链表，从尾到头打印链表每个节点的值。
import java.util.ArrayList;
import java.util.Stack;

public class Solution3 {
	
	// 将原始链表保存在ArrayList中，再进行两两元素置换，获得逆序
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(listNode != null){
            result.add(listNode.val);
            listNode = listNode.next;
        }
        
        System.out.println(result);       
        
        int i = 0,j = result.size()-1;

        while(i<j){
            int temp = result.get(i);
            result.set(i,result.get(j));
            result.set(j,temp);
            i += 1;
            j -= 1;
        }        
        return result;            
    }
	// 使用Stack来处理
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<ListNode> s = new Stack<ListNode>();		
		while(listNode != null){
            s.push(listNode);
            listNode = listNode.next;
        }
		while(!s.isEmpty()){
			result.add(s.pop().val);
		}
		
		return result;
	}
}




