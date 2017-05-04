package code;

import java.util.Arrays;
import java.util.Comparator;

/*
把数组排成最小的数
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
*/

/*
 * 有规律：
 * 两个数字转化成字符串，拼接后比较大小。
 * 若ab > ba 则 a > b，
 * 若ab = ba 则 a = b；
 * 比如 "3" < "31"但是 "331" > "313"，所以要将二者拼接起来进行比较
 *  "331" > "313" 所以有 "3" > "31" 。拼接的最小值为"313" 
 */

/**
 * 1.创建指定长度的数组：int[] a = new int[5];
 * 2.Java中排序使用Arrays.sort()方法进行。需要导包：import java.util.Arrays;
 * 3.可以按照自己的实际要求传入一个实现了Comparator接口中compare方法的对象，实现自定义的排序。
 * 3.5 可以在类中再创建一个内部类，实现Comparator接口中并重写compare方法。将该类的实例对象作为sort()的第二个参数传入。
 * 4.StringBuffer使用append()方法将进行字符串拼接，使用toString()方法转换成String。
 * 
 *
 */




public class Solution31 {
	
	public String PrintMinNumber(int [] numbers) {

		// 先将传来的整数数组转换成string数组。对其进行排序。将排好序的字符串连接起来。
		if(numbers.length == 0){
			return "";
		}
		String[] data = new String[numbers.length];
		for(int i = 0;i < numbers.length;i++){
			data[i] = ""+numbers[i];
		}
		printM(data);
		MyComparator myComparator = new MyComparator();
		Arrays.sort(data,myComparator);
		printM(data);
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i < data.length;i++){
			sb.append(data[i]);
		}
		return sb.toString();

    }
	
	// Java 在类中也可以创建一个类。内部类。
	private class MyComparator implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			String c1 = o1+o2;
			String c2 = o2+o1;
			
			return c1.compareTo(c2);
		}

		
	}
	
	public void printM(String [] data){
		for(int i = 0;i < data.length;i++){
			System.out.print(data[i]);
			if(i != data.length-1)
				System.out.print(",");
		}
		System.out.println();
	}

}
