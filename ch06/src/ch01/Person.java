package ch01;

public class Person {
	String name;
	int age;
	Calculator calcualtor;
	//������ Ŭ������� ���� �޼ҵ�����
	//������ ��ü�� �ʵ尪 �ʱ�ȭ �ϴ� ����
	Person(){
	name="ȫ�浿";
	age=13;
	calcualtor
	 =new Calculator();				
	}
	
	public void getResult() {
		System.out.println(
				calcualtor.add(10, 20));
	}
}
