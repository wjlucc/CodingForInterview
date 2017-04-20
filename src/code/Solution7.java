package code;

// 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
// 找规律，最后一步可能为1... n，则有：f(n) = f(n-1)+ ... + f(0),化简可得f(n) = 2*f(n-1)
public class Solution7 {
	public int JumpFloorII(int target) {
        if(target == 0 || target == 1){
            return target;
        }else if(target == 2){
            return 2;
        }else{
            int result = 2;
            for(int i = 3;i <= target;i++){
                result = result*2;
            }
            return result;
        }
    }
}
