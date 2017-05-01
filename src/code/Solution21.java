package code;

//定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

/*
使用两个ArrayList存放元素，一个存放当前的实际值，一个存放当前的最小值。使用一个int型存放当前栈大小。
ArrayList泛型中要使用Integer 引用类型，不能使用int类型。
栈中需要的方法，有插入元素、元素出栈、返回栈顶、返回长度、返回当前最小元素。
ArrayList 使用get()方法返回指定索引处的元素，使用add(node)直接在末尾添加元素，使用add(index，node)在指定位置添加元素。
也可以不使用ArrayList，直接用两个栈来存放实际元素和当前最小元素，更加方便。
*/

import java.util.ArrayList;

public class Solution21{
	ArrayList<Integer> data = new ArrayList<Integer>();
	ArrayList<Integer> miniData = new ArrayList<Integer>();
	int size = 0;
	
	public void push(int node){
		data.add(size,node);
		if(size == 0){			
			miniData.add(size,node);
		}else{
			if(miniData.get(size-1) < node){
				miniData.add(size,miniData.get(size-1));				
			}else{
				miniData.add(size,node);	
			}			
		}
		size += 1;
	}
	public void pop(){
		size -= 1;		
	}
	public int top(){
		return data.get(size-1);
		
	}
	public int min(){
		return miniData.get(size-1);
	}
}