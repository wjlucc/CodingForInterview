package code;
//
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。


public class Solution15 {
	 public double Power(double base, int exponent) {
	        double result = base;
	        if(exponent == 0){
	            return 1;
	        }else if(exponent > 0){
	            for(int i = 0;i < exponent-1;i++){
	                result *= base;
	            }
	        }else{
	            for(int i = 0;i < (-exponent)-1;i++ ){
	            	System.out.println(result);
	                result *= base;	                
	            }
	            result = 1.0/result;
	        }   
    
	        return result;
	  }
}
