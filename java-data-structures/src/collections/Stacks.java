package collections;

import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {

		// LÝFO : Last in firs out seklinde calýsýr kullanýlmasý tavsiye edilmez stack
		// yerine deque kullanýlabilir.
		Stack<Integer> stack = new Stack<>();

		stack.push(15);
		stack.push(44);
		stack.push(8);
		stack.push(16);

		System.out.println(stack.peek());// 16 son giren ilk cýktý
		System.out.println(stack.size());// 4
		System.out.println(stack.pop()); //16 (ilk elemaný sildi)
		System.out.println(stack.size());// 3
		System.out.println(stack.peek());// 8 ilk eleman 8 oldu.
		System.out.println(stack.empty());// false

	}
}
