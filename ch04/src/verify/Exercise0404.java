package verify;
//4. while���� Math.random()�޼ҵ带 �̿��ؼ� �ֻ��� �� ���
// �� ���� ���� 5�̸� ����
public class Exercise0404 {
	public static void main(String[] args) {
		while(true) {
			 //double dice1= Math.random();
			 int dice1 = (int)(Math.random()*6)+1;//1~6 ����
			 int dice2 = (int)(Math.random()*6)+1;//1~6 ����
			 System.out.println("("+dice1+","+dice2+")");
			 if(dice1+dice2==5) break;
		}
	}
}
