package ch05.ch05;

public class ShapeMainExample {
 static void print(Shape p) {//�޼ҵ��� �Ű��������� ��ü�� ������ ����
	 p.draw();
 }

 public static void main(String[] args) {
       print(new Shape());
       print(new Line());// Shape p = new Line();//promotion
       print(new Rectangle());//Shape p=new Rectangle();//promotion
       print(new Cirlcle());//Shape p=new Circle();//promotion
	}
}
