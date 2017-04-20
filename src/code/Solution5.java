package code;

// 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
public class Solution5 {
	public int Fibonacci(int n) {
		if(n <= 0)
            return 0;
        else if(n == 1 || n == 2)
            return 1;
        else{
            int first = 1,second = 1,third = 0;
            for(int i = 3;i <= n;i++){
                third = first + second;
                first = second;
                second = third;                
            }
            return third;
        }
    }
}
