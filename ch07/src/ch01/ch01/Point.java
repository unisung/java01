package ch01.ch01;

public class Point {
	//private�� ���������� �ɹ��� ��� �Ұ�
	private int x, y;
	//public���� ���������� ����� ��� ����
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
//���ϻ��
class ColorPoint extends Point{
	//�ڽ�Ŭ�������� �߰��� �ɹ�
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();//�θ�Ŭ������ public���������ڷ� ����� �޼ҵ� ȣ��
	}
}
