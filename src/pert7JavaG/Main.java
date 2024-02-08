package pert7JavaG;

import java.util.Scanner;

public class Main {
Scanner sc = new Scanner(System.in);
int userInput = 0;
	
	public Main() throws ArithmeticException{
//		try {
//			int[] arrays = {1, 2, 3};
//			System.out.println(4/0);			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.err.println("Bilangan tidak bisa dibagi 0");
//		}finally {
//			System.out.println("Code ini tetap dijalankan walaupun error atau tidak");
//		}
//		do {
//			menu();
//			try {
//				userInput = sc.nextInt();
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.err.println("Input menu harus angka!");
//			}
//			sc.nextLine();
//		} while (userInput != 4);
		System.out.println(4/0);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	public void menu() {
		System.out.println("Menu");
		System.out.println("============================");
		System.out.println("1. Add");
		System.out.println("2. Delete");
		System.out.println("3. Update");
		System.out.println("4. Exit");
		System.out.print(">>");
	}
	

}
