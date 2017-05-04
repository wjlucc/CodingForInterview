package code;
/*
丑数
把只包含素因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
参考：https://www.nowcoder.com/questionTerminal/6aa9e04fc3794f68acf8778237ba065b
*/
public class Solution32 {
	final int d[] = {2,3,5};
	public int GetUglyNumber_Solution(int index) {
		if(index == 0) return 0;
		
		int a[] = new int[index];
		a[0] = 1;
		int p[] = {0,0,0};
		int num[] = {2,3,5};
		
		int cur = 1;
		
		while(cur < index){
			int m = finMin(num[0],num[1],num[2]);
		}
		
		
        return 0;
    }
	private int finMin(int a,int b,int c){
		return 0;
	}
}
