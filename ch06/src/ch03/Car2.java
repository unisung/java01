package ch03;

public class Car2 
    extends Vehicle{
	//������-�⺻������(default������)
	Car2(){
		System.out.println("Car2 ������");
	}
	//speed���� ������
	int speed=0;
	//�޼ҵ� ������
  void stop() {
	  System.out.println("�ڵ����� �����մϴ�.");
  }
  //�޼ҵ� �߰�
  void fullSpeedUp() {
	  speed=5;
  }
}
