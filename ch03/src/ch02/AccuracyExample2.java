package ch02;
//��Ȯ�� ���� �ε��Ҽ��� Ÿ�� �����������
public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple*10;
		int number=7;
		int temp = totalPieces - number;
		double result = temp/10.0;
		
		System.out.println("��� �Ѱ����� 0.7 ������ ����,");
		System.out.println(result +"������ ���´�");
		
	}
}
