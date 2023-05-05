package module1;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		System.out.println("Enter the character :");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int ascivalue = ch;
		System.out.println("ASCII value of" +ch+"is :"+ascivalue);
		
		
	}
}
