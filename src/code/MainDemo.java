package code;

public class MainDemo {

	public static void main(String[] args) {
		
		Solution1 s1 = new Solution1();
		int[][] array1 = {{1,2,3,4,5},{3,4,5,7,8},{4,5,7,8,9}};
		System.out.println(s1.Find(5,array1));
		
		StringBuffer sb = new StringBuffer("fd  sf  ff");
		System.out.println(sb.charAt(sb.length()-1));
		Solution2 s2 = new Solution2();
		System.out.println(s2.replaceSpace2(sb));
		
		
		

	}

}
