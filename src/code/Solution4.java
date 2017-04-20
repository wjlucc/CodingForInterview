package code;
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
public class Solution4 {
	
	// 利用递归解决
	public int JumpFloor(int target) {
		if(target == 0)
			return 0;
		if(target == 1)
			return 1;
		if(target == 2)
			return 2;
		return JumpFloor(target-1) + JumpFloor(target-2);
    }
	// 是个斐波拉契数列问题
/*	假设现在6个台阶，我们可以从第5跳一步到6，这样的话有多少种方案跳到5就有多少种方案跳到6，
	另外我们也可以从4跳两步跳到6，跳到4有多少种方案的话，就有多少种方案跳到6，
	其他的不能从3跳到6什么的啦，所以最后就是f(6) = f(5) + f(4)；*/
	public int JumpFloor2(int target) {
		if(target == 0)
			return 0;
		if(target == 1)
			return 1;
		if(target == 2)
			return 2;
		int first = 1,second = 2,third = 0;
		for(int i = 3;i <= target;i++){
			third = first + second;
			first = second;
			second = third;
		}
		return third;
			
	}
	
}
