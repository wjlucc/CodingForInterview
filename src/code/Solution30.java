package code;
/*
整数中1出现的次数（从1到n整数中1出现的次数）
	求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
	为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
	ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
	注意这个是出现的总次数，而不是出现这个数的次数。如 1、10、11、12、13 中数字1出现了6次，而不是5次。
思路：
最直接的做法是从0遍历到n，对于每一个数字转换成string，判断每一位是不是'1'字符，包含的话+1，可以暴力解决出来。

具体规律
	1. 如果第i位（自右至左，从1开始标号）上的数字为0，则第i位可能出现1的次数由更高位决定（若没有高位，视高位为0），等于更高位数字X当前位数的权重10i-1。
	2. 如果第i位上的数字为1，则第i位上可能出现1的次数不仅受更高位影响，还受低位影响（若没有低位，视低位为0），等于更高位数字X当前位数的权重10i-1+（低位数字+1）。
	3. 如果第i位上的数字大于1，则第i位上可能出现1的次数仅由更高位决定（若没有高位，视高位为0），等于（更高位数字+1）X当前位数的权重10i-1。
	参考博客中的转载。
	
*/
public class Solution30 {
	public int NumberOf1Between1AndN_Solution(int n) {
	 
		if(n == 0)
			return 0;
		
		int high,low,curr,tmp,i = 1;
		high = n;
		int total = 0;
		while(high > 0){
			high = n/(int)Math.pow(10, i);
			tmp = n%(int)Math.pow(10, i);			
			curr = tmp/(int)Math.pow(10,i-1);
			low = tmp%(int)Math.pow(10, i-1);
			
			
			if(curr < 1){
				total += high*Math.pow(10, (i-1));
			}else if(curr > 1){
				total += (high+1)*Math.pow(10, i-1);
			}else{
				total += high*Math.pow(10, i-1)+(low+1);
			}
			
			i++;
									
		}
		

		return total;
    }

	
}
