package ch01;
//Mechanic�� ��ӹ��� Car Ŭ����
public class Car extends Mechanic{
	//�Ӽ�
	Engine engine;
	Tire LeftFrontTire;
	Tire LeftRearTire;
	Tire RightForntTire;
	Tire RightRearTire;
	Handle handle;
	
	//������-default������
	Car(){
	engine=new Engine();
	LeftFrontTire=new Tire();
	LeftRearTire=new Tire();
	RightForntTire=new Tire();
	RightRearTire=new Tire();
	handle=new Handle();
	}
}
