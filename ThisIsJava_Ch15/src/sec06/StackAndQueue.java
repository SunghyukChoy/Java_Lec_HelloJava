package sec06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		// Stack 클래스 :
		// 후입선출(LIFO : Last In First Out) 구조
		// 응용 예 : JVM 스택 메모리

		Queue<Integer> queue = new LinkedList<Integer>();
		// Queue 인터페이스 :
		// 선입선출(FIFO : First In First Out) 구조
		// 응용 예 : 작업큐, 메시지큐, ...
		// 구현 클래스 : LinkedList
	}
}
