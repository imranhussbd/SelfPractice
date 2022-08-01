package lec01_java_basics;

import java.util.Stack;

public class StackLoop {

	public static void main(String[] args) {
	
		Stack<Integer> stack = new Stack<>();
 
		stack.push(10);
		stack.push(25);
		stack.push(100);
	
		for (int i=0; i <= stack.size(); i++) {
		
				System.out.println(stack.pop());
			
				
			}
		}
	}

}
