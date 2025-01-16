package Tuhocjava;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh khoi lap phuong: ");
		int a = scanner.nextInt();
		System.out.println("The tich khoi lap phuong: " + Math.pow(a, 3));
		scanner.close();
	}
}
