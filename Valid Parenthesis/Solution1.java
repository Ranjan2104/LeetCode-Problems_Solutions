import java.util.Scanner;
import java.util.Stack;

public class ValdiParenthesis {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a test Cases");
			int testCase = sc.nextInt();
			while(testCase-- != 0 ) {
				String s = sc.next();
				Stack<Character> stack = new Stack<>();
				boolean isTrue = true;
				for(int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					if(c == '(' || c == '[' || c == '{') {
						stack.push(c);
						continue;
					}
					if(stack.isEmpty()) {
						isTrue = false;
						break;
					}
					if(c == '}') {
						if(stack.peek() == '{') 
							stack.pop();
						else {
							isTrue = false;
							break;
						}
					}
					if(c == ')') {
						if(stack.peek() == '(') 
							stack.pop();
						else {
							isTrue = false;
							break;
						}
					}
					if(c == '[') {
						if(stack.peek() == ']') 
							stack.pop();
						else {
							isTrue = false;
							break;
						}
					}
				}
				if(!stack.isEmpty()) {
					isTrue = false;
				}
				if (isTrue) 
					System.out.println("is Balanced");
				else 
					System.out.println("is Not Balanced");
			}
		}
	}
}
// Contributed by Amresh Ranjan.
