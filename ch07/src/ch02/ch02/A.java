package ch02.ch02;

//��ӹ��� �ڽ�Ŭ�������� �θ�Ŭ������ ������ ȣ���
//�ڽĻ����ڿ� super()�޼ҵ带 ������ �������� ���� ���
//�θ�Ŭ������ �⺻�����ڸ� ȣ����.
public class A {
  A(){
	  System.out.println("������A");
  }
  A(int x){
	  System.out.println("x�� �ִ� ������A");
  }
}

class B extends A{
	B(){
		super();
		System.out.println("������B");
	}
}