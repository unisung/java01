package ch06.ch02;
//�⺻Ÿ���� ���� �޼ҵ��� �Ű������� ���޵ɶ��� ���� ����Ǿ� ���޵�.
public class ValuePassingExample {
	public static void main(String[] args) {
		int n=10;
		//n�� ��10�� ����Ǿ increase�Լ��� �Ű������� ���޵�.
		increase(n);
		
		System.out.println("n:"+n);
	}
	//�Ű�����(����,�ƱԸ�Ʈ,�μ�)�� �ް� ���� �������� �ʴ� �޼ҵ�
	static void increase(int m) {
		m=m+1;
		System.out.println("m:"+m);
	}
}
