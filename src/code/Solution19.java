package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 从上往下打印二叉树（二叉树的层次遍历）	
// 使用队列进行遍历，注意要保证入队的节点都不要为null。

public class Solution19 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root != null){
        	que.offer(root);
        	while(!que.isEmpty()){
        		TreeNode temp = que.poll();
        		result.add(temp.val);
        		if(temp.left != null)
        			que.offer(temp.left);
        		if(temp.right != null)
        			que.offer(temp.right);
        	}
        }
        
        return result;
    }
}
