package ch01.ch01;

public class ColorPointEx {
	public static void main(String[] args) {
	 //�θ�ü ����
	 Point p = new Point();
	 p.set(1, 2);//�θ�ü�� private���� ���ѵ� �ɹ��� ����
	 p.showPoint();//public���� �����showPoint()�� private�� ����
	 
	 //�ڽİ�ü ���� 
	 ColorPoint cp = new ColorPoint();
	 cp.set(3, 4);//Point��ü(�θ�)�� set�޼ҵ� ȣ��
	 cp.setColor("red");//�ڽİ�ü���� �߰��� �޼ҵ� ȣ��
	 cp.showColorPoint();//�޼ҵ峻�� showPont()�� ���� private�� ����� �θ��ʵ� x,y����
	 

	}

}
