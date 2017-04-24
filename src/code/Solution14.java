package code;

/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*/

// 先使用冒泡的方式来解决
public class Solution14 {
	public void reOrderArray(int [] array) {
		
        for(int i = 0;i < array.length-1;i++)
        {
        	print(array);
        	int flag = 0;
        	for(int j = 0;j < array.length-2-i;j++){
        		if(array[j] %2 == 0 && array[j+1]%2 == 1){
        			flag = 1;
        			int temp = array[j];
        			array[j] = array[j+1];
        			array[j+1] = temp;
        		}
        	}
        	if(flag == 0)
        		return;
        }
    }
	public void print(int[] array){
		for(int i = 0;i < array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
