package verify;

import java.util.Scanner;

//7.while���� Scanner�̿� ����,���,��ȸ, ���� 
public class Exercise0407 {
	public static void main(String[] args) {
		boolean run=true;
		
		int balance=0;//�ܰ� �ʱ�ȭ
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.���� |2.��� |3.�ܰ� |4.����");
			System.out.println("-------------------------");
			System.out.println("����>");
			int menu=scanner.nextInt();
			
			switch(menu) {
			case 1: System.out.println("���ݾ�>");
			        balance+=scanner.nextInt();
			        break;
			case 2: System.out.println("��ݾ�>");
			        int amount = scanner.nextInt();
			        if(balance - amount<0) {
			        	System.out.println("��ݾ��� �ܰ��� �����ϴ�.");
			        	continue;
			        }
			        balance-=amount;
			        break;
			case 3: System.out.println("�ܰ�>"+balance);
			        break;
			case 4: run=false;
			        System.out.println("���α׷� ����");
			}
		}
	}
}
