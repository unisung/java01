package ch10.ch02;

public class StaticBlockExample {
	//�ν��Ͻ� �ɹ�
	int field1;
	void method1() {}
	
	//static�ɹ�
	static int field2;
	static void method2() {}
	
	//static�ʱ�ȭ ��
	static {
		//field1=10;//static�ʱ�ȭ ������ �ν��Ͻ��ɹ��� �ü� ����
		//method1();//static�ʱ�ȭ ������ �ν��Ͻ��ɹ��� �ü� ����
		field2=10;
		method2();	
	}
	//static�޼ҵ� 
	static void method3() {
		//this.feidl1=10;//static�ɹ����� �ν��Ͻ��� ����Ű�� this�� �ü� ����
		//this.method1();//static�ɹ����� �ν��Ͻ��� ����Ű�� this�� �ü� ����
		field2=10;
		method2();
	}
}
