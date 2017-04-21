package code;
/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*/
public class Solution9 {
	public int minNumberInRotateArray(int [] array) {
		if(array.length == 0)
			return 0;
		
	    int l = 0,r = array.length;
	    int mid = (l+r)/2;
	    while(l <= r){
	    	if(l+1 == r){
	    		return array[r];
	    	}
	    	if(array[mid] > array[l]){
	    		// 中间的当前处于第一个子串中
	    		l = mid;
	    	}else if(array[mid] < array[l]){
	    		// 中间元素处于第二个子串中
	    		r = mid;
	    	}
	    	mid = (l+r)/2;
	    }
				
		return 0; // 这一句没有什么作用，循环中的return 一定会执行
    }
}
