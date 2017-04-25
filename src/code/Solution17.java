package code;

// 操作给定的二叉树，将其变换为源二叉树的镜像。 
// 利用递归的方式处理即可
public class Solution17 {
	public void Mirror(TreeNode root) {
        if(root == null)
            return ;
        else{
            if(root.left != null){
                Mirror(root.left);
            }
            if(root.right != null){
                Mirror(root.right);
            }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }            
    }
}
