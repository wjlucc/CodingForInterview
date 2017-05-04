package code;
/*
两个链表的第一个公共结点
输入两个链表，找出它们的第一个公共结点。
思路：先求出两个链表的长度，将长的链表先走几步，之后两个链表同时遍历。
*/
public class Solution35 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 
        int count1 = 0,count2 = 0;
        ListNode p1 = pHead1,p2 = pHead2;
        
        while(p1 != null) {
            count1 += 1;
            p1 = p1.next;
        }
        while(p2 != null){
            count2 += 1;
            p2 = p2.next;
        }
        
        p1 = pHead1;
        p2 = pHead2;
        

        if(count1 > count2){
            for(int i = 0;i<count1-count2;i++){
                p1 = p1.next;
            }
        }else{
            for(int i = 0;i < count2-count1;i++){
                p2 = p2.next;
            }
        }
        
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
        
    }
}
