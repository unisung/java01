package ch03;

import java.util.Scanner;

//���׿���: �ǿ������� ���� 3���� ����
public class ConditionalOpExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int score = scanner.nextInt();
		System.out.println(score>70?"pass":"fail");
	}
}
