package code;



public class MainDemo {

	public static void main(String[] args) {
/*
		
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
		
		System.out.println("-----------------");
		TreeNode root1 = new TreeNode(8);
		TreeNode root10 = new TreeNode(8);
		TreeNode root11 = new TreeNode(7);
		TreeNode root12 = new TreeNode(9);
		TreeNode root13 = new TreeNode(3);
		TreeNode root14 = new TreeNode(4);
		TreeNode root15 = new TreeNode(7);		
		root1.left = root10;
		root1.right = root11;
		root10.left = root12;
		root10.right = root13;
		root13.left = root14;
		root13.right = root15;
		
		TreeNode root2 = new TreeNode(8);
		TreeNode root20 = new TreeNode(9);
		TreeNode root21 = new TreeNode(2);
		root2.left = root20;
		root2.right = root21;
		Solution18 s18 = new Solution18();
		System.out.println(s18.HasSubtree(root1, root2));
		

		System.out.println("------------21----------------");
		Solution21  s21 = new Solution21();
		
		s21.push(3);
		System.out.println(s21.size);
		System.out.println(s21.data);
		System.out.println(s21.miniData);
		System.out.println(s21.min());
		
		s21.push(4);
		System.out.println(s21.size);
		System.out.println(s21.data);
		System.out.println(s21.miniData);
		System.out.println(s21.min());
		
		s21.push(2);
		System.out.println(s21.size);
		System.out.println(s21.data);
		System.out.println(s21.miniData);
		System.out.println(s21.min());
		
		s21.push(3);
		System.out.println(s21.size);
		System.out.println(s21.data);
		System.out.println(s21.miniData);
		System.out.println(s21.min());
		
		s21.pop();
		System.out.println(s21.size);
		System.out.println(s21.min());
		s21.pop();
		System.out.println(s21.size);
		System.out.println(s21.min());
		s21.pop();
		System.out.println(s21.size);
		System.out.println(s21.min());		

		System.out.println(s21.data);
		System.out.println(s21.miniData);
		s21.push(0);
		System.out.println(s21.size);
		System.out.println(s21.data);
		System.out.println(s21.miniData);
		System.out.println(s21.min());

		*/
		System.out.println("--------------------------");
		Solution20  s20 = new Solution20();
		int[] pushA = {1};
		int[] popA = {2};
		System.out.println(s20.IsPopOrder(pushA, popA));
		System.out.println("--------------------------");
		Solution22  s22 = new Solution22();
		int[] test22 = {4,6,7,5};
		System.out.println(s22.VerifySquenceOfBST(test22));
		System.out.println("--------------------------");
		RandomListNode s231 = new RandomListNode(1);		
		RandomListNode s232 = new RandomListNode(2);
		RandomListNode s233 = new RandomListNode(3);
		RandomListNode s234 = new RandomListNode(4);
		RandomListNode s235 = new RandomListNode(5);
		s231.next = s232;
		s232.next = s233;
		s233.next = s234;
		s234.next = s235;
		s235.next = null;
		s231.random = s233;
		s232.random = s235;
		s234.random = s232;
		Solution24  s24 = new Solution24();
		s24.Clone(s231);
		System.out.println("----------------------");
		String t = "qwefdf";
		for(int i = 0;i < t.length();i++){
			System.out.println(t.charAt(i));
		}
		
		
		
				
		
	}
	
	public static double round(double num,int scale){
		double dig = Math.pow(10, scale);
		return Math.round(num*dig)/dig;
	}
	
	public static void printList(ListNode list){
		while(list != null){
			System.out.print(list.val);
			list = list.next;
		}
		System.out.println();
			
	}

}
