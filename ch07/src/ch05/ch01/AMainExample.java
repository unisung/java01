package ch05.ch01;

public class AMainExample {
	public static void main(String[] args) {
		//�ڽ�/�ڼ�Ŭ������ ��ü�� �θ�/������ ���������� ���԰���
		A a1 = new A();//promotion
		A a2 = new B();//promotion
		A a3 = new C();//promotion
		A a4 = new D();//promotion
		
		//�ڽ�Ŭ������ ��ü�� �θ��� ���������� ���԰���
		B b = new D();//promotion
		C c = new E();//promotion
		
		//������ ���Ƶ� ���� �ٸ� �θ��� ��ü ������������ �ڽİ�ü ���� �Ұ���
		//B b2 = new E();
		//C c2 = new D();
		
		//B is a A: O,
		//A is a B: X
		B b3 = (B)a2;//ó�� B��ü���ٰ� promtion�� �Ǿ A(�θ�)Ÿ������ ��ȯ�� �ٽ� ����Ÿ������ ȯ��
		//B b4 = (B)a1;//ó�� A(�θ�)Ÿ������ �����Ǿ B(�ڽ�Ÿ��)�� ���ԺҰ�
		//B b4 = (B)(new A());
		
		//���δٸ� �ڽ�Ŭ������ �θ�Ÿ������ promotion�Ǿ��ٰ�
		//���δٸ� �ڽ�Ŭ������ casting�� �Ұ���.
		B b5 =new B();
		A a5 = b5;
		//C c5 = (C)a5;

	}
}
