package code;

// 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
// Java中Queue的使用：http://www.runoob.com/java/data-queue.html

import java.util.LinkedList;
import java.util.Queue;

public class Solution18 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root2 == null){
			return false;
		}
        
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root1);
		while(!q.isEmpty()){
			TreeNode temp = q.poll();
			if(temp.val == root2.val && equalTree(temp,root2)){
				return true;
			}else{
				if(temp != null && temp.left != null && temp.right != null ){
					q.offer(temp.left);
					q.offer(temp.right);
				}
			}
		}
		
		return false;
    }
	
	
	// 用于判断两个树是不是相等 
	public boolean equalTree(TreeNode root1,TreeNode root2){
		if(root2 == null){
			return true;
		}
		if(root1 != null && root2 != null && root1.val == root2.val ){
			boolean result = equalTree(root1.left,root2.left) && equalTree(root1.right,root2.right);
			return result;
		}
		return false;
	}
}
