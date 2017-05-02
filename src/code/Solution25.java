package code;

import java.util.Stack;

/*
二叉搜索树与双向链表
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

非递归版解题思路：
1.核心是中序遍历的非递归算法。
2.修改当前遍历节点与前一遍历节点的指针指向。
*/
public class Solution25 {
	public TreeNode Convert(TreeNode pRootOfTree) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = pRootOfTree,pre = null;
        boolean isFirst = true;
        while(p!=null || !stack.isEmpty()){
        	while(p!=null){
        		stack.push(p);
        		p = p.left;
        	}
        	p = stack.pop();
        	if(isFirst){
        		pRootOfTree = p;
        		pRootOfTree.left = null;
        		pre = pRootOfTree;
        		isFirst = false;
        	}else{
        		p.left = pre;
        		pre.right = p;
        		pre = p;
        	}
        	// visit(p)
        	p = p.right;
        }
			
		return pRootOfTree;
    }
}
