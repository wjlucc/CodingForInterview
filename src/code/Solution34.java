package code;
/*
数组中的逆序对
题目描述
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
并将P对1000000007取模的结果输出。 即输出P%1000000007 
输入描述:
题目保证输入的数组中没有的相同的数字
数据范围：
	对于%50的数据,size<=10^4
	对于%75的数据,size<=10^5
	对于%100的数据,size<=2*10^5
输入例子:
1,2,3,4,5,6,7,0
输出例子:
7
*/

/*
 *  求逆序对要使用归并排序的思想，时间复杂度是O(nlogn)；
 *  
 */
/*
观察归并排序——合并数列(1，3，5)与(2，4)的时候：
1．先取出前面数列中的1。
2．然后取出后面数列中的2，明显！这个2和前面的3，5都可以组成逆序数对即3和2，5和2都是逆序数对。
3．然后取出前面数列中的3。
4．然后取出后面数列中的4，同理，可知这个4和前面数列中的5可以组成一个逆序数对。
这样就完成了逆序数对的统计，归并排序的时间复杂度是O(N * LogN)，因此这种从归并排序到数列的逆序数对的解法的时间复杂度同样是O(N * LogN).
*/
public class Solution34 {
	public int InversePairs(int [] array) {        
		return mergeSort(array, 0, array.length-1)%1000000007;
    }
	public int mergeSort(int [] data,int low,int high){
		
		Integer count = 0;
		if(low < high){ // 递归结束条件，当数组只有一个值时，不再进行。
			int mid = (low+high)/2;
			count += mergeSort(data,low,mid);
			count += mergeSort(data,mid+1,high);
			count += merge(data,low,mid,high)%1000000007;
		}
		return count;
		
	}
	// merge()的功能是将前后相邻的两个有序表归并成一个有序表。
		private int merge(int[] data, int low, int mid, int high) {
			// TODO Auto-generated method stub
			int [] temp = new int[high-low+1];

			int i=0,j=0,k=0,count = 0;	
				
			for(i = low,j = mid+1,k=0;i <= mid && j <= high;k++ ){
				if(data[i] <= data[j]){
					temp[k] = data[i++];
				}else{
					count += mid-i+1;
					count = count%1000000007; 
					temp[k] = data[j++];
				}
			}
						
			while(i <= mid) temp[k++] = data[i++];  
			while(j <= high) temp[k++] = data[j++];
			
			i = 0;
			j = low;
			while(i < temp.length) data[j++] = temp[i++];	
			return count%1000000007;
		}
	
	
}
