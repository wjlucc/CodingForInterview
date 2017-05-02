package code;

import java.util.ArrayList;

/*
最小的K个数
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
*/

// 堆排序。。。使用小顶堆，选出k个最小值。时间复杂度O(NlogK)
// 也可以使用冒泡排序，冒泡k次，时间复杂度为O(n*k)
public class Solution28 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		
		ArrayList<Integer> result = new ArrayList<>();
		buildMinHeap(input);
		for(int i = 0;i < k;i++){
			result.add(input[0]);
			input[0] = input[input.length-1-i];
			adjustDown(input,0,input.length-i);	
		}        
		return result;
    }
	
	
	// 先建立一个小顶堆，向下调整算法。
	// 建堆的时候不需要传入长度参数，但是向下调整的时候要传入长度参数。
	public void buildMinHeap(int [] input){
		for(int i = (input.length-1-1)/2;i>=0;i--){ // i从最大下标的父节点开始调整。			
			adjustDown(input,i,input.length);		}
	}
	public void adjustDown(int[] input,int k,int length){
		int temp = input[k];
		for(int i = 2*k+1;i < length;i = i*2 + 1){
			
			if(i+1 < length){
				if(input[i] > input[i+1])
					i += 1;
			}
			if(temp <= input[i]){
				break;
			}else{
				input[k] = input[i];
				k = i;
			}			
		}		
		input[k] = temp;	
	}
	
	public void heapSort(int[] input){
		buildMinHeap(input);
		for(int i = 0; i < input.length-1;i++){
			int temp = input[0];
			input[0] = input[input.length-1-i];
			input[input.length-1-i] = temp;
			adjustDown(input,0,input.length-1-i);
		}
	}
	
	
	public static void printMatax(int[] a){
		for (int i = 0;i < a.length;i++){
			System.out.print(a[i]);
			if(i != a.length-1)
				System.out.print(",");
		}
		System.out.println();
	}
}







