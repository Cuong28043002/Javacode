package Tuhocjava;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten sinh vien :");
		String name = scanner.nextLine();
		System.out.println("Diem :");
		int Score = scanner.nextInt();
		System.out.println("Sinh vien: " + name + " Co diem so Tb: " + Score);
		scanner.close();
	}

}
