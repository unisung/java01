package ch03;
//�񱳿�����: �� �� ������ �� ��� �� true/false
public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
	System.out.println(num1==num2);//������ ��
	System.out.println(num1!=num2);//�ٸ��� ��
	System.out.println(num1<=num2);//num1�� num1���� �۰ų� ������ ��

	char char1 = 'A';
	char char2 = 'B';
	boolean result = char1<char2;// 65 < 66 
	System.out.println("result="+result);
		
	int age=25;
	//System.out.println(20<=age<30); ����
	System.out.println((20<=age) & (age<30));
	
	}
}
