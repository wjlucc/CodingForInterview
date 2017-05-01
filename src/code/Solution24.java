package code;
/*
Problem24：复杂链表的复制
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
*/

/**
 * 
 * @author wjluck
 * 思路：具体分为三部分，参考：https://www.nowcoder.com/questionTerminal/f836b2c43afc4b35ad6adc41ec941dba
 * 1.在旧链表中创建新链表，此时不处理新链表的兄弟结点；
 * 2.根据旧链表的兄弟结点，初始化新链表的兄弟结点。
 * 3.从旧链表中拆分出新的链表。
 * 
 * 在循环中new出的对象，如果有引用指向它，在跳出循环后，并不会被垃圾回收器给回收掉。
 * 如果有一个ArrayList 对象a在for循环中写了
	{
    	User u  = new User() ;
		a.add(u);
	}
	u就不会被回收了
 *
 *	
 */
public class Solution24 {
	
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
        	return null;
        }
        RandomListNode f = pHead;
        while(f != null){
        	RandomListNode newNode = new RandomListNode(f.label); // 这样创建的变量在跳出循环后不会被清空删除吗？
        	newNode.next = f.next;
        	f.next = newNode;  // 在堆内存中new出来的对象，有被其他指针所指向，在跳出循环后，并不会被垃圾回收器回收。。。
        	f = f.next.next;
        }
        System.out.println("----11111111111111111111---");
        
        f = pHead;
//        int index = 0;
        while(f != null){
        	if(f.random != null){
        		f.next.random = f.random.next;
        	}
        	f = f.next.next;
        	
        	/*
        	
        	if( index % 2 == 0){
        		if(f.random != null){
        			f.next.random = f.random.next; 
        		}else{
        			f.next.random = null;
        		}
        		
        	}
        	f = f.next;
        	index += 1;
        	*/
        }
        
        /*
        RandomListNode r = null;
        RandomListNode result = r;
        f = pHead;
        index = 0;
        while(f != null){
        	if(index % 2 == 0){
        		r = f.next;
        		r = r.next;
        	}
        	f = f.next;
        	index += 1;
        }*/
        
        
        
        // 将一个链表拆分成两个链表，思路要清晰，不要混淆，一定要先处理一般情况，再处理特殊情况。
        RandomListNode head = pHead.next;
        RandomListNode r1 = pHead;
        RandomListNode r2 = head;
        while(r1 != null){
        	r1.next = r1.next.next;
        	r1 = r1.next;
        	
        	
        	if(r2.next != null){
        		r2.next = r2.next.next;
        	}
        	        	
        	r2 = r2.next;
        	
        	
        }
        


        
        return head;	
        
    }
}
