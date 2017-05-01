package code;

/*二叉搜索树的后序遍历序列
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。*/

// 二叉搜索树就是左孩子比父节点小，右孩子比父节点大的树
// 利用递归来判断,先将根确定，找到数组中第一个比根元素大的元素所在的索引，将数组分成两部分，递归判断这两部分是否满足要求。
public class Solution22 {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
        	return false;
        }else{
        	int root = sequence[sequence.length-1];
        	int midIndex = -1; 
        	
        	for(int i = 0;i < sequence.length-1;i++){
        		if(sequence[i] > root){
        			midIndex = i;
        			break;
        		}
        	}
        	
        	// 主要判断部分，判断找到的第一个比根元素大的元素之后的元素有没有比根元素小的，如果有，直接返回错误。
        	for(int i = midIndex+1; midIndex >= 0 && i<sequence.length-1;i++){
        		if(sequence[i] < root){
        			return false;
        		}
        	}
        	if(midIndex == -1){
        		int[] b=new int[sequence.length-1];  
        		System.arraycopy(sequence, 0, b, 0, sequence.length-1);
                return b.length>0?VerifySquenceOfBST(b):true;
        	}else{
        	
	        	int[] b=new int[midIndex];  
	        	System.arraycopy(sequence, 0, b, 0, midIndex);
	        	
	        	
	        	int[] c =new int[sequence.length-midIndex-1];  
	        	System.arraycopy(sequence, midIndex, c, 0, sequence.length-midIndex-1);
	        	
	        	boolean flag1 = b.length>0?VerifySquenceOfBST(b):true;
	        	boolean flag2 = c.length>0?VerifySquenceOfBST(c):true;
	        	
	        	
	        	return  flag1&&flag2;
        	}
        }
    }
}
