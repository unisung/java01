package ch02;
import java.util.Scanner;
//������
public class WhileExample1 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
	while(true) {//���� loop
		System.out.println("����� ���� ���� �Է��ϼ���:");
		num=scanner.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.print(num+"x"+i+"="+(num*i)+"\t");
		}
		System.out.println();//���� �Ʒ���
		System.out.println("����ұ��?");
		 char yesNo=scanner.next().charAt(0);
		 if(yesNo=='n' || yesNo=='N') break;
	 }
	System.out.println("���α׷� ����");
	}
}
