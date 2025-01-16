package Tuhocjava;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println(" Nhap chieu rong hinh cn: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(" Nhap chieu dai hinh cn: ");
		int b = scanner.nextInt();
		int c = (a + b) * 2;
		int d = a * b;
		int e = Math.min(a, b);
		System.out.println(" Chu vi hinh cn: " + c);
		System.out.println(" Dien tich hinh cn: " + d);
		System.out.println(" Canh nho nhat: " + e);

		scanner.close();
	}

}
