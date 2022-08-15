package collections;

import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {

		// L�FO : Last in firs out seklinde cal�s�r kullan�lmas� tavsiye edilmez stack
		// yerine deque kullan�labilir.
		Stack<Integer> stack = new Stack<>();

		stack.push(15);
		stack.push(44);
		stack.push(8);
		stack.push(16);

		System.out.println(stack.peek());// 16 son giren ilk c�kt�
		System.out.println(stack.size());// 4
		System.out.println(stack.pop()); //16 (ilk eleman� sildi)
		System.out.println(stack.size());// 3
		System.out.println(stack.peek());// 8 ilk eleman 8 oldu.
		System.out.println(stack.empty());// false

	}
}
