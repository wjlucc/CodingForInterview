package code;

/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/
public class Solution12 {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		System.out.println("--------11----------");
		print(pre);
		print(in);
		if(pre.length == 0)
			return null;
		
		
		TreeNode root = new TreeNode(pre[0]);
		if(pre.length == 1){
			root.left = null;
			root.right = null;
			return root;
		}
			
		
		
		int index = 0;
		for(;index<in.length;index++){
			if(in[index] == pre[0])
				break;
		}
		int[] pre1 = new int[index];
		int[] in1 = new int[index];
		
		System.arraycopy(pre, 1,pre1, 0,  index);
		System.arraycopy( in, 0, in1, 0,index);
		System.out.println(index);
		print(pre);
		print(in);
		print(pre1);
		print(in1);
		
		root.left = this.reConstructBinaryTree(pre1,in1);
		
		pre1 = new int[in.length-1-index];
		in1 = new int[in.length-1-index];
		
		System.arraycopy( pre, index+1, pre1, 0,in.length-1-index);
		System.arraycopy( in, index, in1, 0,in.length-1-index);
		
		root.right = this.reConstructBinaryTree(pre1,in1);
		
		
		
		return root;
    }
	public void print(int[] array){
		for(int i = 0;i < array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
