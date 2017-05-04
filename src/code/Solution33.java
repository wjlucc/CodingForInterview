package code;

/*
第一个只出现一次的字符
在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置。如果字符串为空,返回-1

设置一个固定大小的数组。
第一遍遍历字符串，确定每一个字符出现的次数；
第二遍遍历字符串，如果当前出现次数为1，直接返回结果。
注意'A'的ASCII码65小于'a'的ASCII码97。
数组的length是属性，字符串的length()是方法，String.charAt()返回字符串指定位置的字符。
*/
public class Solution33 {
	public int FirstNotRepeatingChar(String str) {
        
        if(str == "") return -1;
        
        int[] data = new int[100];
        for(int i = 0;i<str.length();i++ ){
        	data[str.charAt(i)-'a'] += 1;
        }
        for(int i = 0;i < str.length();i++){
        	if(data[str.charAt(i)-'a'] == 1)
        		return i;
        }
        return 0;
    }
}
