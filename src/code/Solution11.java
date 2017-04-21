package code;

// 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
// 这类题可以从n=0开始找规律，找规律时注意情况要划分好。
// 这是一个斐波那契数列问题，先计算前几个的数目。划分情况根据竖着的来划分。

public class Solution11 {
	public int RectCover(int target) {

		if(target <= 2){
			return target;
		}
		int first = 1,second = 2,third = 0;
		for(int i = 3;i <= target;i++){
			third = first + second;
			first = second;
			second = third;
			
		}
		return third;
    }
}
