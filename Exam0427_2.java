package verify0427;

import java.util.Scanner;

//2. ����ڷκ��� Ű�� �Է¹޾Ƽ�  ǥ��ü���� ����� �� �������
//ü�߰� ���Ͽ� ��ü������, ǥ������, ��ü������ ����Ͻÿ�.
//ǥ��ü��=(Ű -100 ) *0.9
public class Exam0427_2 {
	public static void main(String[] args) {
		double weight,stWeight,height;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		weight = scanner.nextDouble();
		stWeight=(height-100)*0.9;//ǥ��ü��
		if(weight <stWeight) System.out.println("��ü���Դϴ�.");
		else if(weight==stWeight) System.out.println("ǥ���Դϴ�.");
		else System.out.println("��ü���Դϴ�.");
	}
}
