package ch02;

public class ForDiceExample1 {
	public static void main(String[] args) {
	   int dice1;
	   int dice2;
	   
	   for(;;) {
		   dice1=(int)(Math.random()*6)+1;//1~6 ����
		   dice2=(int)(Math.random()*6)+1;//1~6 ����
		   if(dice1+dice2==6) break;//�ݺ� �� ���������� ��ɹ�;
		   System.out.println("dice1="+dice1+",dice2="+dice2);
	   }
	   System.out.println("6�̵Ǵ� �ֻ��� ����:"+dice1+","+dice2);
	}
}
