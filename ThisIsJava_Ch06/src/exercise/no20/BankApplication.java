package exercise.no20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}			
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		
	}
	private static void accountList() {
		
	}
	private static void deposit() {
		
	}
	private static void withdraw() {
	
	}
	
	//accountArray 배열에서 ano와 동일한 Account 객체 찾기
//	private static Account findAccount(String ano) {
//		
//	}

}
