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
		System.out.println("-----------------");
		System.out.println(3&3);
		
		System.out.println("-----------------");
		Solution9 s9 = new Solution9();
		int[] array9 = {4,5,6,7,2,3};
		System.out.println(s9.minNumberInRotateArray(array9));
		
		System.out.println("-----------------");
		Solution12 s12 = new Solution12();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in =  {4,7,2,1,5,3,8,6};
		s12.reConstructBinaryTree(pre,in);
		
		System.out.println("-----------------");
		int[] test = {1,2,3,4,5,6,7};
		Solution14 s14 = new Solution14();
		s14.reOrderArray(test);
		System.out.println("-----------------");
		Solution15 s15 = new Solution15();
		System.out.println(s15.Power(2, -3));
		System.out.println("-----------------");
		ListNode s161 = new ListNode(1);
		ListNode s162 = new ListNode(3);
		ListNode s163 = new ListNode(5);
		s161.next = s162;
		s162.next = s163;
		ListNode s1610 = new ListNode(2);
		ListNode s1620 = new ListNode(4);
		ListNode s1630 = new ListNode(6);
		s1610.next = s1620;
		s1620.next = s1630;
		printList(s161);
		printList(s1610);
		Solution16 s16 = new Solution16();
		printList(s16.Merge2(s161, s1610));
		
		
		

	}
	public static void printList(ListNode list){
		while(list != null){
			System.out.print(list.val);
			list = list.next;
		}
		System.out.println();
			
	}

}
