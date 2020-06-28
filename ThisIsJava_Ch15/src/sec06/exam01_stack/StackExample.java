package sec06.exam01_stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(100)); // 객체 저장
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); // 하나씩 꺼내옴. 선입후출 (LIFO)
			// pop() : 스택의 맨위 객체를 가져옴. 객체를 스택에서 제거한다.
			// peek() : 스택의 맨위 객채를 가져옴. 객체를 스택에서 제거하지 않는다.
			System.out.println("꺼내온 동전 : " + coin.getValue());
			coinBox.size();
		}
	}
}