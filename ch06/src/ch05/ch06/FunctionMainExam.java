package ch06;

public class FunctionMainExam {
	public static void main(String[] args) {
		FunctionExam fe=new FunctionExam();
		//�Ű����� �ް� ����Ÿ���ִ� �޼ҵ� ȣ��
		double result=fe.method1(10, 20);
		System.out.println(result);
		
		//�Ű����� �ް� ����Ÿ�� ���� �޼ҵ� ȣ��
		fe.method2(10, 20);
		
		fe.x=20.0; fe.y=30.0;
		//�Ű����� �����ʰ� ����Ÿ�� �ִ� �޼ҵ� ȣ��
		result = fe.method3();
		System.out.println(result);
		
		//�Ű����� �����ʰ� ����Ÿ�� ���� �޼ҵ� ȣ��
		fe.method4();

	}

}
