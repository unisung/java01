package ch02.ch01;

//��ӹ��� �ڽ�Ŭ������ ������
//ù�ٿ� �θ�Ŭ������ ������ȣ��޼ҵ� super()��
//����
public class A extends Object{
  A(){
	  super();
	  System.out.println("A������ ����");
  }
}

class B extends A{
	B(){
		super();
		System.out.println("B������ ����");
	}
}
class C extends B{
	C(){
		super();//super()�޼ҵ�� �ݵ�� ù�߿� ��ġ�ؾ���.
		System.out.println("C������ ����");
		//super();
	}
}
