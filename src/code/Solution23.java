package code;

import java.util.ArrayList;

/*
Problem23：二叉树中和为某一值的路径
输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
*/

// 使用全局成员变量存放路径。

// 参考：https://www.nowcoder.com/questionTerminal/b736e784e3e34731af99065031301bca
// 不会做。。。

public class Solution23 {
	
	ArrayList<ArrayList<Integer>> allPath = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> path = new ArrayList<Integer>();
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(root == null){
			return allPath;
		}
		path.add(root.val);
		target -= root.val;
		if(target == 0 && root.left == null && root.right == null){
			allPath.add(new ArrayList<Integer>(path));
		}
		
		
		return allPath;
		
    }
	
	
}






