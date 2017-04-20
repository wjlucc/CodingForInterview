package code;



public class MainDemo {

	public static void main(String[] args) {
		
		Solution1 s1 = new Solution1();
		int[][] array1 = {{1,2,3,4,5},{3,4,5,7,8},{4,5,7,8,9}};
		System.out.println(s1.Find(5,array1));
		
		StringBuffer sb = new StringBuffer("fd  sf  ff");
		Solution2 s2 = new Solution2();
		System.out.println(s2.replaceSpace2(sb));
		
		ListNode listNode = new ListNode(67);
		ListNode listNode1 = new ListNode(0);
		ListNode listNode2 = new ListNode(24);
		ListNode listNode3 = new ListNode(58);
		listNode2.next = listNode3;
		listNode1.next = listNode2;
		listNode.next = listNode1;
		
		Solution3 s3 = new Solution3();
		System.out.println(s3.printListFromTailToHead(listNode));
		System.out.println(s3.printListFromTailToHead2(listNode));
		
		
		Solution4 s4 = new Solution4();
		System.out.println(s4.JumpFloor(5));
		System.out.println(s4.JumpFloor2(5));
		
		Solution6 s6 = new Solution6();
		s6.push(5);
		s6.push(6);
		s6.push(7);
		
		System.out.println(s6.pop());
		System.out.println(s6.pop());
		System.out.println(s6.pop());

	}

}
