package ch05.ch05;

public class CarMainExample {
	public static void main(String[] args) {
		
		//��ü(instance)������ �ʱ��ʵ尪���� �־���
		//���� ���� �ٸ��� ����.
		//������ ����øŰ������� Ÿ�Կ� �°� ã�Ƽ� �ش� ������ ȣ��
		Car car1 = new Car();//()
		Car car2 = new Car("����");//(String)
		Car car3 = new Car("����","�ҳ�Ÿ");//(String,String)
		Car car4 = new Car(2020,"����","�ҳ�Ÿ");//(int,String,String)
		Car car5 = new Car("����",2020,"�ҳ�Ÿ");//(String,int,String)
		Car car6 = new Car("����","�ҳ�Ÿ",2020);//(String,String,int)
	}
}
