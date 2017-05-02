package code;

/*Problem27：数组中出现次数超过一半的数字
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。	
*/
/*
思路一：直接使用Java中的HashMap遍历的同时进行统计，如果满足要求，直接返回，否则返回0；
思路二：用两个指标l和r从数组左端和右端同时遍历，如果l和r的值不同，同时移动两个指标。如果相同，则在l和r之间找一个与之不同的值和l所指的值交换。
	如果l和r之间的所有值都和l与r的相同，则遍历结束。
	遍历结束后，如果（l > r && array[l] != array[r]） 则一定返回0；
	其他如l==r 或者 l < r 则说明l与r之间的值都相同。遍历一遍数组，计数array[l]的个数，判断是否满足要求。

*/
import java.util.HashMap;

public class Solution27 {
	
	// 直接使用HashMap来处理。
	public int MoreThanHalfNum_Solution(int [] array) {
		
		HashMap<Integer, Integer> data = new HashMap<>(); 
        for(int i=0;i<array.length;i++){
        	if(data.containsKey(array[i])){
        		data.put(array[i], data.get(array[i])+1);        		
        	}else{
        		data.put(array[i], 1);
        	}
        	
        	if(data.get(array[i]) > array.length*1.0/2){
    			return array[i];
        	}
        }
        
        return 0;
    }
	
	// 从数组中每次删除不同的两个数字。
	public int MoreThanHalfNum_Solution2(int [] array) {
	
		if(array.length == 1){
			return array[0];
		}
		
		int l = 0, r = array.length-1;
		
		while(l < r){
			if(array[l] != array[r]){
				l += 1;
				r -= 1;
			}else{
				int index = -1;
				
				for(int i = l+1;i < r;i++){
					if(array[i] != array[l]){
						index = i;
						break;
					}					
				}
				
				if(index == -1){					
					break;
				}else{					
					int temp = array[l];
					array[l] = array[index];
					array[index] = temp;
				}
			}
		}
		
		if(l > r && array[l] != array[r]){
			return 0;
		}else{
			int count = 0;
			for(int i = 0;i < array.length;i++){
				if(array[i] == array[l]){
					count += 1;
				}
			}
			if(count > array.length*1.0/2){
				return array[l];
				
			}else{
				return 0;
			}
		}	
	}
}
