package ch05.ch08;

public class Weapon {
 protected int fire() {
	 return 1;
 }
 
 public static void main(String[] args) {
	 Weapon weapon;
	 weapon = new Weapon();
	 System.out.println("�⺻ ������ ��� �ɷ���:" +weapon.fire());
	 
	 weapon = new Cannon();
	 System.out.println("������ ��� �ɷ���:" +weapon.fire());
	 
 }
}

class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
}
