package ch02.verify02;
//2. ������ �Է¹޾Ƽ� Ȧ���̸� Ȧ�����,
//¦���̸� ¦���� ����ϴ� ���α׷��� �ۼ��ϼ���
//�ݺ����θ� ����� y,Y�� �Է¹����� ���
//n,N�� �Է¹����� �����ϴ� ���� ����

import java.util.Scanner;

public class EvenOddExam {
	public static void main(String[] args) {
		//Ű����� ���� �Է¹޴� Scanner�ν��Ͻ� ����
		Scanner scanner = new Scanner(System.in);
		boolean isRun=true;
		
		while(isRun) {
			System.out.println("���ڸ� �Է��ϼ���");
			int num = scanner.nextInt();
			if(num%2==0) {//�Է¹��� ���ڸ� 2�� ���� �������� 0 �̸� ��
				System.out.println("¦��");
			}else {
				System.out.println("Ȧ��");
			}
			
			System.out.println("����ұ��?");
			char yesNo=scanner.next().charAt(0);
			if(yesNo=='n'||yesNo=='N') {
				isRun = !isRun;
			}
		}
		System.out.println("���α׷� ����");
		
		//�ڿ� ����
		scanner.close();
	}

}
