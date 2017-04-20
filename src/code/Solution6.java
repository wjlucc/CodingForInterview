package code;
// 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
// 始终用第一个栈存放全部元素，入栈时直接进入第二个栈，出栈时先转到第二个栈，将第一个元素pop后再将全部元素转回第一个栈。
import java.util.Stack;

public class Solution6 {

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.add(node);
    }
    
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());            
        }
        int result = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        return result;    
    }
}
