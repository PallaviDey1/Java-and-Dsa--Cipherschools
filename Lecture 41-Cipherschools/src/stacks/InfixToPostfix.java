package stacks;

import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[]args) {
		String infix="3+4*5";
		String infix2="3*4+5";
		System.out.println(infixToPostfix(infix));
		System.out.println(infixToPostfix(infix2));
	}
	static String infixToPostfix(String infix)
	{
		String res = "";
		Stack<Character> stack = new Stack();
		for(int i=0;i<infix.length();i++) {
			char c = infix.charAt(i);
			if(Character.isDigit(c))
			{
				res = res+c;
			}
			else
			{
				while(!stack.isEmpty() && Precedence(stack.peek())>Precedence(c))
				{
					res=res+stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
		{
			res=res+stack.pop();
		}
		return res;
	}
	static int Precedence(char c)
	{
		if(c=='+' || c=='-' ) return 1;
		if(c=='*' || c=='/' ) return 2;
		return -1;
	}

}
