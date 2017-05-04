package code;

// 归并排序的代码实现
public class MergeSort {
	// 传入一个数组和其最大最小索引值。
	int count = 0;
	public void mergeSort(int [] data,int low,int high){
		if(low < high){ // 递归结束条件，当数组只有一个值时，不再进行。
			int mid = (low+high)/2;
			mergeSort(data,low,mid);
			mergeSort(data,mid+1,high);
			merge(data,low,mid,high);
		}
		
	}

	// merge()的功能是将前后相邻的两个有序表归并成一个有序表。
	private void merge(int[] data, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int [] temp = new int[high-low+1];

		int i=0,j=0,k=0;	
			
		for(i = low,j = mid+1,k=0;i <= mid && j <= high;k++ ){
			if(data[i] <= data[j]){
				temp[k] = data[i++];
			}else{
				count += mid-i+1;
				temp[k] = data[j++];
			}
		}
					
		while(i <= mid) temp[k++] = data[i++];  
		while(j <= high) temp[k++] = data[j++];
		
		i = 0;
		j = low;
		while(i < temp.length) data[j++] = temp[i++];		
	}
}
