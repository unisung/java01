package ch06.ch02;

//�߻�Ŭ����
public abstract class Animal {
	//�߻�޼ҵ�-��ӹ��� Ŭ�������� �ݵ�� ������ �ؾ��ϴ� �޼ҵ�
	abstract void fly();
	//�Ϲݸ޼ҵ� -�ڽ�Ŭ�������� ��ӹ��� �״�� ����ϴ� ���
	void stop() {
		System.out.println("����");
	}
}
class Bird extends Animal{
	@Override
	void fly() {
		System.out.println("����");
	}}
class Insect extends Animal{
	@Override
	void fly() {
		System.out.println("��¦�ٴ�");
	}}
class Fish extends Animal{
	@Override
	void fly() {
		System.out.println("���ġ��");
	}
}